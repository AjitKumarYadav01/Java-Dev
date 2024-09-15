package Arrays;

public class OnceAppear {
    public static void main(String[] args) {
        int arr[] = {10, 29, 34, 43, 22, 76, 89, 67, 88, 34, 88, 10, 29, 100, 43, 22, 76, 67};
        int res = 0;

        for (int i=0; i<arr.length; i++){
            res = res ^ arr[i];
        }
        System.out.println(res);
    }
}
