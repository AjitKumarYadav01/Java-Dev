package Pattern;

public class Pattern12 {
    public static void printPattern(int n){
        int sp =2*(n-1);
        for(int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j);
            }
            for(int j=1;j<=sp;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            sp-=2;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(5);
    }

}
