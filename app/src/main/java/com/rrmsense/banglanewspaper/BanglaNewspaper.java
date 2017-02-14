package com.rrmsense.banglanewspaper;

import android.graphics.drawable.Drawable;

public class BanglaNewspaper {
    private Drawable image;
    private String name;
    private int id;

    public BanglaNewspaper(){}

    public BanglaNewspaper(Drawable image, String name,int id) {
        this.image = image;
        this.name = name;
        this.id = id;
    }

    public Drawable getImge() {
        return image;
    }

    public void setImge(Drawable imge) {
        this.image = imge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
