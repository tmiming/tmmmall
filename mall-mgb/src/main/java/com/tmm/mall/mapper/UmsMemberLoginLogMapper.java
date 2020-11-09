package com.tmm.mall.mapper;

import com.tmm.mall.model.UmsMemberLoginLog;
import com.tmm.mall.model.UmsMemberLoginLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsMemberLoginLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_login_log
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    long countByExample(UmsMemberLoginLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_login_log
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    int deleteByExample(UmsMemberLoginLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_login_log
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_login_log
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    int insert(UmsMemberLoginLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_login_log
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    int insertSelective(UmsMemberLoginLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_login_log
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    List<UmsMemberLoginLog> selectByExample(UmsMemberLoginLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_login_log
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    UmsMemberLoginLog selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_login_log
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    int updateByExampleSelective(@Param("record") UmsMemberLoginLog record, @Param("example") UmsMemberLoginLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_login_log
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    int updateByExample(@Param("record") UmsMemberLoginLog record, @Param("example") UmsMemberLoginLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_login_log
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    int updateByPrimaryKeySelective(UmsMemberLoginLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_login_log
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    int updateByPrimaryKey(UmsMemberLoginLog record);
}