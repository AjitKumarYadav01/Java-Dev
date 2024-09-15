package String;

public class Reverse {
    public static void main(String[] args) {
        String str = "Ajit Kumar Yadav";
        String rev = "";

        for(int i =str.length() - 1; i>=0; i--){
            rev+=str.charAt(i);

        }
        System.out.println(rev);
    }
}
