/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author aditi
 */
public class Product {
    private String name;
    private int price;
    private int id;
    private ImageIcon prodImage;

    public void setProdImage(ImageIcon Image) {
        this.prodImage = Image;
    }
    
    public ImageIcon getProdImage(){
        return prodImage;
    }

     public static void setCount(int count) {
        Product.count = count;
    }
    private ArrayList<Feature> features;
    private static int count=0;
    public Product(){
        count++;
        id=count;
        features=new ArrayList<Feature>();
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(ArrayList<Feature> features) {
        this.features = features;
    }

    public static int getCount() {
        return count;
    }

    public Feature addNewFeature(Product product) {
    Feature newFeature = new Feature();
    features.add(newFeature);  // Add the new feature to the list
    return newFeature;
    }
    @Override
    public String toString() {
        return name;
}
    
}
