# Java8-Generics
Step by Step Java Programs to Understand Java 8 Concepts

# Understanding Interface Level Changes in Java 8
Before Java 8, by default all methods in Interface are public and abstract. However, when Java introduced Stream API, It added new methods to its interfaces like List (Datastructure to hold data). Now, It is not possible for developers all around the world to go back and change their application codes to implement the unimplemented methods (added in java 8 version). Thefore, Oracle introduced 
"default" keyword for methods in Interface which can be defined

# Class2 and Class 3
Shows how Collection can be iterated externally

# class 4 : Foreach Method
Foreach accepts ConsumerInterface object. So, we are creating a class that implements Consumer Interface. This consumer interface is a functional interface which has only method that needs to be implemented in the class that accepts input of type same as the class type

 /**
     * Performs this operation on the given argument.
     *
     * @param t the input argument
     */
    void accept(T t);

# class 4interim and interm1
Changed to Anonymous Class to avoid creating a separate class for the consumer implementation
Change the syntax to lambda expression

Interface is of 3 type. 
    1. Interface with normal abstract methods
    2. Marker Interface - Interface with no methods
    3. Functional Interface - Single Method Abstraction
Since Java 1.8, SAM interface are called Functional Interface.

Since Consumer is a functional interface, I can use Lambda expression here (Please note Lambda expression can only be used for functional interface)

# class 5
Implement by method reference. :: implies Method reference. 
Syntax is Object :: Method
Method is passed as reference.

# class 6
More detailed example for a Method passed as reference.
Added a separate method and called it by class reference since it is static

# class 7
This class shows how we can avoid mutation and ensure concurrency. Subsequent classes explains step by step how this is achieved. There are 3 steps
    1. Stream
    2. Map
    3. reduce

# class 8
1. Creating Stream using .stream() method
2. To work on the data, we need a map object. Map needs functional object. This Function object takes 2 parameters. Integer type and return type. This Function interface has only 1 method named accept. This Function object can be passed to map method.
3. Last step, is output the stream. I am using a Foreach method here for the same using Method reference

# class 9
Replacing Foreach with reduce. Reduce needs a BinaryOperator. This BinaryOperator interface has only defined methods (no abstract methods). However, this BinaryOperator interface implements BiFunction interface which has a accept abstract method.

@FunctionalInterface
public interface BinaryOperator<T> extends BiFunction<T,T,T>

@FunctionalInterface
public interface BiFunction<T, U, R> {

/**
     * Applies this function to the given arguments.
     *
     * @param t the first function argument
     * @param u the second function argument
     * @return the function result
     */
    R apply(T t, U u);

Now, we have implemented stream -> map -> reduce. As next steps, we will reduce the number of lines of code and make it more efficient

# class 10
Applying the concepts learnt in class 2 to 4 for map method and reduce method

# class 11
Combined both map and reduce in the same line. This is the code we saw in class 7

# class 12
Same code but used method reference as part of the reduce method

# class 13 : Introduction to Predicate Interface
Example of how to use Filter

# class 14 : Introducing findFirst()
After you stream the data, you check for a condition and once it is true for the first time, it exits
 
Also, in terms of Improving Efficiency by Lazy Evaluation & Termination
If we are only looking for 1 value, it is waste of time and resources to stream all the elements and filter and map. But actually, all these methods are Lazy methods. Which means that stream, map, filter, etc. do not wait for the predecessor to complete all the elements. Once 1 element is parsed, control moves to next part. So, for a huge data set, all these activities are happening concurrently which makes efficiency much better

# General Notes about Stream API
Stream Operations are of 2 types
1. Intermediate Operations : anyMatch() distinct() filter() findFirst() flatmap() map() skip() sorted() collect()
2. Terminal Operations : forEach, collect and reduce returns either void or non-stream result 
Order of operations affect the performance. It is better to filter before other operations on the dataset
