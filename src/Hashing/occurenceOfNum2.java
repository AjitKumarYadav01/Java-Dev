package Hashing;
import java.util.HashMap;
import java.util.Scanner;
public class occurenceOfNum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]  = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int hash[] = new int[13];
        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }

        int q = sc.nextInt();

        while (q-- > 0) {
            int x = sc.nextInt();
            System.out.println(hash[x]);
        }
    }
}
