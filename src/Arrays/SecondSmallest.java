package Arrays;
import java.util.Scanner;
public class SecondSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements of array");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        //code to get second smallest element
        int secsmallest = -1;
        int smallest = arr[0];
        for(int i=1;i<arr.length;i++){
            if (arr[i]<smallest){
                secsmallest = smallest;
                smallest = arr[i];
            }
            else if (arr[i] > smallest && secsmallest > arr[i]){
                secsmallest = arr[i];
            }
        }
        // return prev;
        System.out.println(secsmallest);
    }
}
