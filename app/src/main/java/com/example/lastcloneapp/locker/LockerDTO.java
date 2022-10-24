package com.example.lastcloneapp.locker;

public class LockerDTO {
    private String tv_count,tv_title;
    private int list_img;

    public LockerDTO(String tv_count, String tv_title, int list_img) {
        this.tv_count = tv_count;
        this.tv_title = tv_title;
        this.list_img = list_img;
    }

    public String getTv_count() {
        return tv_count;
    }

    public void setTv_count(String tv_count) {
        this.tv_count = tv_count;
    }

    public String getTv_title() {
        return tv_title;
    }

    public void setTv_title(String tv_title) {
        this.tv_title = tv_title;
    }

    public int getList_img() {
        return list_img;
    }

    public void setList_img(int list_img) {
        this.list_img = list_img;
    }
}
