package com.qingzhi.pojo;

public class QzLiuyan {
    private String id;

    private String lyTime;

    private String lyNeirong;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getLyTime() {
        return lyTime;
    }

    public void setLyTime(String lyTime) {
        this.lyTime = lyTime == null ? null : lyTime.trim();
    }

    public String getLyNeirong() {
        return lyNeirong;
    }

    public void setLyNeirong(String lyNeirong) {
        this.lyNeirong = lyNeirong == null ? null : lyNeirong.trim();
    }
}