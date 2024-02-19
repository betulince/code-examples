package datastructuresandalgorithms.searchA2DMatrix;

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
            
            /*
            to find the midValue's row and column index 
             * 1  2  3  4
            5  6  7  8
            9 10 11 12
            Now, let's say we're trying to access the element at index 5 in a flattened representation of this matrix. In the flattened representation, the index 5 corresponds to the value 6 in the original matrix.

            Here's how it works:

            Calculate the row index: 5 / 4 = 1. So, the row index is 1.
            Calculate the column index: 5 % 4 = 1. So, the column index is 1.
            Therefore, the element at index 5 in the flattened representation corresponds to the element at row 1 and column 1 in the original matrix, which is 6.
             */

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
