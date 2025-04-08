#include <stdio.h>

int main(){
    int n;
    printf("Enter the size of the array: ");
    scanf("%d", &n);
    int num[n];
    printf("Enter the elements of the array: ");
    for(int i=0;i<n;i++){
        scanf("%d", &num[i]);
    }
    
    int xor_result  = 0; // Initialize xor_result to 0
    for(int i=0;i<n;i++){
        xor_result ^= num[i];
    }
    printf("The XOR of all elements in the array is: %d\n", xor_result);

    int right_set = xor_result & ((~xor_result)+1);
    printf("The rightmost set bit is: %d\n", right_set);


    // Find two distinct elements in the array
    int result[2];
    for(int i=0; i<n;i++){
        if(num[i]^right_set !=0){
            result[0] = num[i];
        }
       
    }

    
    


    return 0;
}