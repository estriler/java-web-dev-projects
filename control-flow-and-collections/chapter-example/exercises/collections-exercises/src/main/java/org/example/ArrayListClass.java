package org.example;
import java.util.ArrayList;

public class ArrayListClass {
    public static int sumEven(ArrayList <Integer> arr) {
        int total = 0;
        for (int integer : arr){
            if(integer % 2 == 0){
                total += integer;
            }
        }
        return total;
    }
}
