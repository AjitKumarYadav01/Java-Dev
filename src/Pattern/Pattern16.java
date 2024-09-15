package Pattern;

public class Pattern16 {
    public static void printPattern(int n){
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++) {
                char ch = (char)('A' + i);
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printPattern(5);
    }
}
