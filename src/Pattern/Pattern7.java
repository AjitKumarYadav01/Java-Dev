package Pattern;

public class Pattern7 {
    public static void printPyramid(int n){
        for (int i = 1; i <= n/2 + 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n/2; i++) {
            for (int j = 1; j <= n/2 - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPyramid(5);
    }
}
