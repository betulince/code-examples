public class Solution {
    public int removeDuplicates(int[] nums) {

        if (nums.length <= 1) {
            return nums.length;
        }

        int elementCount = 1; // This will keep track of the unique elements in the array
        // It starts with 1 because the first element of the array always counts as unique

        for (int i=1; i<nums.length; i++) { // Compare each element with the previous one
            if (nums[i] != nums[elementCount-1]) {
                nums[elementCount] = nums[i]; // If new unique element is found, it updates the array at index 'elementCount' with the value of the current element
                // And this effectively overrides any duplicate element with the new unique element
                elementCount++;
            }
        }
        return elementCount;
    }
}