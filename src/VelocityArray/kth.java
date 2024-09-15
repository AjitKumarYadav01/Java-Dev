package VelocityArray;

import java.util.Arrays;

public class kth {
    public static int KthLargest(int[] arr, int k){
        Arrays.sort(arr);

        return arr[arr.length - k];
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 44, 55, 66, 43, 32, 22, 11};
        int k = 5;
        int KthLargest = KthLargest(arr, k);

        System.out.println(KthLargest);
    }
}
