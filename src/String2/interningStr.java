package String2;
import java.util.Scanner;
public class interningStr {
    public static void main(String[] args) {
        String s = "Hello";
//        String k = "Hello";
//        k = "Mello";
//        //System.out.println(k);

        s = s.substring(0,2) + 'y' + s.substring(3);
        System.out.println(s);

    }
}
