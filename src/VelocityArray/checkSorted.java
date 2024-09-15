package VelocityArray;

public class checkSorted {

    public static void checkSorted(int[] arr){
        for(int i=1; i< arr.length; i++){
            if(arr[i] < arr[i - 1]){
                System.out.println("Unsorted");
                //return false;
            }
            else{
                System.out.println("Sorted");
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 44, 55, 66, 43, 32, 22, 11};
        checkSorted(arr);
    }
}
