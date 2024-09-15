package Maths;
import java.util.Scanner;
public class printPrimeNum {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the limit: ");
            int limit = sc.nextInt();

            System.out.println("Prime numbers up to " + limit + " are:");
            for (int i = 2; i <= limit; i++) {
                if (isPrime(i)) {
                    System.out.print(i + " ");
                }
            }
        }

        public static boolean isPrime(int num) {
            if (num <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }


}
