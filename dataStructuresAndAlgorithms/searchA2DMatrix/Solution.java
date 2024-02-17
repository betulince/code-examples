package dataStructuresAndAlgorithms.searchA2DMatrix;

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int row = matrix.length;
        int columns = matrix[0].length;

        int low = 0;
        int high = row * columns - 1;

        while (low <= high) {
            int midIndex = low + (high - low) / 2;
            int midValue = matrix[midIndex / columns][midIndex % columns]; // quotient and the remainder 
            // to find the midValue's row and column index 

            if (midValue == target) {
                return true;
            } else if (midValue > target) {
                high = midIndex - 1;
            } else {
                low = midIndex + 1;
            }
        }
        return false;

    }
}
