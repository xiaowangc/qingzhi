package com.qingzhi.dao;

import com.qingzhi.pojo.QzBaoming;
import com.qingzhi.pojo.QzBaomingExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface QzBaomingMapper {
    int countByExample(QzBaomingExample example);

    int deleteByExample(QzBaomingExample example);

    int insert(QzBaoming record);

    int insertSelective(QzBaoming record);

    List<QzBaoming> selectByExample(QzBaomingExample example);

    int updateByExampleSelective(@Param("record") QzBaoming record, @Param("example") QzBaomingExample example);

    int updateByExample(@Param("record") QzBaoming record, @Param("example") QzBaomingExample example);

	List<QzBaoming> slectall(String user);
}
