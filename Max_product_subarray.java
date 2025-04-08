public class Max_product_subarray {
    public int maxProduct(int[] nums) {
        // Initialize variables
        int maxproduct = nums[0];
        int minproduct = nums[0];
        int result = nums[0];     

        // Iterate through the array
        for (int i = 1; i < nums.length; i++) {
            int temp = maxproduct; // Store the current maxproduct temporarily

            // Update maxproduct and minproduct
            maxproduct = Math.max(nums[i], Math.max(maxproduct * nums[i], minproduct * nums[i]));
            minproduct = Math.min(nums[i], Math.min(temp * nums[i], minproduct * nums[i]));

            // Update the result with the maximum product so far
            result = Math.max(result, maxproduct);
        }

        return result; // Return the maximum product subarray
    }

    public static void main(String[] args) {
        Max_product_subarray obj = new Max_product_subarray();
        int[] nums = {2, 3, -2, 4};
        System.out.println("Maximum Product Subarray: " + obj.maxProduct(nums));
    }
}