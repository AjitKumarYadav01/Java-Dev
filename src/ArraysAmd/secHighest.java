package ArraysAmd;

public class secHighest {
    public static void secMax(int[] arr){
        int prev = -1;
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                prev = max;
                max = arr[i];
            } else if (arr[i] < max && prev < max) {
                prev = arr[i];
            }
        }
        System.out.println(prev);
    }
    public static void main(String[] args) {
        int[] ar = {1, 23, 32, 22, 33, 82, 44, 38};
        secMax(ar);
    }
}
