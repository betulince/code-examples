public class Solution {
    public int hIndex(int[] citations) {

        int n = citations.length;
        int[] count = new int[n + 1];

        // Count the number of papers for each citation count
        for (int citation : citations) {
            if (citation >= n) {
                count[n]++;
            } else {
                count[citation]++;
            }
        }

        int citationCount = 0;

        // Traverse the count array from right to left to find the h-index
        for (int i = n; i >= 0; i--) {
            citationCount += count[i];
            if (citationCount >= i) {
                return i;
            }
        }

        return 0;
    }
}

