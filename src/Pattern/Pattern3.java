package Pattern;
import java.util.Scanner;
public class Pattern3 {
    public static void printPattern(int n){
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printPattern(5);
    }
}
