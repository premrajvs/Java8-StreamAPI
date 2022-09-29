package com.performanceengineering101;

public class class1 implements interface1, interface2 {

    // I am overriding the method because it is defined in both interfaces. To avoid
    // multiple inheritance problem, we are doing this.
    @Override
    public void somemethod() {
        System.out.println("class 1");

    }
	// Changes made on develop branch on 09/07
	// developer 1 making changes on 09/22 on master branch
}
