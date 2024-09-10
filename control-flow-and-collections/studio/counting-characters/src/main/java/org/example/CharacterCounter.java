package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a sentence to dissect: ");
        String test = input.nextLine().toLowerCase();

        char[] charactersInString = test.toCharArray();

        HashMap<Character, Integer> alphabetMap = new HashMap<>();

        for(char chr : charactersInString){
            if(Character.isLetter(chr)) {
                if (alphabetMap.containsKey(chr)) {
                    alphabetMap.put(chr, alphabetMap.get(chr) + 1);
                } else {
                    alphabetMap.put(chr, 1);
                }
            }
        }

        System.out.println(alphabetMap);

    }
}
