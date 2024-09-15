package Arrays;
import java.util.Scanner;
public class InsertLocation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n+1];

        System.out.println("Enter the values");
        for (int i=0; i< a.length; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the index of new value to be inserted");
        int m = sc.nextInt();
        System.out.println("Enter the new value");
        int p = sc.nextInt();
        for(int i=0; i<b.length; i++){
            if(i < m){
                b[i]=a[i];
            }else if (i == m){
                b[i] = p;
            }else {
                b[i] = a[i - 1];
            }
        }
        System.out.println("Array after insertion");
        for(int i=0; i<b.length; i++){
            System.out.print(b[i]+ " ");
        }
    }
}
