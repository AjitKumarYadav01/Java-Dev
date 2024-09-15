package Test;

import java.util.Arrays;

public class sortArray {
    public static void sortArray(int[] arr){

        Arrays.sort(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {3, 4, 6, 7, 11, 5, 12, 8, 14};

        sortArray(arr);
    }
}
