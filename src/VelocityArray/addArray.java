package VelocityArray;

public class addArray {
    public static int addArray(int[] arr){
        int sum = 0;

        for(int i=0; i< arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);
        return 0;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80};
        addArray(arr);
        return;
    }
}
