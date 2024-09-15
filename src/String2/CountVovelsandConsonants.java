package String2;
import java.util.Scanner;
public class CountVovelsandConsonants {
    void count(String str){
        int vovels = 0, consonants = 0;

        str = str.toUpperCase();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                // Code to handle the vowel 'ch'
                vovels++;
            }else {
                consonants++;
            }
        }
        System.out.println("No of Vovels: " +vovels);
        System.out.println("No of Consonants: " +consonants);
    }

    public static void main(String[] args) {
        CountVovelsandConsonants obj = new CountVovelsandConsonants();
     Scanner sc = new Scanner(System.in);
        System.out.println("Input str: ");
        String str = sc.next();
        obj.count(str);
    }
}
