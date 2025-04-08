import java.util.HashMap;

public class Contain_duplicate_II {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Iteration " + (i + 1) + ":");
            System.out.println("Current number: " + nums[i]);
            System.out.println("Current HashMap: " + hm);

            if (hm.containsKey(nums[i])) {
                int prevIndex = hm.get(nums[i]);
                System.out.println("Duplicate found for " + nums[i] + " at index " + prevIndex);
                System.out.println("Current index: " + i + ", Previous index: " + prevIndex + ", Difference: " + (i - prevIndex));

                if (i - prevIndex <= k) {
                    System.out.println("Duplicate within range k = " + k);
                    return true;
                } else {
                    System.out.println("Duplicate found but not within range k. Updating index.");
                    hm.replace(nums[i], i);
                }
            } else {
                System.out.println("No duplicate found for " + nums[i] + ". Adding to map.");
                hm.put(nums[i], i);
            }
            System.out.println(); // Add a blank line for readability
        }
        System.out.println("No duplicates within range k found.");
        return false;
    }

    public static void main(String[] args) {
        Contain_duplicate_II obj = new Contain_duplicate_II();
        int[] nums = {1, 2, 3, 1, 2, 3};
        int k = 2;
        System.out.println("Result: " + obj.containsNearbyDuplicate(nums, k));
    }
}