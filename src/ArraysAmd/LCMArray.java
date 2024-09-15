package ArraysAmd;
import java.util.Scanner;

public class LCMArray {

    // Function to find the GCD (Greatest Common Divisor)
    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // Function to find the LCM (Least Common Multiple)
    static int lcm(int a, int b) {

        return (a * b) / gcd(a, b);
    }

    // Function to find the LCM of an array of numbers
    static int findLCM(int[] arr) {
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result = lcm(result, arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int lcmResult = findLCM(array);
        System.out.println("LCM of the array elements is: " + lcmResult);
    }
}

