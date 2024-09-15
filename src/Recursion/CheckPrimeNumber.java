package Recursion;
import java.util.Scanner;
public class CheckPrimeNumber {
    // Recursive method to check if a number is prime
    //Write a function to check if a given number is a prime number
    static boolean isPrime(int n, int i) {
        // Base cases
        if (n <= 1) {
            return false;
        }
        if (i == 1) {
            return true;
        }

        // Check if n is divisible by any number from 2 to sqrt(n)
        if (n % i == 0) {
            return false;
        }

        // Recursive call with the next divisor
        return isPrime(n, i - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (isPrime(num, num / 2)) {
            System.out.println(num + " this number is a prime number.");
        } else {
            System.out.println(num + " this number is not a prime number .");
        }
    }
}
