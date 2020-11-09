package com.tmm.mall.mapper;

import com.tmm.mall.model.PmsProductVertifyRecord;
import com.tmm.mall.model.PmsProductVertifyRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsProductVertifyRecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_vertify_record
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    long countByExample(PmsProductVertifyRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_vertify_record
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    int deleteByExample(PmsProductVertifyRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_vertify_record
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_vertify_record
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    int insert(PmsProductVertifyRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_vertify_record
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    int insertSelective(PmsProductVertifyRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_vertify_record
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    List<PmsProductVertifyRecord> selectByExample(PmsProductVertifyRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_vertify_record
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    PmsProductVertifyRecord selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_vertify_record
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    int updateByExampleSelective(@Param("record") PmsProductVertifyRecord record, @Param("example") PmsProductVertifyRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_vertify_record
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    int updateByExample(@Param("record") PmsProductVertifyRecord record, @Param("example") PmsProductVertifyRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_vertify_record
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    int updateByPrimaryKeySelective(PmsProductVertifyRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_vertify_record
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    int updateByPrimaryKey(PmsProductVertifyRecord record);
}