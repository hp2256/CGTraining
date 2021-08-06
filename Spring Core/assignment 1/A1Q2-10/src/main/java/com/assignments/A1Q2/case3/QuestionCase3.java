package com.assignments.A1Q2.case3;

import java.util.Map;

public class QuestionCase3 {

    int questionId;
    String question;
    Map<Integer, String> mapanswers;

    public Map<Integer, String> getMapanswers() {
        return mapanswers;
    }

    public void setMapanswers(Map<Integer, String> mapanswers) {
        this.mapanswers = mapanswers;
    }

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

    void display() {
        System.out.println("Question id: " + questionId + "\nQuestion: " + question);
        mapanswers.forEach((k, v) -> System.out.println("Key " + k + " Value " + v));
    }
}
