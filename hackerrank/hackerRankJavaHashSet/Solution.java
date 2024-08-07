package hackerRankJavaHashSet;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        Set<String> pair = new HashSet<>();
        for(int i=0; i<t; i++) {
            pair.add(String.format("%s %s", pair_left[i], pair_right[i]));
            System.out.println(pair.size()); //if you add the same element twice, it will be added only once. The second addition will return false.
        }
        s.close();
    }
}