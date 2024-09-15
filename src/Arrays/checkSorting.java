package Arrays;

public class checkSorting {

    public static boolean checkSorted(int[] arr){
        for(int i=1; i<arr.length; i++){
            if(arr[i] > arr[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {5,6, 4, 3, 2, 1};
        //checkSorted(arr); // This will not print anything
        System.out.println(checkSorted(arr));

    }
}
