package leetcode.hashTable.intersectionOfTwoArrays;

import java.util.HashSet;

public class Solution {
    /**
     * Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        
        HashSet<Integer> nums1UniqueElements = new HashSet<Integer>();
        HashSet<Integer> nums2UniqueElements = new HashSet<Integer>();
        for (Integer i : nums1) {
            nums1UniqueElements.add(i);
        }
        for (Integer i : nums2) {
            if (nums1UniqueElements.contains(i)) {
                nums2UniqueElements.add(i);
            }
        }

        int[] result = new int[nums2UniqueElements.size()];

        int index = 0;
        for (Integer i : nums2UniqueElements) {
            result[index] = i;
            index++;

        }
        return result;
    }
}