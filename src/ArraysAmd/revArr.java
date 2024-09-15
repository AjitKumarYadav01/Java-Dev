package ArraysAmd;

public class revArr {
    public static void revArray(int[] arr){
        for(int i= arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 33, 22};
        revArray(arr);
    }
}
