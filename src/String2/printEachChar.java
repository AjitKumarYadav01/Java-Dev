package String2;
import java.util.Scanner;
public class printEachChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();

        for (int i=0; i<=name.length(); i++){
           // for (int j = i + 1; j<=name.length();  j++){
                System.out.println(name.substring(i));
           // }
        }
    }
}
