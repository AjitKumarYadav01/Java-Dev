package VelocityArray;

public class SecondLargest {
    public static void printArray(int[] arr){
        int prev = -1;
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(max < arr[i]){
                 prev = max;
                max =  arr[i];
            }
            else if(arr[i] < max && prev < arr[i]){
                prev = arr[i];
            }
        }
        System.out.println(prev);
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 44, 55, 66, 43, 32, 22, 11};
        printArray(arr);
    }
}
