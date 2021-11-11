package com.performanceengineering101;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class class9 {
    public static void main(String[] args) {
        somemethod();
    }

    public static void somemethod() {
        List<Integer> myList = Arrays.asList(1, 2, 3, 4, 5, 6);

        Stream<Integer> s = myList.stream();

        Function<Integer, Integer> mapper = new Function<Integer, Integer>() {

            @Override
            public Integer apply(Integer t) {
                return t * 2;
            }

        };

        Stream<Integer> s1 = s.map(mapper);

        BinaryOperator<Integer> accumulator = new BinaryOperator<Integer>() {

            @Override
            public Integer apply(Integer t, Integer u) {
                return t + u;
            }

        };

        int s2 = s1.reduce(0, accumulator);

        System.out.println(s2);
        // s1.forEach(System.out::println);

    }

}
