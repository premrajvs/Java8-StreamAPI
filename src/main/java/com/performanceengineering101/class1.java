package com.performanceengineering101;

public class class1 implements interface1, interface2 {

    // I am overriding the method because it is defined in both interfaces. To avoid
    // multiple inheritance problem, we are doing this.
    @Override
    public void somemethod() {
        System.out.println("class 1");

    }

}
