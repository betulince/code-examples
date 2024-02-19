package datastructuresandalgorithms.findPeakElement;

public class Solution {
    public int findPeakElement(int[] nums) {

        if (nums.length == 1) {
            return 0;
        }

        if (nums[0] > nums[1]) { // if first element is the peak
            return 0;
        }

        if (nums[nums.length - 1] > nums[nums.length - 2]) { // if last element is the peak
            return nums.length - 1; 
        }
    
        // search in the remaining array
        int low = 1;
        int high = nums.length - 2;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid-1] < nums[mid] && nums[mid+1] < nums[mid]) {
                return mid;
            } else if (nums[mid-1] > nums[mid]) {
                high = mid - 1;
            } else if (nums[mid+1] > nums[mid]) {
                low = mid + 1;
            }
        }
        return 1; // dummy 
    }
}