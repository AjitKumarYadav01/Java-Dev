package Numbers;

public class Palindrome {
    public static void main(String[] args) {
        int n = 239;
        int temp = n;
        int rem = 0;
        while (n != 0){
            int dig = n % 10;
            rem = rem * 10 + dig;
            n = n / 10;
           // System.out.println(dig);
        }
        if(temp == rem) {
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
