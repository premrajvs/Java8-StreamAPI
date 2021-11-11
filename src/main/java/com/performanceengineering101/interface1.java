package com.performanceengineering101;

public interface interface1 {
    default void somemethod(){
        System.out.println("interface 1");
    }
    default void somenewmethod(){
        System.out.println("interface 1 new without class changes");
    }
}
