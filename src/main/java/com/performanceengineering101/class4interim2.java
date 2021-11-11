package com.performanceengineering101;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class class4interim2 {
    public static void main(String[] args) {
        somemethod();
    }

    public static void somemethod() {
        List<Integer> myList = Arrays.asList(1, 2, 3, 4, 5, 6);

        // myList.forEach((Integer t) -> System.out.println(t));
        myList.forEach(t -> System.out.println(t));
    }
}
