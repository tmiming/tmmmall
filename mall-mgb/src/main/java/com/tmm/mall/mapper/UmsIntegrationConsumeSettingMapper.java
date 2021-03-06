package com.tmm.mall.mapper;

import com.tmm.mall.model.UmsIntegrationConsumeSetting;
import com.tmm.mall.model.UmsIntegrationConsumeSettingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsIntegrationConsumeSettingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_integration_consume_setting
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    long countByExample(UmsIntegrationConsumeSettingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_integration_consume_setting
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    int deleteByExample(UmsIntegrationConsumeSettingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_integration_consume_setting
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_integration_consume_setting
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    int insert(UmsIntegrationConsumeSetting record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_integration_consume_setting
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    int insertSelective(UmsIntegrationConsumeSetting record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_integration_consume_setting
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    List<UmsIntegrationConsumeSetting> selectByExample(UmsIntegrationConsumeSettingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_integration_consume_setting
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    UmsIntegrationConsumeSetting selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_integration_consume_setting
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    int updateByExampleSelective(@Param("record") UmsIntegrationConsumeSetting record, @Param("example") UmsIntegrationConsumeSettingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_integration_consume_setting
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    int updateByExample(@Param("record") UmsIntegrationConsumeSetting record, @Param("example") UmsIntegrationConsumeSettingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_integration_consume_setting
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    int updateByPrimaryKeySelective(UmsIntegrationConsumeSetting record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_integration_consume_setting
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    int updateByPrimaryKey(UmsIntegrationConsumeSetting record);
}