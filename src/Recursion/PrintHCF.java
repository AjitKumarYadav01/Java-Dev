package Recursion;

public class PrintHCF {
    public static int findhcf(int a, int b){
        if( b == 0){
            return a;
        }else {
            return findhcf(b, a % b);
        }
    }
    public static void main(String[] args) {
        int num1 = 16, num2 = 34;

        int hcf = findhcf(num1, num2);

        System.out.println("HCF of " +num1+ " and " +num2+ "is : " +hcf);

    }


}
