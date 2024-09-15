package Recursion;

public class ArrMax {
    public static int findLargest(int[] Arr, int n){
        if(n == 1){
            return Arr[0];
        }
       // return Math.max(Arr[n - 1], findSecLargest(Arr, n - 1));
        return Math.max(Arr[n-1], findLargest(Arr, n-1));
    }
    public static void main(String[] args) {
        int[] Arr = {10, 22, 32, 31, 46};
        int n = Arr.length;
        System.out.println(findLargest(Arr, n));
    }
}
