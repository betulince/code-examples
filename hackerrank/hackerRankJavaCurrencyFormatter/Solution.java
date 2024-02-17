package hackerRankJavaCurrencyFormatter;

import java.util.*;
import java.text.*;

public class Solution {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            double payment = scanner.nextDouble();
            Locale INDIA = new Locale("en", "IN"); //construct India currency

            NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
            NumberFormat india = NumberFormat.getCurrencyInstance(INDIA);
            NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
            NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
            //DecimalFormat is used to produce a formatted String. If you print it directly,
            //it will show its memory address cause that is what the DecimalFormat.toString() does.
            //Instead, you should use it to produce your output string and print that directly.

            String usCurrency = us.format(payment);
            String indiaCurrency = india.format(payment);
            String chinaCurrency = china.format(payment);
            String franceCurrency = france.format(payment);

            System.out.println("US: " + usCurrency);
            System.out.println("India: " + indiaCurrency);
            System.out.println("China: " + chinaCurrency);
            System.out.println("France: " + franceCurrency);
        }
    }
}
