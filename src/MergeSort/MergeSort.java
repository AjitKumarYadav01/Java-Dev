package MergeSort;

public class MergeSort {
    public static void merge(int[] arr, int start, int mid, int end){
        int n1 = mid - start + 1; // size of left subarray
        int n2 = end - mid; // size of right subarray
        int[] left = new int[n1];
        int[] right = new int[n2];
        for(int i = 0; i < n1; i++){
            left[i] = arr[start + i];
        }
        for(int i = 0; i < n2; i++){
            right[i] = arr[mid + 1 + i];
        }
        int i = 0, j = 0, k = start;
        while(i < n1 && j < n2){
            if(left[i] <= right[j]){
                arr[k++] = left[i++];
            }
            else{
                arr[k++] = right[j++];
            }
        }
        while(i < n1){
            arr[k++] = left[i++];
        }
        while(j < n2){
            arr[k++] = right[j++];
        }
    }
    public static void mergeSort(int[] arr, int start, int end){
        if(start < end){
            int m = (start + end) / 2;
            mergeSort(arr, start, m); // sort left subarray
            mergeSort(arr, m + 1, end); // sort right subarray
            merge(arr, start, m, end); // merge both subarrays
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        mergeSort(arr, 0, arr.length - 1);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
