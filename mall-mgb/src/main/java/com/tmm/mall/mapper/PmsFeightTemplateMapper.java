package com.tmm.mall.mapper;

import com.tmm.mall.model.PmsFeightTemplate;
import com.tmm.mall.model.PmsFeightTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsFeightTemplateMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_feight_template
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    long countByExample(PmsFeightTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_feight_template
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    int deleteByExample(PmsFeightTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_feight_template
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_feight_template
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    int insert(PmsFeightTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_feight_template
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    int insertSelective(PmsFeightTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_feight_template
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    List<PmsFeightTemplate> selectByExample(PmsFeightTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_feight_template
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    PmsFeightTemplate selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_feight_template
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    int updateByExampleSelective(@Param("record") PmsFeightTemplate record, @Param("example") PmsFeightTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_feight_template
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    int updateByExample(@Param("record") PmsFeightTemplate record, @Param("example") PmsFeightTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_feight_template
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    int updateByPrimaryKeySelective(PmsFeightTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_feight_template
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    int updateByPrimaryKey(PmsFeightTemplate record);
}