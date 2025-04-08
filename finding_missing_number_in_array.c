// find the number missing in the array from a given range

#include <stdio.h>

int missing_number(int num[],int n){
    int total = 0;
    for(int i=0;i<n;i++){
        total += i;
    }
    int sum_of_array = 0;
    for(int j=0;j<n;j++){
        sum_of_array += num[j];
    }

    return total-sum_of_array;
}

int linear_Search(int num[],int target){
    int size = len(num);
    for(int i=0;i<size;i++){
        if(num[i] == target){
            return 1;
        }
    }
    return 0;
}


int main() {
    int n;
    printf("Enter the size of the array: ");
    scanf("%d", &n);
    int num[n];
    printf("Enter the elements of the array: ");
    for(int i=0;i<n;i++){
        scanf("%d", &num[i]);
    }
    int missing = missing_number(num,n);
    printf("The missing number is: %d\n", missing);
    
    int target;
    printf("Enter the number to search: ");
    scanf("%d", &target);
    
    if(linear_Search(num,target)){
        printf("Number found in the array.\n");
    } else {
        printf("Number not found in the array.\n");
    }
    
    return 0;
}
