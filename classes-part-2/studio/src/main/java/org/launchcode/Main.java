package org.launchcode;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {
        // write your code here
        MenuItem item1 = new MenuItem("Big Ol' Burger", 20.99,"The biggest burger a human can possibly fit in their mouth", "main course");
        MenuItem item2 = new MenuItem("Big Gulp Milkshake", 8.99, "A milkshake that is too much milkshake", "dessert");
        MenuItem item3 = new MenuItem("Fremchy Frimes", 5.99, "Crimpshy crimggly fremchy frimes", "side");
        MenuItem item4 = new MenuItem("Flying Saucer Pizza", 27.99, "A pizza the size of a UFO", "main course");
        MenuItem item5 = new MenuItem("Coke", 2.99, "a coke", "drink");

//        Test to see if isNew is working
//        System.out.println(item1.isNew());

        System.out.println(item1);

        Menu menu = new Menu();

        menu.addItems(item1);
        menu.addItems(item2);
        menu.addItems(item3);
        menu.addItems(item4);
        menu.addItems(item5);

        System.out.println(menu);

        menu.removeItem(item4);

        System.out.println(menu);
    }
}
