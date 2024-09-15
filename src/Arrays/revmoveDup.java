package Arrays;

import java.util.Arrays;

public class revmoveDup {
    public static void main(String[] args) {
    //remove Duplicates from array
        int arr[] = {10, 44, 33, 22, 42, 67, 70, 22, 44, 10, 88, 67};
        int n = arr.length;
       // int brr[] = new int[n+1];
        Arrays.sort(arr);
        int i =0;
        for(int j=0; j<n; j++){
            if(arr[j] != arr[i]){
                arr[++i] = arr[j];
            }
        }
        for(int k=0; k<=i; k++){
            System.out.print(arr[k]+" ");
        }
    }
}
