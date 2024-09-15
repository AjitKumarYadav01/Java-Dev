package Arrays;
import java.util.Scanner;
public class Create {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        int n = sc.nextInt();
        int[] arr =new int[n];
        System.out.println("Enter the values");

        for(int i=0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The elements are");
        for(int i=0; i< arr.length; i++){
        System.out.print(arr[i]+ " ");
        }
    }
}
