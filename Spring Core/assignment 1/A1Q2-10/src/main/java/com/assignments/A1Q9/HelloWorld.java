package com.assignments.A1Q9;

public class HelloWorld {
    //method executes when bean is instantiated
    public void init() throws Exception
    {
        System.out.println(
                "Bean HelloWorld has been "
                        + "instantiated and I'm "
                        + "the init() method");
    }

    // This method executes when spring container is closed
    public void destroy() throws Exception
    {
        System.out.println(
                "Conatiner has been closed "
                        + "and I'm the destroy() method");
    }
}
