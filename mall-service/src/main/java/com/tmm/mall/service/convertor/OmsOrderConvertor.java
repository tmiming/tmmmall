package com.tmm.mall.service.convertor;

import com.tmm.mall.api.dto.OmsOrderDto;
import com.tmm.mall.model.OmsOrder;
import com.tmm.mall.support.convertor.AbstractConvertor;
import org.springframework.stereotype.Component;

/**
 * @Author： tangmingming
 * @Date: 2020-10-26 17:38
 * @Version： 1.0
 */

@Component
public class OmsOrderConvertor extends AbstractConvertor<OmsOrderDto, OmsOrder> {

    @Override
    protected OmsOrderDto copy(OmsOrder entity){
        OmsOrderDto omsOrderDto = new OmsOrderDto();
        omsOrderDto.setAutoConfirmDay(entity.getAutoConfirmDay());
        omsOrderDto.setBillContent(entity.getBillContent());
        omsOrderDto.setBillHeader(entity.getBillHeader());
        omsOrderDto.setBillReceiverEmail(entity.getBillReceiverEmail());
        omsOrderDto.setBillReceiverPhone(entity.getBillReceiverPhone());
        omsOrderDto.setBillType(entity.getBillType());
        omsOrderDto.setCommentTime(entity.getCommentTime());
        omsOrderDto.setConfirmStatus(entity.getConfirmStatus());
        omsOrderDto.setCouponAmount(entity.getCouponAmount());
        omsOrderDto.setCouponId(entity.getCouponId());
        omsOrderDto.setCreateTime(entity.getCreateTime());
        omsOrderDto.setDeleteStatus(entity.getDeleteStatus());
        omsOrderDto.setDeliveryCompany(entity.getDeliveryCompany());
        omsOrderDto.setDeliverySn(entity.getDeliverySn());
        omsOrderDto.setDeliveryTime(entity.getDeliveryTime());
        omsOrderDto.setDiscountAmount(entity.getDiscountAmount());
        omsOrderDto.setFreightAmount(entity.getFreightAmount());
        omsOrderDto.setGrowth(entity.getGrowth());
        omsOrderDto.setId(entity.getId());
        omsOrderDto.setIntegration(entity.getIntegration());
        omsOrderDto.setIntegrationAmount(entity.getIntegrationAmount());
        omsOrderDto.setMemberId(entity.getMemberId());
        omsOrderDto.setMemberUsername(entity.getMemberUsername());
        omsOrderDto.setModifyTime(entity.getModifyTime());
        omsOrderDto.setNote(entity.getNote());
        omsOrderDto.setOrderSn(entity.getOrderSn());
        omsOrderDto.setOrderType(entity.getOrderType());
        omsOrderDto.setPayAmount(entity.getPayAmount());
        omsOrderDto.setPaymentTime(entity.getPaymentTime());
        omsOrderDto.setPayType(entity.getPayType());
        omsOrderDto.setPromotionAmount(entity.getPromotionAmount());
        omsOrderDto.setPromotionInfo(entity.getPromotionInfo());
        omsOrderDto.setReceiverCity(entity.getReceiverCity());
        omsOrderDto.setReceiverDetailAddress(entity.getReceiverDetailAddress());
        omsOrderDto.setReceiverName(entity.getReceiverName());
        omsOrderDto.setReceiverPhone(entity.getReceiverPhone());
        omsOrderDto.setReceiverPostCode(entity.getReceiverPostCode());
        omsOrderDto.setReceiverProvince(entity.getReceiverProvince());
        omsOrderDto.setReceiverRegion(entity.getReceiverRegion());
        omsOrderDto.setReceiveTime(entity.getReceiveTime());
        omsOrderDto.setSourceType(entity.getSourceType());
        omsOrderDto.setStatus(entity.getStatus());
        omsOrderDto.setTotalAmount(entity.getTotalAmount());
        omsOrderDto.setUseIntegration(entity.getUseIntegration());
        return omsOrderDto;
    }
}
