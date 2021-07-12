package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //4Double a=10,b=20;
        Arithmetics add = (a, b)-> a+b;
        Arithmetics multiply = (a, b)->a*b;
        Arithmetics div = (a, b)->{if (b==0) return 0.0;
        return a/b;
        };
        Arithmetics sub = (a, b)->a-b;
        System.out.println(add.calculate(3.234, 2.0));
        System.out.println(multiply.calculate(3.234, 2.0));
        System.out.println(div.calculate(3.234, 2.0));
        System.out.println(sub.calculate(3.234, 2.0));

    }
}
@FunctionalInterface
interface Arithmetics {
    Double calculate(Double a, Double b);
}



