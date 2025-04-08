public class Search_in_Rotated_sorted_array {
    public static int split(int[] nums, int left, int right, int target) {
        if (left > right) {
            return -1;
        }


        if (nums[left] == target) {
            return left;
        }
        if (nums[right] == target) {
            return right;
        }

     
        int mid = left + (right - left) / 2;

   
        if (nums[mid] == target) {
            return mid;
        }

        // Determine which half is sorted
        if (nums[left] < nums[mid]) {
            // Left half is sorted
            if (nums[left] <= target && target < nums[mid]) {
                return split(nums, left, mid - 1, target); // Search in the left half
            } else {
                return split(nums, mid + 1, right, target); // Search in the right half
            }
        } else {
            // Right half is sorted
            if (nums[mid] < target && target <= nums[right]) {
                return split(nums, mid + 1, right, target); // Search in the right half
            } else {
                return split(nums, left, mid - 1, target); // Search in the left half
            }
        }
    }

    public int search(int[] nums, int target) {
        return split(nums, 0, nums.length - 1, target);
    }

    public static void main(String[] args) {
        Search_in_Rotated_sorted_array solution = new Search_in_Rotated_sorted_array();
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int result = solution.search(nums, target);
        System.out.println("Index of target " + target + ": " + result);
    }
}