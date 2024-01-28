package hackerRankJavaGenerics;

import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Solution {

    public static <T> void printArray(T[] list) {
        Stream<T> stream = Stream.of(list);

        stream.forEach(System.out::println);
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        printArray(intArray);
        printArray(stringArray);
    }
}
