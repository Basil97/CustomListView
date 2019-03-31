package com.basil.customlistview;

public class Products {

    private String name;
    private String price;
    private int image;

    public Products(String name, String price, int image) {
        this.name = name;
        this.price = price;
        this.image = image;
    }



    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public int getImage() {
        return image;
    }

}
