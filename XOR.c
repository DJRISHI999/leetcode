#include <stdio.h>


int xor_0_to_n(int n) { //this is the optimized approach which uses a pattern as if multiple of then gives answer n
    if (n % 4 == 0) return n;
    if (n % 4 == 1) return 1;
    if (n % 4 == 2) return n + 1;
    return 0;
}

int main() {
    int n;
    printf("Enter a number: ");
    scanf("%d", &n); 
    printf("XOR from 0 to %d is %d\n", n, xor_0_to_n(n));
    return 0;
}