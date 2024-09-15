package VelocityArray;

public class Largest {
    public static void printArray(int[] arr){
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 44, 55, 66, 43, 32, 22, 11};
        printArray(arr);
    }
}
