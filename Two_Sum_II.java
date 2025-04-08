public class Two_Sum_II {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0; // Initialize as index, not value
        int right = numbers.length - 1; // Correct initialization of right pointer

        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum < target) {
                left++; // Move left pointer to the right
            } else if (sum > target) {
                right--; // Move right pointer to the left
            } else {
                return new int[]{left + 1, right + 1}; // Return 1-based indices
            }
        }

        return new int[0]; // Return empty array if no solution is found
    }

    public static void main(String[] args) {
        Two_Sum_II solution = new Two_Sum_II();
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(numbers, target);

        if (result.length == 2) {
            System.out.println("Indices of numbers that add up to " + target + ": " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found.");
        }
    }
}
