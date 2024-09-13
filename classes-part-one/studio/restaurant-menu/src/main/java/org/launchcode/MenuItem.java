package org.launchcode;
import java.time.LocalDate;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private String category;
    private Boolean isNew;
    private final LocalDate dateAdded;

    public MenuItem(String name, double price, String description, String category, Boolean isNew){
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
        this.dateAdded = LocalDate.now();
    }


    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public String getDescription() {
        return description;
    }
    public String getCategory(){
        return category;
    }
    public Boolean getIsNew(){
        return isNew;
    }
    public LocalDate getDateAdded(){
        return dateAdded;
    }


    public void setName(String aName) {
        name = aName;
    }
    public void setPrice(double aPrice) {
        price = aPrice;
    }
    public void setDescription(String aDescription) {
        description = aDescription;
    }
    public void setCategory(String aCategory) {
        category = aCategory;
    }
    public void setIsNew(Boolean aIsNew) {
        isNew = aIsNew;
    }

}