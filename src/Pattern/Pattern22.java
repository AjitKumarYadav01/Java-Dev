package Pattern;

public class Pattern22 {
    public static void printPattern(int n){
        for(int i=0; i<n; i++){
          for(int j=1; j<=i; j++){
              System.out.print("*");
          }
            System.out.println();
        }
        for(int i=0; i<n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0; i<n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(5);
    }
}
