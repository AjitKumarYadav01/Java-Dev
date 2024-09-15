package Arrays;

public class sumArr {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};

        //   for(int i=arr.length-1; i>=0; i--){
        //       System.out.println(arr[i]);
        //   }

        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);

    }
}
