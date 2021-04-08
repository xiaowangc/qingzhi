package com.qingzhi.dao;

import com.qingzhi.pojo.QzLiuyan;
import com.qingzhi.pojo.QzLiuyanExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface QzLiuyanMapper {
    int countByExample(QzLiuyanExample example);

    int deleteByExample(QzLiuyanExample example);

    int insert(QzLiuyan record);

    int insertSelective(QzLiuyan record);

    List<QzLiuyan> selectByExample(QzLiuyanExample example);

    int updateByExampleSelective(@Param("record") QzLiuyan record, @Param("example") QzLiuyanExample example);

    int updateByExample(@Param("record") QzLiuyan record, @Param("example") QzLiuyanExample example);
}
