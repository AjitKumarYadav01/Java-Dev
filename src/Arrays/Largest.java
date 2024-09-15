package Arrays;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr =new int[n];
        System.out.println("Enter the values");

        for(int i=0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        System.out.println("The largest element is ");
        for(int i=1; i< arr.length; i++){
           if(arr[i] > max){
               max = arr[i];
           }
        }
        System.out.println(max);
    }
}
