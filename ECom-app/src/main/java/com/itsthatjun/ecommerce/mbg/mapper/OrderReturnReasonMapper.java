package com.itsthatjun.ecommerce.mbg.mapper;

import com.itsthatjun.ecommerce.mbg.model.OrderReturnReason;
import com.itsthatjun.ecommerce.mbg.model.OrderReturnReasonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderReturnReasonMapper {
    long countByExample(OrderReturnReasonExample example);

    int deleteByExample(OrderReturnReasonExample example);

    int insert(OrderReturnReason record);

    int insertSelective(OrderReturnReason record);

    List<OrderReturnReason> selectByExample(OrderReturnReasonExample example);

    int updateByExampleSelective(@Param("record") OrderReturnReason record, @Param("example") OrderReturnReasonExample example);

    int updateByExample(@Param("record") OrderReturnReason record, @Param("example") OrderReturnReasonExample example);
}