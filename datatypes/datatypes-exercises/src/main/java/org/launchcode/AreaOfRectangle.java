package org.launchcode;
import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the length of the rectangle: ");
        Float length = input.nextFloat();
        System.out.println("Please enter the width of the rectangle: ");
        Float width = input.nextFloat();

        Float area = length * width;
        System.out.println("A rectange with a length of " + length + " and a width of " + width + " has an area of " + area);

    }
}
