package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

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

        Predicate<String> predicate = a -> ((a.length()) % 2 != 0);
        wordList.removeIf(predicate);
        wordList.forEach(System.out::println);


    }
}
