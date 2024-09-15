package Numbers;
import java.util.Scanner;
public class FindHCF {
    public static int findHCF(int a, int b){
        while (b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number");
        int num2 = sc.nextInt();

        int hcf = findHCF(num1, num2);

        System.out.println("HCF is " +hcf);
    }
}
