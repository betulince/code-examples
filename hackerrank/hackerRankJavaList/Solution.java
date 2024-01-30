package hackerRankJavaList;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution.java. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++) {
            int element = scan.nextInt();
            list.add(element);
        }
        int q = scan.nextInt();
        while (q-- > 0){
            String query = scan.next();
            String firstOption = "Insert";
            String secondOption = "Delete";
            if (query.equals(firstOption)) {
                int x = scan.nextInt();
                int y = scan.nextInt();
                list.add(x,y);
            }
            if (query.equals(secondOption)){
                int x = scan.nextInt();
                list.remove(x);
            }
        }
        String listStr = list.toString();
        String newList= listStr.substring(1, listStr.length()-1).replaceAll(", ", " ");
        System.out.println(newList);
        scan.close();
    }
}

