package com.tmm.mall.service.impl;

import com.tmm.mall.api.OrderService;
import com.tmm.mall.api.dto.OmsOrderDto;
import com.tmm.mall.api.request.order.QueryOrderRequest;
import com.tmm.mall.common.service.RedisService;
import com.tmm.mall.core.order.manager.OrderManager;
import com.tmm.mall.service.convertor.OmsOrderConvertor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author： tangmingming
 * @Date: 2020-02-27 14:15
 * @Version： 1.0
 */
@Component
public class OrderServiceImpl implements OrderService {

    private final OrderManager orderManager;

    private final OmsOrderConvertor orderConvertor;

//    private final RedisService redisService;


    @Autowired
    public OrderServiceImpl(OrderManager orderManager,
                            OmsOrderConvertor orderConvertor
                            ) {
        this.orderManager = orderManager;
        this.orderConvertor = orderConvertor;
    }


    @Override
    public List<OmsOrderDto>  queryList(QueryOrderRequest request) {
        List<OmsOrderDto> convertResult = orderConvertor.convert(orderManager.listOrder());
        return convertResult;
    }
}
