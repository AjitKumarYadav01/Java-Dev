package Pattern;

public class Pattern4 {
    public static void printPattern(int n){
        int sp = n-1;
        int st = 1;
        for(int i=1;i<=n;i++){
           // System.out.print(sp+ " " + st);
            for(int j=1;j<=sp;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=st;j++){
                System.out.print("*");
            }
            sp--;
            st++;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printPattern(5);
    }
}
