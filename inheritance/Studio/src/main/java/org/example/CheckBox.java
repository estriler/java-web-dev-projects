package org.example;

import java.util.ArrayList;

public class CheckBox extends Question{

    public CheckBox(String question, ArrayList<String> answers) {
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
