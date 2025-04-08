# LeetCode Solutions

This repository contains solutions to various coding problems, along with detailed explanations of the problems and the optimized approaches used to solve them. Each problem is linked to its respective file for easy access.

---

## Problems and Solutions

### 1. Find Missing Number in Array
- **Problem**:  
  You are given an array of size `n` containing numbers from `0` to `n`, but one number is missing. The task is to find the missing number efficiently.  
  For example, if the input array is `[3, 0, 1]`, the missing number is `2`.

- **Optimized Approach**:  
  Use the formula for the sum of the first `n` natural numbers:  
  `Sum = (n * (n + 1)) / 2`  
  Subtract the sum of the array elements from the total sum to find the missing number in `O(n)` time with `O(1)` space.

- **[Solution File](finding_missing_number_in_array.c)**

---

### 2. Check if a Number is a Power of Two
- **Problem**:  
  Determine if a given number is a power of two. A number is a power of two if it can be expressed as `2^k`, where `k >= 0`. For example:
  - `4` is a power of two (`2^2`).
  - `6` is not a power of two.

- **Optimized Approach**:  
  Use a bitwise operation to check if the number has only one bit set in its binary representation. The condition `n > 0 && (n & (n - 1)) == 0` works because:
  - `n & (n - 1)` clears the rightmost set bit.
  - If the result is `0`, the number is a power of two.

- **[Solution File](find_if_a_number_is_pow_of_two.c)**

---

### 3. Find Two Distinct Numbers in an Array
- **Problem**:  
  Given an array where every element appears twice except for two distinct elements, find those two elements. For example:
  - Input: `[2, 4, 7, 9, 2, 4]`
  - Output: `[7, 9]`

- **Optimized Approach**:  
  - XOR all elements in the array. The result will be the XOR of the two distinct numbers.
  - Find the rightmost set bit in the XOR result. This bit differentiates the two numbers.
  - Divide the numbers into two groups based on this bit and XOR the numbers in each group to isolate the two distinct numbers.

- **[Solution File](find_2_distinct_in_array.c)**

---

### 4. Maximum Subarray
- **Problem**:  
  Find the contiguous subarray with the largest sum in a given array. For example:
  - Input: `[-2, 1, -3, 4, -1, 2, 1, -5, 4]`
  - Output: `6` (subarray `[4, -1, 2, 1]`).

- **Optimized Approach**:  
  Use Kadane's Algorithm:
  - Maintain a running sum and reset it to `0` if it becomes negative.
  - Track the maximum sum encountered during the iteration.
  This approach runs in `O(n)` time with `O(1)` space.

- **[Solution File](Max_subarray.java)**

---

### 5. Product of Array Except Self
- **Problem**:  
  Given an array, return an array where each element is the product of all elements except itself. For example:
  - Input: `[1, 2, 3, 4]`
  - Output: `[24, 12, 8, 6]`.

- **Optimized Approach**:  
  - Use two arrays to store the prefix and suffix products.
  - Multiply the prefix and suffix products for each element to get the result.
  This approach avoids division and runs in `O(n)` time with `O(n)` space.

- **[Solution File](Product_of_Array_Except_Self.java)**

---

### 6. Container with Most Water
- **Problem**:  
  Given an array of heights, find the maximum area of water that can be contained between two lines. For example:
  - Input: `[1,8,6,2,5,4,8,3,7]`
  - Output: `49`.

- **Optimized Approach**:  
  Use a two-pointer approach:
  - Start with the left and right pointers at the ends of the array.
  - Move the pointer pointing to the shorter line inward to maximize the area.
  This approach runs in `O(n)` time.

- **[Solution File](Container_with_most_water.java)**

---

### 7. Search in Rotated Sorted Array
- **Problem**:  
  Search for a target in a rotated sorted array. For example:
  - Input: `[4, 5, 6, 7, 0, 1, 2]`, Target: `0`
  - Output: `4`.

