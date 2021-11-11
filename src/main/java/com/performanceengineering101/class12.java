package com.performanceengineering101;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class class12 {
    public static void main(String[] args) {
        somemethod();
    }

    public static void somemethod() {
        List<Integer> myList = Arrays.asList(1, 2, 3, 4, 5, 6);

        Stream<Integer> s = myList.stream();
        /*
         * Function<Integer, Integer> mapper = new Function<Integer, Integer>() {
         * 
         * @Override public Integer apply(Integer t) { return t * 2; }
         * 
         * };
         */

        // Stream<Integer> s1 = s.map(t -> t * 2); // Step 1
        /*
         * BinaryOperator<Integer> accumulator = new BinaryOperator<Integer>() {
         * 
         * @Override public Integer apply(Integer t, Integer u) { return t + u; }
         * 
         * };
         */

        // int s2 = s.map(t -> t * 2).reduce(0, (t, u) -> t + u); // Step 2

        System.out.println(s.map(t -> t * 2).reduce(0, Integer::sum));
        // s1.forEach(System.out::println);

    }

}
