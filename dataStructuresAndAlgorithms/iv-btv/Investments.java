import java.util.List;

/*
 * An investor opens a new account and wants to invest in a number of assets. Each asset begins with a balance of 0, 
 * and its value is stored in an array using 1-based indexing. Periodically, a contribution is received and equal 
 * investments made in a subset of the portfolio. Each contribution will be given by investment amount, start index, 
 * end index. Each investment in that range will receive the contribution amount. Determine the maximum amount invested 
 * in any one investment after all contributions.
 * Note that the investments array is not provided in the function. It is to be created after the number of assets available is known.
 * Let me give you an example: start with an array of 5 elements: investments= [0, 0, 0, 0, 0]. The variables left and right represent 
 * the starting and ending indices, inclusive. Another variable, contribution, is the new funds to invest per asset. 
 * The first investment is at index 1.
 * If left, right, contribution: 1, 2, 10 then the investments list is: [10,10,0,0,0]
 * Then if the left, right and contribution is 2,4,5 then the investments list is: [10,15,5,5,0]
 * Then if the left, right, contribution is 3,5,12 then the investments list is: [10,15,17,17,12]
 *  And finally the maximum invested in any one asset is 17.
 * 
 * Input from stdin should be processed as follows and passed to the function
 * The first line contains an integer, n, the number of investments available.
 * The second line contains an integer, o, the number of rounds of investment.
 * The next line contains the integer 3, the number of elements used to define each round of investment.
 * Each of the following o lines contains 3 space-separated integers, left, right, and contribution the starting index, 
 * ending index and value to add
 */

 public class Investments {
    public static long maxValue(int n, List<List<Integer>> rounds) {
        
        long[] investmentList = new long[n];

        for (List<Integer> round : rounds) {
            int left = round.get(0);
            int right = round.get(1);
            int contribution = round.get(2);


        }

    }

    public static void main(String[] args) {
        // Example usage
        int n = 5;
        List<List<Integer>> rounds = List.of(
            List.of(1, 2, 100),
            List.of(2, 5, 100),
            List.of(3, 4, 100)
        );
        System.out.println(maxValue(n, rounds)); // Output: 200
    }
}


public class Investments {
    public static long maxValue(int n, List<List<Integer>> rounds) {
        long[] cumulativeInvestments = new long[n + 2]; // Adjust for 1-based indexing
        
        // Iterate through each round of contributions
        for (List<Integer> round : rounds) {
            int left = round.get(0);
            int right = round.get(1);
            int contribution = round.get(2);
            
            // Update cumulative investments for the start and end of the range
            cumulativeInvestments[left] += contribution;
            cumulativeInvestments[right + 1] -= contribution;
        }
        
        // Calculate the actual investments based on cumulative contributions
        long maxInvestment = cumulativeInvestments[1];
        for (int i = 2; i <= n; i++) {
            cumulativeInvestments[i] += cumulativeInvestments[i - 1];
            maxInvestment = Math.max(maxInvestment, cumulativeInvestments[i]);
        }
        
        return maxInvestment;
    }

    public static void main(String[] args) {
        // Example usage
        int n = 5;
        List<List<Integer>> rounds = List.of(
            List.of(1, 2, 100),
            List.of(2, 5, 100),
            List.of(3, 4, 100)
        );
        System.out.println(maxValue(n, rounds)); // Output: 200
    }
}