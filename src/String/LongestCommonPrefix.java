package String;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] str = {"flower", "flow", "flight"};
        //// Initialize the prefix as the first string in the array
        String prefix = str[0];
        for(int i=1; i<str.length; i++){
            while(str[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        System.out.println(prefix);
    }
}
