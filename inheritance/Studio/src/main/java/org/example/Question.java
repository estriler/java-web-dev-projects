package org.example;

import java.util.ArrayList;

public abstract class Question {

    private String question;
    private ArrayList<String> answers;

    public Question (String question, ArrayList<String> answers){
        this.question = question;
        this.answers = answers;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public ArrayList<String> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<String> answers) {
        this.answers = answers;
    }

    public abstract void displayQuestion();
    public abstract void handleUserInput();
    public abstract boolean isCorrect();
}
