package com.example.m230118.Domain;

public class CategoryDomain {
    private String title;
    private String pic;
    public CategoryDomain(String tilte , String pic){
        this.title = tilte;
        this.pic = pic;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getPic(){
        return pic;
    }
    public void setPic(String pic){
        this.pic = pic;
    }
}
