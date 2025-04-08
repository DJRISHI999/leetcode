#include <stdio.h>

void main() {
    // Calculate all unset bits of a number
    int num = 5; // Example number
    int i = 0; // Position of the current bit
    int total_bits = sizeof(int) * 8; // Total number of bits in an integer (e.g., 32 bits)

    printf("Unset bits are at positions: ");
    while (i < total_bits) { // Iterate through all bits
        if ((num & 1) == 0) { // Check if the last bit is unset
            printf("%d ", i); // Print the position of the unset bit
        }
        num = num >> 1; // Shift to the next bit
        i++;
    }
    printf("\n");
}