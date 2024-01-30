class Solution {
    public int removeDuplicates(int[] nums) {

        int lenghtOfTheList = nums.length;

        // Special case
        if (lenghtOfTheList <= 2) {
            return lenghtOfTheList;
        }

        int currentIndex = 1;
        int currentElementCount = 1;

        for (int i = 1; i < lenghtOfTheList; i++) {

            if (nums[i] == nums[currentIndex-1]) {
                currentElementCount++;
            } else {
                currentElementCount = 1;
            }

            if (currentElementCount <= 2) { // Keep adding the value to the current index as long as the occurence of the element is less than or equals to 2.
                nums[currentIndex] = nums[i];
                currentIndex++;
            }
        }
        return currentIndex;
    }

}
