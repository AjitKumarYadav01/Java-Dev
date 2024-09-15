package Arrays;

public class Smallest {
    public static void main(String[] args) {
        int[] arr = {90, 30, 40, 50, 20, 600};
        int min = arr[0];
        for(int i=1; i< arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
