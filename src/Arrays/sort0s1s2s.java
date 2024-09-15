package Arrays;

public class sort0s1s2s {
    public static void sort(int arr[]) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
                ;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, high);
                high--;
            }
        }
    }

    public static void swap(int arr[], int low, int high){
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
    }
    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 1, 0, 1, 2, 1, 0, 0, 2, 1, 0, 1, 2, 1, 0, 0, 2, 1, 0, 1, 2, 1, 0};
        sort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
