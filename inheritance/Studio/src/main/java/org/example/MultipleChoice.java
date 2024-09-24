package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class MultipleChoice extends Question{

    private String userAnswer;
    private String correctAnswer;

    public MultipleChoice(String question, ArrayList<String> answers, String correctAnswer) {
        super(question, answers);
        this.correctAnswer = correctAnswer;
    }

    public void setUserAnswer(String userAnswer) {
        this.userAnswer = userAnswer;
    }

    @Override
    public void displayQuestion(){
        System.out.println(getQuestion() + ":");
        for (String answer : getAnswers()){
            System.out.println(answer);
        }
    }

    @Override
    public void handleUserInput(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please choose one answer: ");
        String selection = input.nextLine();
        String userAnswer = input.nextLine();
    }

    @Override
    public boolean isCorrect() {
        if (correctAnswer.equalsIgnoreCase(userAnswer)){
            System.out.println("Correct!!!");
            return true;
        }else{
            System.out.println("Incorrect...");
            return false;
        }
    }


}
