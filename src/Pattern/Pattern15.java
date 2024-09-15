package Pattern;

public class Pattern15 {
    public static void printPattern(int n){
        for(int i=n; i>=0;i--) {
            for (int j = 0; j<=i; j++) {
                char ch = (char)('A' + j);
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(5);
    }
}
