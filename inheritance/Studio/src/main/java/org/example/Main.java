package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String questionsMC = "Which is an incorrect Java Datatype?";

        ArrayList<String> answersMC = new ArrayList<>();
        answersMC.add("Strings");
        answersMC.add("HashMap");
        answersMC.add("Threads");
        answersMC.add("Float");

        String correctAnswerMC = "Threads";

        MultipleChoice test = new MultipleChoice(questionsMC, answersMC, correctAnswerMC);

        testMC.displayQuestion();
        testMC.handleUserInput();
        testMC.isCorrect();

    }
}