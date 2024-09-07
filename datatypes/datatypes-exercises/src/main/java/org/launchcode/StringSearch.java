package org.launchcode;
import java.util.Scanner;

public class StringSearch {
    public static void main(String[] args) {
        String quote = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having " +
                "nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures " +
                "or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?’";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word or phrase are you looking for: ");
        String search = input.nextLine();
        if(quote.toLowerCase().contains(search.toLowerCase())){
            System.out.println("Your word/phrase: " + search + " was found in the text!");
        }else {
            System.out.println("Your word/phrase: " + search + " was not found in the text...");
        }
    }
}
