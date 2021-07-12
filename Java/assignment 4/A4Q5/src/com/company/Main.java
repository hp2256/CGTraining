package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

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
        Consumer<List<String>> firstLetter = a -> {
            StringBuilder s = new StringBuilder();

            a.forEach(firs -> s.append(firs.charAt(0)));
            System.out.println(s);
        };
        firstLetter.accept(wordList);
    }
}
