package com.fsb.soap;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Recipe implements Serializable {
    private int id;
    private String name;
    private String ingredients;
    private String price;

    public Recipe() {}

    public Recipe(int id, String name, String ingredients, String price) {
        this.id = id;
        this.name = name;
        this.ingredients = ingredients;
        this.price = price;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getIngredients() { return ingredients; }
    public void setIngredients(String ingredients) { this.ingredients = ingredients; }
    public String getPrice() { return price; }
    public void setPrice(String price) { this.price = price; }
}