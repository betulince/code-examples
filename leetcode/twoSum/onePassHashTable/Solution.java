package leetcode.twoSum.onePassHashTable;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> pairs = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (pairs.containsKey(target - nums[i])) { // check if the value exists
                return new int[]{i, pairs.get(target - nums[i])}; // if it exists return the current element's index and the value of the key from HashTable
            }
            pairs.put(nums[i], i); // key: value of the element, value: index
        }
        return new int[]{};
    }
}