package Recursion;

public class PrintN_to_One {
    public static void printNToOne(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printNToOne(n-1);
    }

    public static void main(String[] args) {
        printNToOne(5);
    }
}
