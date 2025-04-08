# LeetCode Solutions

This repository contains solutions to various coding problems, along with detailed explanations of the problems and the optimized approaches used to solve them. Each problem is linked to its respective file for easy access.

---

## Problems and Solutions

### 1. Find Missing Number in Array
- **Problem**:  
  You are given an array of size `n` containing numbers from `0` to `n`, but one number is missing. The task is to find the missing number efficiently.  
  For example, if the input array is `[3, 0, 1]`, the missing number is `2`.

- **Optimized Approach**:  
  Instead of iterating through the array multiple times, we use the formula for the sum of the first `n` natural numbers:  
  \[
  \text{Sum} = \frac{n \times (n + 1)}{2}
  \]  
  Calculate the total sum using this formula and subtract the sum of the array elements from it. This gives the missing number in \(O(n)\) time with \(O(1)\) space.

- **[Solution File](finding_missing_number_in_array.c)**

---

### 2. Check if a Number is a Power of Two
- **Problem**:  
  Determine if a given number is a power of two. A number is a power of two if it can be expressed as \(2^k\), where \(k \geq 0\). For example:
  - \(4\) is a power of two (\(2^2\)).
  - \(6\) is not a power of two.

- **Optimized Approach**:  
  Use a bitwise operation to check if the number has only one bit set in its binary representation. The condition \(n > 0 \, \& \, (n \& (n - 1)) == 0\) works because:
  - \(n \& (n - 1)\) clears the rightmost set bit.
  - If the result is \(0\), the number is a power of two.

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
  - Maintain a running sum and reset it to \(0\) if it becomes negative.
  - Track the maximum sum encountered during the iteration.
  This approach runs in \(O(n)\) time with \(O(1)\) space.

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
  This approach avoids division and runs in \(O(n)\) time with \(O(n)\) space.

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
  This approach runs in \(O(n)\) time.

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
  This approach runs in \(O(\log n)\) time.

- **[Solution File](Search_in_Rotated_sorted_array.java)**

---

### 8. Find Minimum in Rotated Sorted Array
- **Problem**:  
  Find the minimum element in a rotated sorted array. For example:
  - Input: `[3, 4, 5, 1, 2]`
  - Output: `1`.

- **Optimized Approach**:  
  Use binary search:
  - Compare the middle element with the rightmost element to determine which half contains the minimum.
  This approach runs in \(O(\log n)\) time.

- **[Solution File](Find_Minimum_in_Rotated_Sorted_Array.java)**

---

### 9. Maximum Product Subarray
- **Problem**:  
  Find the contiguous subarray with the largest product. For example:
  - Input: `[2, 3, -2, 4]`
  - Output: `6`.

- **Optimized Approach**:  
  Track both the maximum and minimum product at each step because a negative number can turn the smallest product into the largest. Update the result with the maximum product encountered. This approach runs in \(O(n)\) time.

- **[Solution File](Max_product_subarray.java)**

---

### 10. Check for Duplicates in Array
- **Problem**:  
  Check if an array contains duplicates within a given range. For example:
  - Input: `[1, 2, 3, 1]`, \(k = 3\)
  - Output: `true`.

- **Optimized Approach**:  
  Use a HashMap to store the indices of elements. Check if the difference between indices of duplicate elements is within the given range. This approach runs in \(O(n)\) time.

- **[Solution File](Contain_duplicate_II.java)**

---

### 11. Generate Secure Code
- **Problem**:  
  Calculate the absolute difference between the sum of primes and non-primes in a range. For example:
  - Input: \(m = 1, n = 10\)
  - Output: `17`.

- **Optimized Approach**:  
  Use the Sieve of Eratosthenes to efficiently find all primes in the range. Iterate through the range to calculate the sums of primes and non-primes. This approach runs in \(O(n \log \log n)\) time.

- **[Solution File](Generate_Secure_code-1.java)**

---

This structure provides **detailed explanations** for each problem and its optimized approach. Let me know if you want further refinements! 😊