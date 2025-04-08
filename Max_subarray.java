public class Max_subarray {
    public int maxSubArray(int[] nums) {
        int total = 0; // Tracks the current subarray sum
        int result = nums[0]; // Tracks the maximum subarray sum

        for (int i = 0; i < nums.length; i++) {
            total += nums[i]; // Add the current element to the total

            // Update the result if the current total is greater
            if (total > result) {
                result = total;
            }

            // Reset total to 0 if it becomes negative
            if (total < 0) {
                total = 0;
            }
        }

        return result; // Return the maximum subarray sum
    }

    public static void main(String[] args) {
        Max_subarray obj = new Max_subarray();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Result: " + obj.maxSubArray(nums));
    }
}