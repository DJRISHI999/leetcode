public class Product_of_Array_Except_Self {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[][] matrix = new int[n][n];
        int[] result = new int[n];

        // Step 1: Initialize the 2D array with 1 on the diagonal and 0 elsewhere
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    matrix[i][j] = 1; // Principal diagonal
                } else {
                    matrix[i][j] = nums[j]; // Fill with nums[j]
                }
            }
        }

        // Step 2: Calculate the product for each row, skipping the diagonal element
        for (int i = 0; i < n; i++) {
            int product = 1;
            for (int j = 0; j < n; j++) {
                if (i != j) { // Skip the diagonal element
                    product *= matrix[i][j];
                }
            }
            result[i] = product;
        }

        return result;
    }

    public static void main(String[] args) {
        Product_of_Array_Except_Self obj = new Product_of_Array_Except_Self();
        int[] nums = {1, 2, 3, 4};
        int[] result = obj.productExceptSelf(nums);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}