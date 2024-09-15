package Program;

public class PrimeNumbers {
    public static void main(String[] args) {
       // int limit = 50;
       // int num = 2;
        //System.out.println("Prime numbers between 1 and " + limit + " are:");

        // loop through all numbers from 1 to 50
        for (int num = 50; num >= 2; num--) {
            boolean isPrime = true;

            // check if the number is prime
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            // print the prime number
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}

