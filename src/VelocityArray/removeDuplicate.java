package VelocityArray;

public class removeDuplicate {
    public static void removeDuplicate(int[] arr){
        int j = 0;
        for(int i=0; i< arr.length; i++) {
            if(arr[i] != arr[j]){
                arr[++j] = arr[i];
            }
        }
        System.out.println(arr[++j]);
    }
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 3, 5, 9, 2, 1, 6};
        removeDuplicate(arr);
    }
}
