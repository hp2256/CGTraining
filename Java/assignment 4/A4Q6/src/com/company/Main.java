package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<String> wordList = new ArrayList<>();
        wordList.add("package");
        wordList.add("list");
        wordList.add("code");
        wordList.add("array");
        wordList.add("words");
        wordList.add("write");
        wordList.add("static");
        wordList.add("qpwoeip");
        wordList.add("asdkjnbjb");

        wordList.replaceAll(String::toUpperCase);
        System.out.println(wordList);
    }
}
