package hackerRankJavaLoops2;
import java.util.*;
import java.io.*;
import java.lang.Math;
import java.util.ArrayList;
import java.util.stream.*;
import java.util.function.*;

public class Solution {
    public static <T, U> List<U>
    convertIntListToStringList(List<T> listOfInteger,
                               Function<T, U> function)
    {
        return listOfInteger.stream()
                .map(function)
                .collect(Collectors.toList());
    }
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0; i<t ;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            ArrayList<Integer> series = new ArrayList<>();
            for (int j=0; j<=n-1; j++) {
                int k=j;
                int seriesElement = a;
                while(k>=0) {
                    seriesElement += (int)(b*Math.pow(2,k));
                    k--;
                }
                series.add(seriesElement);
            }
            List<String> listOfString = convertIntListToStringList(series, s -> String.valueOf(s));
            StringBuffer sb = new StringBuffer();
            for (String s : listOfString) {
                sb.append(s);
                sb.append(" ");
            }
            String str = sb.toString();
            System.out.println(str);
        }
        in.close();
    }
}
