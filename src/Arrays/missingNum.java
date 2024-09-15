package Arrays;

public class missingNum {
    public static void main(String[] args) {
       // int arr[] = {10, 20, 30, 40, 50, 60,40, 70, 80};
        int arr[] = {1, 2, 4, 5, 6, 7, 4, 8, 9};
        int sum = 0;
        int rep = 0;
        for (int i=0; i<arr.length; i++){
            sum = sum + arr[i];
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    rep = arr[i];
                    System.out.println(rep);
                    break;
                }
            }
        }
        sum = sum - rep;
        int n = arr.length;
        int total = (n*(n+1))/2;
        int missingNum = total - sum;
        System.out.println(missingNum);
    }
}
