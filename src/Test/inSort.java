package Test;

public class inSort {
    public static void inserSort(int arr[]){
        for (int i=0; i< arr.length; i++){
            for (int j=i; j > 0; j--){
                if(arr[j] < arr[j - 1]){
                    swap(arr, j, j - 1);
                }
                else{
                    break;
                }
            }
        }

        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int arr[] = {20, 4, 6, 19, 11, 5, 12, 8, 2};
        inserSort(arr);
    }
}
