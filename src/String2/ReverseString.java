package String2;

public class ReverseString {
    public static void reverseStr(String str){
        String rev = "";
        for (int i=str.length()-1; i>=0; i--){
            rev += str.charAt(i);
        }
        System.out.println(rev);
    }

    public static void removeWhiteSpace(String str){
        String withWhiteSpacestr = str.replaceAll("\\s", "");
        str = str.trim();
        System.out.println(str);
        System.out.println(withWhiteSpacestr);
    }

    public static void chackPalindrome(String str){
        String rev = "";
        for (int i=str.length()-1; i>=0; i--){
            rev += str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }

    public static void main(String[] args) {
       // reverseStr("Ajit Kumar Yadav");
       // removeWhiteSpace("Java DataBase Connectivity");
        chackPalindrome("AttA");
    }
}
