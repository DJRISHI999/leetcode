// #include <stdio.h>

// int main() {
//     int n;
//     printf("Enter the number: \n");
//     scanf("%d", &n);

//     if (n <= 0) {
//         printf("This is not a power of two.\n");
//         return 0;
//     }

//     while (n > 1) {
//         if (n % 2 != 0) {
//             printf("This is not a power of two.\n");
//             return 0;
//         }
//         n = n / 2;
//     }

//     printf("It is a power of two.\n");
//     return 0;
// }


// Optimized approach

#include <stdio.h>

int main(){
    int n;
    n = 64;
    if(!((n>0)&&(n && (n-1)))){
        printf("pow of 2");
    }
    else{
        printf("not the pow of 2");
    }

    return 0;
}