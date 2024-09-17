package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(Date d, ArrayList<MenuItem> i) {
        this.lastUpdated = d;
        this.items = i;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    @Override
    public String toString(){
        StringBuilder mainCourses = new StringBuilder();
        for (MenuItem item: items){
            if(item.getCategory().equals("main course")){
                mainCourses.append("\n").append(item.toString()).append("\n");
            }
        }
        StringBuilder sides = new StringBuilder();
        for (MenuItem item: items){
            if(item.getCategory().equals("side")){
                sides.append("\n").append(item.toString()).append("\n");
            }
        }
        StringBuilder drinks = new StringBuilder();
        for (MenuItem item: items){
            if(item.getCategory().equals("drink")){
                drinks.append("\n").append(item.toString()).append("\n");
            }
        }
        StringBuilder desserts = new StringBuilder();
        for (MenuItem item: items){
            if(item.getCategory().equals("dessert")){
                desserts.append("\n").append(item.toString()).append("\n");
            }
        }

        return "\nBig Pappa's Foodery\n"+
                "Main Courses: " + mainCourses.toString() + "\n" +
                "Sides: " + sides.toString() + "\n" +
                "Drinks: " + drinks.toString() + "\n" +
                "Desserts: " + desserts.toString() + "\n";
    }

    void addItems(MenuItem newItem){
        items.add(newItem);
        lastUpdated = LocalDate.now();
    }

    void removeItem(MenuItem item){
        items.remove(item);
        lastUpdated = LocalDate.now();
    }
}


