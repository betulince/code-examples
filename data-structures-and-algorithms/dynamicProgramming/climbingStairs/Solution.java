class Solution {
    public int climbStairs(int n) {
        // Dynamic programming (memoized solution)
        // Each leaf node represents a unique combination of steps taken to reach the top of the staircase.

        if (n == 1) {
            return 1;
        }

        int[] ways = new int[n+1];
        ways[1] = 1;
        ways[2] = 2;

        for (int i=3; i<=n; i++) {
            ways[i] = ways[i-1] + ways[i-2];
        }

        return ways[n];
    }

}