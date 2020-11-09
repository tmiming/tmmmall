package com.tmm.mall.core.order.manager.impl;

import com.tmm.mall.core.order.manager.OrderManager;
import com.tmm.mall.mapper.OmsOrderMapper;
import com.tmm.mall.model.OmsOrder;
import com.tmm.mall.model.OmsOrderExample;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author： tangmingming
 * @Date: 2020-11-02 15:32
 * @Version： 1.0
 */

@Service
public class OrderManagerImpl implements OrderManager {

    private final OmsOrderMapper orderMapper;

    public OrderManagerImpl(OmsOrderMapper orderMapper){
        this.orderMapper = orderMapper;
    }

    @Override
    public List<OmsOrder> listOrder() {
        OmsOrderExample example = new OmsOrderExample();
        OmsOrderExample.Criteria criteria = example.createCriteria();
        criteria.andIdLessThan(100L);
        orderMapper.selectByExample(example);
        List<OmsOrder> omsOrders = orderMapper.selectByExample(example);
        return omsOrders;
    }
}
