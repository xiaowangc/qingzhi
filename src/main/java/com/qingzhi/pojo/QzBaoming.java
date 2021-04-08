package com.qingzhi.pojo;

public class QzBaoming {
    private String artId;

    private String userId;
    
    private String state;
    
    private  QzArticle  art;
    

    public QzArticle getArt() {
		return art;
	}

	public void setArt(QzArticle art) {
		this.art = art;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getArtId() {
        return artId;
    }

    public void setArtId(String artId) {
        this.artId = artId == null ? null : artId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }
}