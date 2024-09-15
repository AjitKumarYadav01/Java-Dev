package ArraysAmd;

import java.util.Arrays;

public class revmovedup {
    public static void revDup(int[] arr){
        Arrays.sort(arr);
        int i=0;
        for (int j=0; j< arr.length; j++){
            if (arr[j] != arr[i]){
                arr[++i] = arr[j];
            }
        }
        for (int k=0; k< i; k++){
            System.out.print(arr[k]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {10, 2, 22, 11, 8, 4, 3, 22, 11};
        revDup(arr);
    }
}
