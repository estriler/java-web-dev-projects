package org.example;

public class Array {
    public static void main(String[] args) {
        int[] intArray = {1, 1, 2 ,3 ,5, 8};
        for (int i : intArray){
            if(i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
