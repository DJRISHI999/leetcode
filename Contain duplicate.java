class Solution {
    public static boolean merge(int[] nums, int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            // Recursively divide the array
            if (merge(nums, l, mid)) return true; // Check for duplicates in the left half
            if (merge(nums, mid + 1, r)) return true; // Check for duplicates in the right half

            // Check for duplicates before merging two arrays of length 1
            if (nums[mid] == nums[mid + 1]) {
                System.out.println("Duplicate found during merge: " + nums[mid]); // Debugging
                return true;
            }

            // Merge the two halves
            mergeSort(nums, l, mid, r);
        }
        return false;
    }

    public static void mergeSort(int[] nums, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for (int i = 0; i < n1; i++) {
            L[i] = nums[l + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = nums[mid + 1 + j];
        }

        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                nums[k] = L[i];
                i++;
            } else {
                nums[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            nums[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            nums[k] = R[j];
            j++;
            k++;
        }
    }

    public boolean containsDuplicate(int[] nums) {
        // Use the modified merge function to check for duplicates
        return merge(nums, 0, nums.length - 1);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        Solution obj = new Solution();
        System.out.println("Contains Duplicate: " + obj.containsDuplicate(nums));

        int[] nums2 = {1, 2, 3, 1};
        Solution obj2 = new Solution();
        System.out.println("Contains Duplicate: " + obj2.containsDuplicate(nums2));
    }
}