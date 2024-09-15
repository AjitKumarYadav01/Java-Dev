package String;

public class Anagram3 {
    public static boolean isAnagram(String s1, String s2){
        String s1Copy = s1.replaceAll("\\s", "");
        String s2Copy = s2.replaceAll("\\s", "");

        if(s1Copy.length() != s2Copy.length()){
            return false;
        }
        else{
            char[] s1Array = s1Copy.toLowerCase().toCharArray();
            char[] s2Array = s2Copy.toLowerCase().toCharArray();

            java.util.Arrays.sort(s1Array);
            java.util.Arrays.sort(s2Array);

            return java.util.Arrays.equals(s1Array, s2Array);
        }
    }
    public static void main(String[] args) {
        System.out.println(isAnagram("Listen", "Silent"));
        System.out.println(isAnagram("Triangle", "Integral"));
        System.out.println(isAnagram("Ajit", "Kumar"));
    }
}
