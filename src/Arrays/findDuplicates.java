package Arrays;

public class findDuplicates {

    public static void main(String[] args) {
        int arr[] = {10, 44, 33, 22, 42, 67, 70,22, 44, 10, 88, 67};
        for(int i=0; i< arr.length; i++){
            for (int j=i+1; j< arr.length; j++){
                if (arr[i] == arr[j]){
                   // return arr[i];
                    System.out.println(arr[i]);
                }
            }
        }
    }

}
