package com.qingzhi.pojo;

public class QzArticle {
    private Integer id;

    private String artName;

    private String artDuinei;

    private String artTime;

    private String artSite;

    private String artLeirong;

    private String artXqrs;

    private String artYyrs;

    private String artState;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArtName() {
        return artName;
    }

    public void setArtName(String artName) {
        this.artName = artName == null ? null : artName.trim();
    }

    public String getArtDuinei() {
        return artDuinei;
    }

    public void setArtDuinei(String artDuinei) {
        this.artDuinei = artDuinei == null ? null : artDuinei.trim();
    }

    public String getArtTime() {
        return artTime;
    }

    public void setArtTime(String artTime) {
        this.artTime = artTime == null ? null : artTime.trim();
    }

    public String getArtSite() {
        return artSite;
    }

    public void setArtSite(String artSite) {
        this.artSite = artSite == null ? null : artSite.trim();
    }

    public String getArtLeirong() {
        return artLeirong;
    }

    public void setArtLeirong(String artLeirong) {
        this.artLeirong = artLeirong == null ? null : artLeirong.trim();
    }

    public String getArtXqrs() {
        return artXqrs;
    }

    public void setArtXqrs(String artXqrs) {
        this.artXqrs = artXqrs == null ? null : artXqrs.trim();
    }

    public String getArtYyrs() {
        return artYyrs;
    }

    public void setArtYyrs(String artYyrs) {
        this.artYyrs = artYyrs == null ? null : artYyrs.trim();
    }

    public String getArtState() {
        return artState;
    }

    public void setArtState(String artState) {
        this.artState = artState == null ? null : artState.trim();
    }
}