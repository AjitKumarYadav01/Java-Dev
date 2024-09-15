package Recursion;

public class ArrLCM {
    //Function to find LCM
    public static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(a, a % b);
    }
    //Function to find LCM
    public static int lcm(int a, int b){
        return (a * b) / gcd(a,b);
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
        int[] Arr = {10, 22, 32, 31, 46};
        System.out.println("The LCM of given array is " +findLCM(Arr));
    }
}
