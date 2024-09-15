package Hashing;

public class sequenceOfChar {
    public static void main(String[] args) {
        String str = "abbcdafeegh";
        int[] hash = new int[26];
        for(int i = 0; i < str.length(); i++){
            hash[str.charAt(i) - 'a']++;
        }
        int max = 0;
        for(int i = 0; i < 26; i++){
            if(hash[i] > max){
                max = hash[i];
            }
        }
        System.out.println(max);
    }
}
