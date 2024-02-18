package dataStructuresAndAlgorithms.longestConsecutiveSequence;

import java.util.HashSet;

public class Solution {
    public int longestConsecutive(int[] nums) {
        // 10 2 20 1 3 4 11 -> 1 2 3 4 -> 4
        // hashset --> unique elements

        HashSet<Integer> uniqueSet = new HashSet<>();
        for (int num : nums) {
            uniqueSet.add(num);
        }

        int maxSequence = 0;
        for (int num : nums) {
            int previous = num - 1; // Represents the number that is one less than the current num.
            int currentSequence = 0; // Represents the length of the current consecutive sequence.

            // Checks if the previous number is not present in the uniqueSet. If it's not present, it means that the current num could potentially be the start of a new consecutive sequence.
            if (!uniqueSet.contains(previous)) { 
                while (uniqueSet.contains(previous + 1)) { // Indicating that there is a consecutive sequence, the loop continues.
                    currentSequence += 1;
                    previous += 1;
                }
                maxSequence = Math.max(maxSequence, currentSequence);
            }
        }

        return maxSequence;
    }
}