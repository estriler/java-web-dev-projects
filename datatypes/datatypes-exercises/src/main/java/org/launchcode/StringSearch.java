package org.launchcode;
import java.util.Scanner;

public class StringSearch {
    public static void main(String[] args) {
        String originalQuote = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having " +
                "nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures " +
                "or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?’";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word or phrase are you looking for: ");
        String searchWord = input.nextLine();

        Integer index = originalQuote.indexOf(searchWord);
        Integer length = searchWord.length();

        if(originalQuote.toLowerCase().contains(searchWord.toLowerCase())){
            System.out.println("Your word/phrase: " + searchWord + " was found in the text at index " + index + ". Your word/phrase is " + length + " characters long.");
            String modifiedQuote = originalQuote.replace(searchWord, "");
            System.out.println(modifiedQuote);
        }else {
            System.out.println("Your word/phrase: " + searchWord + " was not found in the text...");
        }
    }
}
