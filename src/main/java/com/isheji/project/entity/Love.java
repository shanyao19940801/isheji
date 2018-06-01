package com.isheji.project.entity;

import java.util.Date;

public class Love {
    private Integer id;

    private String imageid;

    private String username;

    private Date createDt;

    private Date modifyDt;

    private String imageListId;

    private Boolean isLove;

    private Long userId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImageid() {
        return imageid;
    }

    public void setImageid(String imageid) {
        this.imageid = imageid == null ? null : imageid.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Date getCreateDt() {
        return createDt;
    }

    public void setCreateDt(Date createDt) {
        this.createDt = createDt;
    }

    public Date getModifyDt() {
        return modifyDt;
    }

    public void setModifyDt(Date modifyDt) {
        this.modifyDt = modifyDt;
    }

    public String getImageListId() {
        return imageListId;
    }

    public void setImageListId(String imageListId) {
        this.imageListId = imageListId == null ? null : imageListId.trim();
    }

    public Boolean getIsLove() {
        return isLove;
    }

    public void setIsLove(Boolean isLove) {
        this.isLove = isLove;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}