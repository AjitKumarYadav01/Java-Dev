package Test;
import java.util.*;
public class ArrayC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the values");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("The elements of array are");

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("The reversed elements of array are");
        for(int i= arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("The largest element of array is: ");
        int max = arr[0];
        for(int i=0; i< arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);

        System.out.println();
        System.out.println("The second largest element of array is: ");
        int secLar = -1;
        int lar = arr[0];
        for(int i=0; i< arr.length; i++){
            if(arr[i] > lar){
                secLar = lar;
                lar = arr[i];
            } else if (arr[i] < lar && secLar < arr[i]) {
                secLar = arr[i];
            }
        }
        System.out.println(secLar);
    }
}
