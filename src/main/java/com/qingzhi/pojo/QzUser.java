package com.qingzhi.pojo;

public class QzUser {
    private Integer id;

    private String qzName;

    private String qzPassworld;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQzName() {
        return qzName;
    }

    public void setQzName(String qzName) {
        this.qzName = qzName == null ? null : qzName.trim();
    }

    public String getQzPassworld() {
        return qzPassworld;
    }

    public void setQzPassworld(String qzPassworld) {
        this.qzPassworld = qzPassworld == null ? null : qzPassworld.trim();
    }
}