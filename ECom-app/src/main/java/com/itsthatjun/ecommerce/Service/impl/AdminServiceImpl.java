package com.itsthatjun.ecommerce.Service.impl;

import com.itsthatjun.ecommerce.dao.AdminPermissionDao;
import com.itsthatjun.ecommerce.dto.CustomUserDetail;
import com.itsthatjun.ecommerce.mbg.mapper.AdminMapper;
import com.itsthatjun.ecommerce.mbg.model.Admin;
import com.itsthatjun.ecommerce.mbg.model.AdminExample;
import com.itsthatjun.ecommerce.mbg.model.Permission;
import com.itsthatjun.ecommerce.security.jwt.JwtTokenUtil;
import com.itsthatjun.ecommerce.Service.AdminService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Date;
import java.util.List;

@Service
public class AdminServiceImpl implements UserDetailsService, AdminService {

    @Autowired
    private final AdminMapper adminMapper;

    private final JwtTokenUtil jwtTokenUtil;

    private final AdminPermissionDao adminPermissionDao;

    @Autowired
    public AdminServiceImpl(AdminMapper adminMapper, JwtTokenUtil jwtTokenUtil, AdminPermissionDao adminPermissionDao) {
        this.adminMapper = adminMapper;
        this.jwtTokenUtil = jwtTokenUtil;
        this.adminPermissionDao = adminPermissionDao;
    }

    @Override
    public String login(String username, String password) {
        String token = "";
        try{
            UserDetails userDetails = loadUserByUsername(username);
            // decode password to compare
            if(!passwordEncoder().matches(password, userDetails.getPassword())){
                throw new BadCredentialsException("incorrect password");
            }
            UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(
                    userDetails, null, Collections.emptyList());
            SecurityContextHolder.getContext().setAuthentication(authentication);
            token = jwtTokenUtil.generateToken(userDetails);
        } catch (AuthenticationException e) {
            System.out.println("login error");
        }
        return token;
    }

    @Override
    public String register(Admin newAdmin) {
        newAdmin.setCreateTime(new Date());
        newAdmin.setStatus("active");
        AdminExample example = new AdminExample();
        example.createCriteria().andUsernameEqualTo(newAdmin.getUsername());
        List<Admin> existing = adminMapper.selectByExample(example);
        if(!existing.isEmpty()) return null;
        newAdmin.setPassword(passwordEncoder().encode(newAdmin.getPassword()));
        adminMapper.insert(newAdmin);
        return null;
    }

    @Override
    public Admin getAdminByUsername(String username) {
        AdminExample example = new AdminExample();
        example.createCriteria().andUsernameEqualTo(username);
        List<Admin> AdminList = adminMapper.selectByExample(example);
        if(AdminList != null && !AdminList.isEmpty()){
            return AdminList.get(0);
        }
        return null;
    }

    @Override
    public List<Permission> getPermissionList(int id) {
        return adminPermissionDao.getPermissionList(id);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Admin admin = getAdminByUsername(username);
        if(admin != null){
            List<Permission> permissions = getPermissionList(admin.getId());
            return new CustomUserDetail(admin, permissions);
        }
        throw new UsernameNotFoundException("Username not found");
    }

    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}