package com.performanceengineering101;

import java.util.Arrays;
import java.util.List;

public class class6 {
    public static void main(String[] args) {
        somemethod();
    }

    public static void somemethod() {
        List<Integer> myList = Arrays.asList(1, 2, 3, 4, 5, 6);

        myList.forEach(class6::dosometask); // Method Reference, Call by method
    }

    public static void dosometask(Integer i) {
        System.out.println(i * 2);
    }
}
