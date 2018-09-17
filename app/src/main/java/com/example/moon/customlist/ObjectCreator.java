package com.example.moon.customlist;

public class ObjectCreator {
    String name_,phone_;
    int image_;

    public ObjectCreator(String name_, String phone_, int image_) {
        this.name_ = name_;
        this.phone_ = phone_;
        this.image_ = image_;
    }

    public String getName_() {
        return name_;
    }

    public void setName_(String name_) {
        this.name_ = name_;
    }

    public String getPhone_() {
        return phone_;
    }

    public void setPhone_(String phone_) {
        this.phone_ = phone_;
    }

    public int getImage_() {
        return image_;
    }

    public void setImage_(int image_) {
        this.image_ = image_;
    }
}
