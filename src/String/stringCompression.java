package String;

public class stringCompression {
    public static void main(String[] args) {
        String s = "aaabbbccc";
        int count = 1;
        String result = "";
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i) == s.charAt(i+1)){
                count++;
            }
            else{
                result = result + s.charAt(i) + count;
                count = 1;
            }
        }
        result = result + s.charAt(s.length()-1) + count;
        System.out.println(result);
    }
}
