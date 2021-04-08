package com.qingzhi.dao;

import com.qingzhi.pojo.QzUser;
import com.qingzhi.pojo.QzUserExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface QzUserMapper {
    int countByExample(QzUserExample example);

    int deleteByExample(QzUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QzUser record);

    int insertSelective(QzUser record);

    List<QzUser> selectByExample(QzUserExample example);

    QzUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QzUser record, @Param("example") QzUserExample example);

    int updateByExample(@Param("record") QzUser record, @Param("example") QzUserExample example);

    int updateByPrimaryKeySelective(QzUser record);

    int updateByPrimaryKey(QzUser record);

	QzUser denglu(String qzName);

}
