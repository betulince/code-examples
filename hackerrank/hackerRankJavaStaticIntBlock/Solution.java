package hackerRankJavaStaticIntBlock;
import java.io.*;
import java.util.*;

public class Solution {
    static void areaOfParallelogram() {
        Scanner sc = new Scanner(System.in);
        int B = sc.nextInt();
        int H = sc.nextInt();

        try {
            if (B>0 && H>0) {
                int areaOfParallelogram = B*H;
                System.out.println(areaOfParallelogram);
            } else {
                System.out.println("java.lang.Exception: Breadth and height must be positive");
            }
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution.java.java. */
        areaOfParallelogram();
    }
}
