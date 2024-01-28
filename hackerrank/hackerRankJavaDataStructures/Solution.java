package hackerRankJavaDataStructures;

import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); //total lines
        ArrayList<ArrayList<Integer>> numberList = new ArrayList<>();
        for (int i=0; i<n; i++) {
            int d = scan.nextInt(); //size of the line
            ArrayList<Integer> subList = new ArrayList<>();
            for (int j=0; j<d; j++) {
                int number = scan.nextInt();
                subList.add(number);
            }
            numberList.add(subList);
            //System.out.println(numberList);
        }
        int q = scan.nextInt();
        for (int i=0; i<q; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            try {
                System.out.println(numberList.get(x-1).get(y-1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
        scan.close();
    }
}