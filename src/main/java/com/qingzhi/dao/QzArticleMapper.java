package com.qingzhi.dao;

import com.qingzhi.pojo.QzArticle;
import com.qingzhi.pojo.QzArticleExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface QzArticleMapper {
    int countByExample(QzArticleExample example);

    int deleteByExample(QzArticleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QzArticle record);

    int insertSelective(QzArticle record);

    List<QzArticle> selectByExampletest(QzArticleExample example);

    QzArticle selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QzArticle record, @Param("example") QzArticleExample example);

    int updateByExample(@Param("record") QzArticle record, @Param("example") QzArticleExample example);

    int updateByPrimaryKeySelective(QzArticle record);

    int updateByPrimaryKey(QzArticle record);

	List<QzArticle> duinei();
	List<QzArticle> duiwei();
}
