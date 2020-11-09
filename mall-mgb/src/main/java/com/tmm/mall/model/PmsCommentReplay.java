package com.tmm.mall.model;

import java.io.Serializable;
import java.util.Date;

public class PmsCommentReplay implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_comment_replay.id
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_comment_replay.comment_id
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    private Long commentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_comment_replay.member_nick_name
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    private String memberNickName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_comment_replay.member_icon
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    private String memberIcon;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_comment_replay.content
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_comment_replay.create_time
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_comment_replay.type
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    private Integer type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pms_comment_replay
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_comment_replay.id
     *
     * @return the value of pms_comment_replay.id
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_comment_replay.id
     *
     * @param id the value for pms_comment_replay.id
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_comment_replay.comment_id
     *
     * @return the value of pms_comment_replay.comment_id
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    public Long getCommentId() {
        return commentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_comment_replay.comment_id
     *
     * @param commentId the value for pms_comment_replay.comment_id
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_comment_replay.member_nick_name
     *
     * @return the value of pms_comment_replay.member_nick_name
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    public String getMemberNickName() {
        return memberNickName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_comment_replay.member_nick_name
     *
     * @param memberNickName the value for pms_comment_replay.member_nick_name
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    public void setMemberNickName(String memberNickName) {
        this.memberNickName = memberNickName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_comment_replay.member_icon
     *
     * @return the value of pms_comment_replay.member_icon
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    public String getMemberIcon() {
        return memberIcon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_comment_replay.member_icon
     *
     * @param memberIcon the value for pms_comment_replay.member_icon
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    public void setMemberIcon(String memberIcon) {
        this.memberIcon = memberIcon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_comment_replay.content
     *
     * @return the value of pms_comment_replay.content
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_comment_replay.content
     *
     * @param content the value for pms_comment_replay.content
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_comment_replay.create_time
     *
     * @return the value of pms_comment_replay.create_time
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_comment_replay.create_time
     *
     * @param createTime the value for pms_comment_replay.create_time
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_comment_replay.type
     *
     * @return the value of pms_comment_replay.type
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_comment_replay.type
     *
     * @param type the value for pms_comment_replay.type
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_comment_replay
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
        sb.append(", commentId=").append(commentId);
        sb.append(", memberNickName=").append(memberNickName);
        sb.append(", memberIcon=").append(memberIcon);
        sb.append(", content=").append(content);
        sb.append(", createTime=").append(createTime);
        sb.append(", type=").append(type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}