package Arrays;

public class FindOdd {
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 45, 2, 4, 60, 34, 90, 56};


        for(int i=1; i<a.length; i++){
            if(a[i]%2 != 0 ){
                System.out.print(a[i]+" ");
            }
        }
        // System.out.println();
    }
}