- **Optimized Approach**:  
  Use a modified binary search:
  - Determine which half of the array is sorted.
  - Narrow the search to the sorted half if the target lies within its range.
  This approach runs in `O(log n)` time.

- **[Solution File](Search_in_Rotated_sorted_array.java)**

---

### 8. Generate Secure Code
- **Problem**:  
  Calculate the absolute difference between the sum of primes and non-primes in a range. For example:
  - Input: `m = 1, n = 10`
  - Output: `17`.

- **Optimized Approach**:  
  Use the Sieve of Eratosthenes to efficiently find all primes in the range. Iterate through the range to calculate the sums of primes and non-primes. This approach runs in `O(n log log n)` time.

- **[Solution File](Generate_Secure_code-1.java)**

---

### 9. XOR from 0 to N
- **Problem**:  
  Calculate the XOR of all numbers from `0` to `N`.  
  For example:
  - Input: `5`
  - Output: `1`.

- **Optimized Approach**:  
  Use the pattern:
  - `n % 4 == 0`: XOR is `n`.
  - `n % 4 == 1`: XOR is `1`.
  - `n % 4 == 2`: XOR is `n + 1`.
  - `n % 4 == 3`: XOR is `0`.

- **[Solution File](XOR.c)**

---

### 10. Alien Dictionary
- **Problem**:  
  Check if words are sorted according to a custom alphabet order.  
  For example:
  - Input: `["hello", "leetcode"]`, Order: `"hlabcdefgijkmnopqrstuvwxyz"`
  - Output: `true`.

- **Optimized Approach**:  
  Map each character to its position in the custom order. Compare adjacent words character by character to ensure they are in the correct order.

- **[Solution File](alien_directory.java)**

---

### 11. Print Numbers from 1 to 100 Without Loops
- **Problem**:  
  Print numbers from `1` to `100` without using loops.

- **Optimized Approach**:  
  Use recursion to print numbers incrementally.

- **[Solution File](Print1to100withoutloop.java)**

---

### 12. Remove Duplicates in Sorted Array
- **Problem**:  
  Remove duplicates from a sorted array.  
  For example:
  - Input: `[1, 1, 2]`
  - Output: `[1, 2]`.

- **Optimized Approach**:  
  Use two pointers:
  - One pointer iterates through the array.
  - The other pointer tracks the position of unique elements.

- **[Solution File](Remove_duplicate_in_Sorted_Array.java)**

---

### 13. Diamond Pattern
- **Problem**:  
  Print a diamond pattern of stars.

- **Optimized Approach**:  
  Use nested loops:
  - The outer loop controls the rows.
  - The inner loops print spaces and stars for each row.

- **[Solution File](diamond.c)**

---

### 14. Number Pattern
- **Problem**:  
  Print a specific number pattern based on input.  
  For example:
  - Input: `3`
  - Output:  
    ```
    33333
    32223
    32123
    32223
    33333
    ```

- **Optimized Approach**:  
  Use nested loops to generate the pattern:
  - The outer loop controls the rows.
  - The inner loops print decreasing and increasing numbers.

- **[Solution File](number_pattern.c)**

---

### 15. Calculate with Base
- **Problem**:  
  Convert the sum of two numbers to a given base.  
  For example:
  - Input: `num1 = 5, num2 = 7, base = 2`
  - Output: `1100`.

- **Optimized Approach**:  
  Use division and modulus to convert the sum to the desired base.

- **[Solution File](calculate_with_base.c)**

---

### 16. Unset Set Bits
- **Problem**:  
  Find all unset bits in a number.

- **Optimized Approach**:  
  Iterate through all bits of the number and check if each bit is unset using bitwise operations.

- **[Solution File](unset_set_bit.c)**

---

This updated `Readme.md` now includes **all the problems** from your workspace with detailed explanations and optimized approaches. Let me know if you need further refinements! 😊