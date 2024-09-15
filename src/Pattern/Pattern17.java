package Pattern;

public class Pattern17 {
    public static void printPattern(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (65 + j));
            }
            for (int j = i - 1; j >= 0; j--) {
                System.out.print((char) (65 + j));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(5);
    }
}
