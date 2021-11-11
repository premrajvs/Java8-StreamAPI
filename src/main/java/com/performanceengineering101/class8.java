package com.performanceengineering101;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class class8 {
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
        s.map(mapper).forEach(System.out::println);

    }

}
