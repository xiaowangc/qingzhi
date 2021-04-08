package com.qingzhi.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.gson.Gson;
import com.qingzhi.pojo.QzArticle;
import com.qingzhi.pojo.QzBaoming;
import com.qingzhi.pojo.QzLiuyan;
import com.qingzhi.pojo.QzTuiwen;
import com.qingzhi.pojo.QzUser;
import com.qingzhi.service.qzService;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class qzController {

    @Autowired
    private qzService service;
    Gson gson = new Gson();

    @RequestMapping("/getstinfo")
    @ResponseBody
    public List<QzArticle> getlistinfo(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<QzArticle> stidhuoqu = service.getstinfo();
        return stidhuoqu;
    }

    @RequestMapping("/gettuiwen")
    @ResponseBody
    public List<QzTuiwen> gettuiwen(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<QzTuiwen> stidhuoqu = service.gettuiwen();
        return stidhuoqu;
    }

    //随机获取四条推问数据
    @RequestMapping("/suijituiwen")
    @ResponseBody
    public List<QzTuiwen> suijituiwen(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<QzTuiwen> stidhuoqu = service.suijituiwen();
        return stidhuoqu;
    }

    //对内后端
    @RequestMapping("/duinei")
    @ResponseBody
    public List<QzArticle> duinei(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<QzArticle> stidhuoqu = service.duinei();
        return stidhuoqu;
    }

    //队外的后端
    @RequestMapping("/duiwei")
    @ResponseBody
    public List<QzArticle> duiwei(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<QzArticle> stidhuoqu = service.duiwei();
        return stidhuoqu;
    }

    //登陆的后端实现
    @RequestMapping("/denglu")
    public void denglu(HttpServletRequest request, HttpServletResponse response, QzUser user) throws IOException {

        QzUser use = service.denglu(user.getQzName());
        if (use.getQzName().equals("")) {
            response.getWriter().write("200");
            return;
        } else {
            if (use.getQzPassworld().equals(user.getQzPassworld())) {
                response.getWriter().write("100");
            }
        }
    }

    //注册的后端
    @RequestMapping("/zhuce")
    @ResponseBody
    public String  zhuce(HttpServletRequest request, HttpServletResponse response, QzUser user) throws IOException {
        service.zhuce(user);
        return "100";
    }

    //获取录用状况多表查询
    @RequestMapping("/luyong")
    @ResponseBody
    public List<QzBaoming> luyong(HttpServletRequest request, HttpServletResponse response, String user) throws IOException {
        List<QzBaoming> listinfo = service.luyong(user);
        return listinfo;
    }

    //留言的后端保存
    @RequestMapping("/liuyansave")
    @ResponseBody
    public String liuyansave(HttpServletRequest request, HttpServletResponse response, QzLiuyan liuyan) throws IOException {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date1 = sdf.format(date);
        liuyan.setLyTime(date1);
        service.liuyansave(liuyan);
        return "100";
    }

    @RequestMapping("/baominginfo")
    @ResponseBody
    public String baominginfo(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String user = request.getParameter("user");
        String artid = request.getParameter("artid");
        QzBaoming bm = new QzBaoming();
        bm.setArtId(artid);
        bm.setUserId(user);
        bm.setState("正在审核");
        service.baominginfo(bm);
        return "100";
    }

}
