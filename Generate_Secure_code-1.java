import java.util.*;

public class Generate_Secure_code_1 {

    // Function to generate a sieve of primes up to MAX
    public static boolean[] sieveOfEratosthenes(int max) {
        boolean[] isPrime = new boolean[max + 1];
        Arrays.fill(isPrime, true); // Assume all numbers are prime initially
        isPrime[0] = isPrime[1] = false; // 0 and 1 are not prime

        for (int i = 2; i * i <= max; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= max; j += i) {
                    isPrime[j] = false; // Mark multiples of i as non-prime
                }
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the range [m, n]
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        // Validate input range
        if (m < 1 || n > 1000000 || m > n) {
            System.out.println("Invalid input range");
            return;
        }

        // Generate the sieve of primes up to n
        boolean[] isPrime = sieveOfEratosthenes(n);

        // Calculate the sum of primes and non-primes in the range [m, n]
        long sumPrimes = 0, sumNonPrimes = 0;
        for (int i = m; i <= n; i++) {
            if (isPrime[i]) {
                sumPrimes += i; // Add to prime sum
            } else {
                sumNonPrimes += i; // Add to non-prime sum
            }
        }

        // Calculate the absolute difference
        long result = Math.abs(sumPrimes - sumNonPrimes);
        System.out.println(result);
    }
}