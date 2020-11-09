package com.tmm.mall.api;

import com.tmm.mall.api.dto.OmsOrderDto;
import com.tmm.mall.api.request.order.QueryOrderRequest;
import java.util.List;

/**
 * @Author： tangmingming
 * @Date: 2020-10-26 17:17
 * @Version： 1.0
 */


public interface OrderService {

    /**
     * 订单信息查询
     * @param request
     * @return
     */
    List<OmsOrderDto> queryList(QueryOrderRequest request);

}
