package Arrays;

public class moveZeroend {
    public static void pushzeroToend(int arr[]){

        int count = 0, j = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                arr[j++] = arr[i];
            }
            else{
                count++;
            }
        }

        for(int k=0; k<count; k++){
            arr[j++] = 0;
        }
    }
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        // System.out.println("Hello, World!");

        int arr[] = {2, 4, 0, 5, 0, 7, 0, 6};
        pushzeroToend(arr);
        printArray(arr);
    }
}
