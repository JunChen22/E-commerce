package com.itsthatjun.spring.ecommerce.Service.impl;

import com.itsthatjun.spring.ecommerce.Service.MemberReadHistoryService;
import com.itsthatjun.spring.ecommerce.mongodb.Document.MemberReadHistory;
import com.itsthatjun.spring.ecommerce.mongodb.Repository.MemberReadHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberReadHistoryImpl implements MemberReadHistoryService {

    @Autowired
    private MemberReadHistoryRepository memberReadHistoryRepository;

    @Override
    public int create(MemberReadHistory memberReadHistory) {
        System.out.println("at creating member history");
        memberReadHistoryRepository.save(memberReadHistory);
        System.out.println(memberReadHistory.getMemberNickname() + " saved");
        return 0;
    }

    @Override
    public List<MemberReadHistory> list(String memberId) {
        return memberReadHistoryRepository.findAllById(memberId);
    }
}