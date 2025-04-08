// Printing patterns using C programs

// Input Format

// first line contain integer value n which represents row

// Constraints

// 0

// Output Format

// print pattern

// Sample Input 0

// 3
// Sample Output 0

// 33333
// 32223
// 32123
// 32223
// 33333


# include <stdio.h>
int main(){
    int n;
    scanf("%d",&n); // Read the number of rows for the pattern

    // Print the top half of the pattern (including the middle row)
    for(int i=1;i<=n;i++){
        // Print decreasing numbers from n to i
        for(int j=n;j>=i;j--){
            printf("%d",j);
        }
        // Print increasing numbers from i+1 to n
        for(int j=i+1;j<=n;j++){
            printf("%d",j);
        }
        printf("\n"); // Move to the next line after each row
    }

    // Print the bottom half of the pattern
    for(int i=n-1;i>=1;i--){
        // Print decreasing numbers from n to i
        for(int j=n;j>=i;j--){
            printf("%d",j);
        }
        // Print increasing numbers from i+1 to n
        for(int j=i+1;j<=n;j++){
            printf("%d",j);
        }
        printf("\n"); // Move to the next line after each row
    }

    return 0; // Indicate successful completion of the program
}