package com.tmm.mall.mapper;

import com.tmm.mall.model.PmsAlbumPic;
import com.tmm.mall.model.PmsAlbumPicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsAlbumPicMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_album_pic
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    long countByExample(PmsAlbumPicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_album_pic
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    int deleteByExample(PmsAlbumPicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_album_pic
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_album_pic
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    int insert(PmsAlbumPic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_album_pic
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    int insertSelective(PmsAlbumPic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_album_pic
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    List<PmsAlbumPic> selectByExample(PmsAlbumPicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_album_pic
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    PmsAlbumPic selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_album_pic
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    int updateByExampleSelective(@Param("record") PmsAlbumPic record, @Param("example") PmsAlbumPicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_album_pic
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    int updateByExample(@Param("record") PmsAlbumPic record, @Param("example") PmsAlbumPicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_album_pic
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    int updateByPrimaryKeySelective(PmsAlbumPic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_album_pic
     *
     * @mbg.generated Wed Feb 26 23:44:16 CST 2020
     */
    int updateByPrimaryKey(PmsAlbumPic record);
}