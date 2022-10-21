package com.example.lastcloneapp.home;

public class HomeDTO {
    private String title, id, views, time;
    private  int thumbnail_img, profile_img;

    public HomeDTO(String title, String id, String views, String time, int thumbnail_img, int profile_img) {
        this.title = title;
        this.id = id;
        this.views = views;
        this.time = time;
        this.thumbnail_img = thumbnail_img;
        this.profile_img = profile_img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getViews() {
        return views;
    }

    public void setViews(String views) {
        this.views = views;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getThumbnail_img() {
        return thumbnail_img;
    }

    public void setThumbnail_img(int thumbnail_img) {
        this.thumbnail_img = thumbnail_img;
    }

    public int getProfile_img() {
        return profile_img;
    }

    public void setProfile_img(int profile_img) {
        this.profile_img = profile_img;
    }
}
