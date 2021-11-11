package com.performanceengineering101;

import java.util.Arrays;
import java.util.List;

public class class7 {
    public static void main(String[] args) {
        somemethod();
    }

    public static void somemethod() {
        List<Integer> myList = Arrays.asList(1, 2, 3, 4, 5, 6);

        int results = 0;
        for (int i : myList) {
            results = results + i * 2;
        }

        System.out.println(results);

        System.out.println(myList.stream().map(i -> i * 2).reduce(0, (c, e) -> c + e));

    }

}
