package com.tmm.mall.mapper;

import com.tmm.mall.model.CmsSubjectComment;
import com.tmm.mall.model.CmsSubjectCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsSubjectCommentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_comment
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    long countByExample(CmsSubjectCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_comment
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    int deleteByExample(CmsSubjectCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_comment
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_comment
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    int insert(CmsSubjectComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_comment
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    int insertSelective(CmsSubjectComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_comment
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    List<CmsSubjectComment> selectByExample(CmsSubjectCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_comment
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    CmsSubjectComment selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_comment
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    int updateByExampleSelective(@Param("record") CmsSubjectComment record, @Param("example") CmsSubjectCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_comment
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    int updateByExample(@Param("record") CmsSubjectComment record, @Param("example") CmsSubjectCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_comment
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    int updateByPrimaryKeySelective(CmsSubjectComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_comment
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    int updateByPrimaryKey(CmsSubjectComment record);
}