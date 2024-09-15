package Test;

public class miss {
    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = arr.length;;
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += arr[i];
        }

        int total =((n+2)*(n+1))/2;

        int missNo = total - sum;
        System.out.println(missNo);
    }
}
