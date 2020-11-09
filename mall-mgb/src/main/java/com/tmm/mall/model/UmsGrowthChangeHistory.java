package com.tmm.mall.model;

import java.io.Serializable;
import java.util.Date;

public class UmsGrowthChangeHistory implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_growth_change_history.id
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_growth_change_history.member_id
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    private Long memberId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_growth_change_history.create_time
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_growth_change_history.change_type
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    private Integer changeType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_growth_change_history.change_count
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    private Integer changeCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_growth_change_history.operate_man
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    private String operateMan;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_growth_change_history.operate_note
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    private String operateNote;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_growth_change_history.source_type
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    private Integer sourceType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ums_growth_change_history
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_growth_change_history.id
     *
     * @return the value of ums_growth_change_history.id
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_growth_change_history.id
     *
     * @param id the value for ums_growth_change_history.id
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_growth_change_history.member_id
     *
     * @return the value of ums_growth_change_history.member_id
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    public Long getMemberId() {
        return memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_growth_change_history.member_id
     *
     * @param memberId the value for ums_growth_change_history.member_id
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_growth_change_history.create_time
     *
     * @return the value of ums_growth_change_history.create_time
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_growth_change_history.create_time
     *
     * @param createTime the value for ums_growth_change_history.create_time
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_growth_change_history.change_type
     *
     * @return the value of ums_growth_change_history.change_type
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    public Integer getChangeType() {
        return changeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_growth_change_history.change_type
     *
     * @param changeType the value for ums_growth_change_history.change_type
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    public void setChangeType(Integer changeType) {
        this.changeType = changeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_growth_change_history.change_count
     *
     * @return the value of ums_growth_change_history.change_count
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    public Integer getChangeCount() {
        return changeCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_growth_change_history.change_count
     *
     * @param changeCount the value for ums_growth_change_history.change_count
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    public void setChangeCount(Integer changeCount) {
        this.changeCount = changeCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_growth_change_history.operate_man
     *
     * @return the value of ums_growth_change_history.operate_man
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    public String getOperateMan() {
        return operateMan;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_growth_change_history.operate_man
     *
     * @param operateMan the value for ums_growth_change_history.operate_man
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    public void setOperateMan(String operateMan) {
        this.operateMan = operateMan;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_growth_change_history.operate_note
     *
     * @return the value of ums_growth_change_history.operate_note
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    public String getOperateNote() {
        return operateNote;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_growth_change_history.operate_note
     *
     * @param operateNote the value for ums_growth_change_history.operate_note
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    public void setOperateNote(String operateNote) {
        this.operateNote = operateNote;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_growth_change_history.source_type
     *
     * @return the value of ums_growth_change_history.source_type
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    public Integer getSourceType() {
        return sourceType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_growth_change_history.source_type
     *
     * @param sourceType the value for ums_growth_change_history.source_type
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_growth_change_history
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", memberId=").append(memberId);
        sb.append(", createTime=").append(createTime);
        sb.append(", changeType=").append(changeType);
        sb.append(", changeCount=").append(changeCount);
        sb.append(", operateMan=").append(operateMan);
        sb.append(", operateNote=").append(operateNote);
        sb.append(", sourceType=").append(sourceType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}