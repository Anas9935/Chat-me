package com.example.myapplication.objects;

public class menuitem {
    private int imgid;
    private int type;   //0=veg,1=non-veg
    private String name;
    private float price;

    public menuitem(int id,int ty,String n,float p){
        imgid=id;
        type=ty;
        name=n;
        price=p;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public int getImgid() {
        return imgid;
    }

    public int getType() {
        return type;
    }
}
