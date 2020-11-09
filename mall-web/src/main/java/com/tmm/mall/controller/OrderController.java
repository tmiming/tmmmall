package com.tmm.mall.controller;

import com.tmm.mall.api.OrderService;
import com.tmm.mall.api.dto.OmsOrderDto;
import com.tmm.mall.api.request.order.QueryOrderRequest;
import com.tmm.mall.api.response.base.ListResponse;
import com.tmm.mall.common.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.cache.CacheProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * @Author： tangmingming
 * @Date: 2020-10-27 10:58
 * @Version： 1.0
 */

@RestController
public class OrderController {

    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService){
        this.orderService = orderService;
    }

    @GetMapping(value="/order/list")
    public ListResponse<OmsOrderDto> list(QueryOrderRequest request){
        List<OmsOrderDto> list = orderService.queryList(request);
        return ListResponse.of(list);
    }
}
