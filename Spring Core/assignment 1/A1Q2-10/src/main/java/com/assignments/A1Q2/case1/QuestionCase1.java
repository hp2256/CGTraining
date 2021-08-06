package com.assignments.A1Q2.case1;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class QuestionCase1 {

    int questionId;
    String question;
    List<String> listanswers;
    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<String> getListanswers() {
        return listanswers;
    }

    public void setListanswers(List<String> listanswers) {
        this.listanswers = listanswers;
    }

    void display(){
        System.out.println("Question id: " + questionId+ "\nQuestion: "+ question);
        listanswers.forEach(System.out::println);
    }
}
