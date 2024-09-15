package String;

public class lengthStr {
   // Given a string s consisting of words and spaces, return the length of the last word in the string
    public static void main(String[] args) {
        String s = "Software Development Engineer at Amazon";
        int len = 0;
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i) == ' '){
                break;
            }
            len++;
        }
        System.out.println(len);
    }
}
