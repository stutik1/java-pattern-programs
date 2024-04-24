package leetcode.easy;

public class primeNumbers {
        public static void main(String[] args) {
            int n = 50; // Define the range up to which you want to find prime numbers

            System.out.println("Prime numbers up to " + n + ":");
            for (int i = 2; i <= n; i++) {
                if (isPrime(i)) {
                    System.out.print(i + " ");
                }
            }
        }

        // Function to check if a number is prime
        public static boolean isPrime(int num) {
            if (num <= 1) {
                return false;
            }
            // Check divisibility from 2 to num-1
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false; // Not prime
                }
            }
            return true; // Prime
        }
    }

