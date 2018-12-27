package com.example.makda.mycusine;

public class ListItem {

    private int imageDrawable;

    private String name;

    private String desc;

    public ListItem(int imageDrawable, String name, String desc) {
        this.imageDrawable = imageDrawable;
        this.name = name;
        this.desc = desc;
    }

    public int getImageDrawable() {
        return imageDrawable;
    }

    public void setImageDrawable(int imageDrawable) {
        this.imageDrawable = imageDrawable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}

