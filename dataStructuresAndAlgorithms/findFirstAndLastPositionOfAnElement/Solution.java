package dataStructuresAndAlgorithms.findFirstAndLastPositionOfAnElement;

public class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int[] result = new int[]{-1, -1};
        if (nums == null && nums.length == 0) {
            return result;
        }

        int start = findStartPoint(nums, target);
        int end = findEndPoint(nums, target);

        result[0] = start;
        result[1] = end;

        return result;

    }

    public int findStartPoint(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] < target) {
                low = mid + 1;
            } else if (nums[mid] >= target) {
                high = mid - 1;
            }
        }

        if (low < nums.length && nums[low] == target) {
            return low;
        } else {
            return -1;
        }

    }

    public int findEndPoint(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] <= target) {
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            }
        }

        if (high >= 0 && nums[high] == target) {
            return high;
        } else {
            return -1;
        }

    }
}