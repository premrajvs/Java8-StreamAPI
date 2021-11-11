package com.performanceengineering101;

import java.util.List;
import java.util.Arrays;

public class class2 {
    public static void main(String[] args) {
        class2 obj = new class2();
        obj.somemethod();
    }

    public void somemethod() {
        List<Integer> myList = Arrays.asList(1, 2, 3, 4, 5, 6);

        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }
}
