package String;

public class checkAnagram2 {
    public static boolean checkAnagram(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        int[] arr = new int[256];
        for(int i=0; i<s1.length(); i++){
            arr[s1.charAt(i)]++;
            arr[s2.charAt(i)]--;
        }
        for(int i=0; i<256; i++){
            if(arr[i] != 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String a = "aab";
        String b = "aba";
        System.out.println(checkAnagram(a, b));
    }
}
