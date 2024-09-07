package org.launchcode;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter miles driven: ");
        Float miles = input.nextFloat();
        System.out.println("Please enter gas consumed in gallons: ");
        Float gas = input.nextFloat();

        Float milesPerGallon = miles / gas;
        System.out.println("Your car is getting " + milesPerGallon + " miles per gallon.");
    }
}
