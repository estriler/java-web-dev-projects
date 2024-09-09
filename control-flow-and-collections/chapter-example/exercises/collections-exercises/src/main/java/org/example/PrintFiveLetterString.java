package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintFiveLetterString {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        ArrayList<String> fiveLetterFruits = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Grape");
        fruits.add("Orange");
        fruits.add("Papaya");
        fruits.add("Kiwi");
        fruits.add("Cherry");
        fruits.add("Berry");

        int wordLength;
        System.out.println("Enter a word length number: ");
        wordLength = input.nextInt();

        for (String fruit : fruits) {
            if (fruit.length() == wordLength) {
                fiveLetterFruits.add(fruit);
            }
        }
        System.out.println(fiveLetterFruits);
    }
}
