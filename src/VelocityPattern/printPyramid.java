package VelocityPattern;
import java.util.Scanner;
public class printPyramid {

    public static void printPyramid(int n){

        for (int i=0; i<n; i++){
            for (int j=n-i; j>0; j--){
                System.out.println(" ");
            }

            for (int k=0; k<i; k++){
                System.out.println("* ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int n = sc.nextInt();

        printPyramid(n);
    }
}
