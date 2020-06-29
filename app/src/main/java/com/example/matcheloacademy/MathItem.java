package com.example.matcheloacademy;

public class MathItem {

    private int imageResource;
    private String title;
    private String key_id;
    private String favStatus;
    private String url;

    public MathItem() {
    }

    public MathItem(int imageResource, String title, String key_id, String favStatus, String url) {
        this.imageResource = imageResource;
        this.title = title;
        this.key_id = key_id;
        this.favStatus = favStatus;
        this.url = url;
    }

    public int getImageResourse() {
        return imageResource;
    }

    public void setImageResourse(int imageResource) {
        this.imageResource = imageResource;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getKey_id() {
        return key_id;
    }

    public void setKey_id(String key_id) {
        this.key_id = key_id;
    }

    public String getFavStatus() {
        return favStatus;
    }

    public void setFavStatus(String favStatus) {
        this.favStatus = favStatus;
    }

    public String getUrl() {
        return this.url;
    }
}
