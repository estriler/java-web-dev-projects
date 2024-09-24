package org.example;

import java.util.ArrayList;

public class TrueFalse extends Question{

    public TrueFalse(String question, ArrayList<String> answers) {
        super(question, answers);
    }

    @Override
    public void displayQuestion() {

    }

    @Override
    public void handleUserInput() {

    }

    @Override
    public boolean isCorrect() {
        return false;
    }
}
