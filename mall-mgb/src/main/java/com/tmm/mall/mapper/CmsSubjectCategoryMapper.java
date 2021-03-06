package com.tmm.mall.mapper;

import com.tmm.mall.model.CmsSubjectCategory;
import com.tmm.mall.model.CmsSubjectCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsSubjectCategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_category
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    long countByExample(CmsSubjectCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_category
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    int deleteByExample(CmsSubjectCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_category
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_category
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    int insert(CmsSubjectCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_category
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    int insertSelective(CmsSubjectCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_category
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    List<CmsSubjectCategory> selectByExample(CmsSubjectCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_category
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    CmsSubjectCategory selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_category
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    int updateByExampleSelective(@Param("record") CmsSubjectCategory record, @Param("example") CmsSubjectCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_category
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    int updateByExample(@Param("record") CmsSubjectCategory record, @Param("example") CmsSubjectCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_category
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    int updateByPrimaryKeySelective(CmsSubjectCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_category
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    int updateByPrimaryKey(CmsSubjectCategory record);
}