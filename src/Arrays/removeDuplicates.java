package Arrays;

public class removeDuplicates {
    public static void main(String[] args) {
    // remove duplicates element from array
        int[] arr = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
        int[] temp = new int[arr.length];
        int j = 0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] != arr[i+1]){
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[arr.length-1];
        for(int i=0; i<j; i++){
            System.out.print(temp[i] + " ");
        }

    }
}
