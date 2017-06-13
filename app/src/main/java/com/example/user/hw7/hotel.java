package com.example.user.hw7;

import android.graphics.Bitmap;

/**
 * Created by user on 2017/6/13.
 */

public class hotel {

    private Bitmap Img;

    private String name;

    private String place;


    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Bitmap getImg() {
        return Img;
    }

    public void setImg(Bitmap img) {
        Img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
