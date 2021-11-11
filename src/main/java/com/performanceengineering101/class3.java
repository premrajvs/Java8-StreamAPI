package com.performanceengineering101;

import java.util.Arrays;
import java.util.List;

public class class3 {
    public static void main(String[] args) {
        somemethod();
    }

    public static void somemethod() {
        List<Integer> myList = Arrays.asList(1, 2, 3, 4, 5, 6);

        for (int i : myList) {
            System.out.println(i);
        }
    }

}
