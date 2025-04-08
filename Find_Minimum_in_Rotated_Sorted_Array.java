public class Find_Minimum_in_Rotated_Sorted_Array {
    public static int split(int [] nums, int left, int right) {
        if (left == right) {
            return nums[left];
        }
        if (nums[left] < nums[right]) {
            return nums[left];
        }
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return nums[left];

    }
    public int findMin(int[] nums) {
        return split(nums,0,nums.length-1);

    }

    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1, 2};
        Find_Minimum_in_Rotated_Sorted_Array solution = new Find_Minimum_in_Rotated_Sorted_Array();
        int min = solution.findMin(nums);
        System.out.println("The minimum element in the rotated sorted array is: " + min);
    }
}
