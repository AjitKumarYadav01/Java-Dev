package Arrays;

public class Max {
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 45, 2, 4, 60, 34, 90, 56};

        int max = a[0];
        for(int i=1; i<a.length; i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        System.out.println(max);

        for (int j=a.length-1; j>=0; j--){
            System.out.print(a[j] +" ");
        }
        System.out.println();

        for(int j=a.length-1; j>=2; j--){
            System.out.print(a[j]+ " ");
        }
    }
}
