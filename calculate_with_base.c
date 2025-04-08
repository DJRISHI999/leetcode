#include <stdio.h>
#include <stdlib.h>

int main() {
    int num1, num2, base;
    
    // Read two numbers and the base
    scanf("%d %d", &num1, &num2);
    scanf("%d", &base);

    // Validate the base
    if (base < 2) {
        printf("Invalid base\n");
        return 1; // Exit with an error code
    }

    // Calculate the sum of the two numbers
    int result = num1 + num2;

    // Convert the result to the given base
    int base_result[32]; // Array to store the digits of the result in the given base
    int index = 0;

    if (result == 0) {
        // Handle the case where the result is 0
        printf("0\n");
        return 0;
    }

    while (result > 0) {
        base_result[index] = result % base; // Store the remainder (digit in the given base)
        result = result / base; // Divide the result by the base
        index++; // Move to the next index
    }

    // Print the result in the given base (digits are stored in reverse order)
    for (int i = index - 1; i >= 0; i--) {
        printf("%d", base_result[i]);
    }
    printf("\n");

    return 0;
}