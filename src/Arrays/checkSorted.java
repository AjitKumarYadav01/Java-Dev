package Arrays;

public class checkSorted {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};

        for(int i=1; i<=arr.length; i++){
            if(arr[i] < arr[i-1]){
                System.out.println("Array is not sorted");
                //return;
            }
            else {
                System.out.println("Array is sorted");
            }
        }
    }
}
