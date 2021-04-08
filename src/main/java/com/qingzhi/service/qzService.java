package com.qingzhi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qingzhi.dao.QzArticleMapper;
import com.qingzhi.dao.QzBaomingMapper;
import com.qingzhi.dao.QzLiuyanMapper;
import com.qingzhi.dao.QzTuiwenMapper;
import com.qingzhi.dao.QzUserMapper;
import com.qingzhi.pojo.QzArticle;
import com.qingzhi.pojo.QzBaoming;
import com.qingzhi.pojo.QzLiuyan;
import com.qingzhi.pojo.QzTuiwen;
import com.qingzhi.pojo.QzUser;

@Service
public class qzService {
	@Autowired
    private  QzArticleMapper artmapper;
	@Autowired
    private  QzTuiwenMapper tuiwenmapper;
	
	@Autowired
    private  QzUserMapper usermapper;
	
	@Autowired
    private  QzBaomingMapper baomingmapper;
	
	@Autowired
    private  QzLiuyanMapper liuyanmapper;

	public List<QzArticle> getstinfo() {
		// TODO Auto-generated method stub
		return artmapper.selectByExampletest(null);
	}

	public List<QzTuiwen> gettuiwen() {
		// TODO Auto-generated method stub
		return tuiwenmapper.selectlimit();
	}

	public List<QzTuiwen> suijituiwen() {
		// TODO Auto-generated method stub
		return tuiwenmapper.suijituiwen();
	}

	public List<QzArticle> duinei() {
		// TODO Auto-generated method stub
		return artmapper.duinei();
	}
	public List<QzArticle> duiwei() {
		// TODO Auto-generated method stub
		return artmapper.duiwei();
	}

	public QzUser denglu(String qzName) {
		// TODO Auto-generated method stub
		return usermapper.denglu(qzName);
	}

	public void zhuce(QzUser user) {
		// TODO Auto-generated method stub
		usermapper.insert(user);
	}

	public List<QzBaoming> luyong(String user) {
		// TODO Auto-generated method stub
		return baomingmapper.slectall(user);
	}

	public void liuyansave(QzLiuyan liuyan) {
		// TODO Auto-generated method stub
		liuyanmapper.insert(liuyan);
	}

	public void baominginfo(QzBaoming bm) {
		// TODO Auto-generated method stub
		baomingmapper.insert(bm);
	}

}
