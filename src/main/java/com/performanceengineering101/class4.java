package com.performanceengineering101;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class class4 {
    public static void main(String[] args) {
        somemethod();
    }

    public static void somemethod() {
        List<Integer> myList = Arrays.asList(1, 2, 3, 4, 5, 6);

        myList.forEach(new consumerimplementation<Integer>());
    }

}

class consumerimplementation<T> implements Consumer<Integer> {

    @Override
    public void accept(Integer t) {
        System.out.println(t);

    }

}
