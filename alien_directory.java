import java.util.*;

public class alien_directory {
    public boolean isAlienSorted(String[] words, String order) {
        // Step 1: Create a mapping of each character to its position in the custom order
        int[] orderMap = new int[26];
        for (int i = 0; i < order.length(); i++) {
            orderMap[order.charAt(i) - 'a'] = i;
        }

        // Step 2: Compare each pair of adjacent words
        for (int i = 0; i < words.length - 1; i++) {
            if (!isInCorrectOrder(words[i], words[i + 1], orderMap)) {
                return false;
            }
        }

        return true;
    }

    private boolean isInCorrectOrder(String word1, String word2, int[] orderMap) {
        int len1 = word1.length();
        int len2 = word2.length();
        int minLength = Math.min(len1, len2);

        // Compare characters of both words
        for (int i = 0; i < minLength; i++) {
            char c1 = word1.charAt(i);
            char c2 = word2.charAt(i);

            if (c1 != c2) {
                // Compare their positions in the custom order
                return orderMap[c1 - 'a'] < orderMap[c2 - 'a'];
            }
        }

        // If all characters are the same, the shorter word should come first
        return len1 <= len2;
    }

    public static void main(String[] args) {
        alien_directory solution = new alien_directory();

        // Example 1
        String[] words1 = {"hello", "leetcode"};
        String order1 = "hlabcdefgijkmnopqrstuvwxyz";
        System.out.println(solution.isAlienSorted(words1, order1)); // Output: true

        // Example 2
        String[] words2 = {"word", "world", "row"};
        String order2 = "worldabcefghijkmnpqstuvxyz";
        System.out.println(solution.isAlienSorted(words2, order2)); // Output: false

        // Example 3
        String[] words3 = {"apple", "app"};
        String order3 = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(solution.isAlienSorted(words3, order3)); // Output: false
    }
}