package com.isheji.project.entity;

public class ImageDetail {
    private Integer id;

    private String height;

    private String imageListId;

    private String url;

    private String width;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height == null ? null : height.trim();
    }

    public String getImageListId() {
        return imageListId;
    }

    public void setImageListId(String imageListId) {
        this.imageListId = imageListId == null ? null : imageListId.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width == null ? null : width.trim();
    }
}