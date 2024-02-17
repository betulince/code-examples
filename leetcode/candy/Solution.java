package leetcode.candy;

public class Solution {
    public int candy(int[] ratings) {
        
        int n = ratings.length;
        int[] candies = new int[n];

        for (int i=0; i<n; i++) {
            candies[i] = 1;
        }

        for (int i=1; i<n; i++) {
            if (ratings[i] > ratings[i-1]) { // compare right with left
                candies[i] = candies[i-1] + 1; // current child gets more candies then its neighbor
            }
        }

        for (int i=n-2; i>=0; i--) { // start from the left neighbor of the last child - so compare left with right
            if (ratings[i] > ratings[i+1]) {
                // second round
                // it could be already satisfying the condition
                // so we need to check if the current value is already higher than the new potential value
                candies[i] = Math.max(candies[i], candies[i+1] + 1);
            }
        }

        int totalCandies = 0;
        for (int candy : candies) {
            totalCandies += candy;
        }

        return totalCandies;
    }
}
