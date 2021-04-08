package com.qingzhi.dao;

import com.qingzhi.pojo.QzTuiwen;
import com.qingzhi.pojo.QzTuiwenExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface QzTuiwenMapper {
    int countByExample(QzTuiwenExample example);

    int deleteByExample(QzTuiwenExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QzTuiwen record);

    int insertSelective(QzTuiwen record);

    List<QzTuiwen> selectByExample(QzTuiwenExample example);

    QzTuiwen selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QzTuiwen record, @Param("example") QzTuiwenExample example);

    int updateByExample(@Param("record") QzTuiwen record, @Param("example") QzTuiwenExample example);

    int updateByPrimaryKeySelective(QzTuiwen record);

    int updateByPrimaryKey(QzTuiwen record);

	List<QzTuiwen> selectlimit();

	List<QzTuiwen> suijituiwen();


}
