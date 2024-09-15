package String;

public class decode {
    //You are given an encoded string s. To decode the string to a tape, the encoded string is read one character at a time and the following steps are taken:
//
//    If the character read is a letter, that letter is written onto the tape.
//    If the character read is a digit d, the entire current tape is repeatedly written d - 1 more times in total.
//    Given an integer k, return the kth letter (1-indexed) in the decoded string.

    public static void main(String[] args) {
        String s = "leet2code3";
        int k = 10;
        String res = "";
        for(int i=0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                int num = Character.getNumericValue(s.charAt(i));
                for(int j=0; j<num-1; j++){
                    res = res + res;
                }
            }
            else{
                res = res + s.charAt(i);
            }
        }
        System.out.println(res.charAt(k-1));
    }
}
