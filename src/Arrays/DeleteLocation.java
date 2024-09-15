package Arrays;

import java.util.Scanner;

public class DeleteLocation {
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
        System.out.println("Enter the index of value to be deleted");
        int m = sc.nextInt();
        for(int i=0; i<a.length; i++){
            if(i < m){
                b[i]=a[i];
            }else if (i == m){
                continue;
            }else {
                b[i-1] = a[i];
            }
        }
        System.out.println("Array after Deletion");
        for(int i=0; i<n-1; i++){
            System.out.print(b[i]+ " ");
        }
    }
}
