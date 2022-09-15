package hackerRankJavaSubarray;

import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i<n; i++) {
            int item = scanner.nextInt();
            list.add(item);
        }
        //System.out.println(list);
        int counter = 0;
        for (int i=0; i<n; i++) { //starting point of the sub array

            for (int j=i; j<n+1; j++) { //end point of the sub array
                int sum = 0;
                // so if my starting point is i; then my end point can be i up to n
                for (int k=i; k<j; k++) {
                    sum += list.get(k);
                }
                if (sum < 0) {
                    counter++;
                }
            }
        }
        System.out.println(counter);
        scanner.close();
    }

}