package com.qingzhi.pojo;

public class QzTuiwen {
    private Integer id;

    private String twBiaoti;

    private String twTupian;

    private String twLianjie;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTwBiaoti() {
        return twBiaoti;
    }

    public void setTwBiaoti(String twBiaoti) {
        this.twBiaoti = twBiaoti == null ? null : twBiaoti.trim();
    }

    public String getTwTupian() {
        return twTupian;
    }

    public void setTwTupian(String twTupian) {
        this.twTupian = twTupian == null ? null : twTupian.trim();
    }

    public String getTwLianjie() {
        return twLianjie;
    }

    public void setTwLianjie(String twLianjie) {
        this.twLianjie = twLianjie == null ? null : twLianjie.trim();
    }
}