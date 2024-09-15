package Arrays;

public class EvenNo {
    public static void main(String[] args) {
        int arr[] = {10, 12, 11, 13, 45, 55, 67, 75, 44};

        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 == 0){
                System.out.println(arr[i]);
            }
        }
    }
}
