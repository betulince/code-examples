package dataStructuresAndAlgorithms.hashSet.containsDuplicate2;

import java.util.HashSet;

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // there must be duplicates
        // and subtraction of those indexes of the duplicates must be less than or equals to k 
        // so those values need to be within a specified distance "k"
        // 1. brute-force --> O(n^2)
        // 2. hashset --> O(n)
        if (nums == null || nums.length == 0) {
            return false;
        }

        HashSet<Integer> uniqueElements = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > k) {
                // Subtracting k + 1 from the current index i gives us the index of the oldest element in the sliding window
                uniqueElements.remove(nums[i - k - 1]); // so we just eliminate that item and see if we encounter in a new value that satisfies the condition in the future
            }
            if (uniqueElements.contains(nums[i])) {
                return true;
            } 
            uniqueElements.add(nums[i]);
        }
        return false;
    }

}