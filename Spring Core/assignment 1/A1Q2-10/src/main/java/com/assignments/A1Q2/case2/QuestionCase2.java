package com.assignments.A1Q2.case2;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class QuestionCase2 {

    int questionId;
    String question;
    Set<String> setanswers;

    public Set<String> getSetanswers() {
        return setanswers;
    }

    public void setSetanswers(Set<String> setanswers) {
        this.setanswers = setanswers;
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

    void display(){
        System.out.println("Question id: " + questionId+ "\nQuestion: "+ question);
        setanswers.forEach(System.out::println);
    }
}
