package VelocityArray;

public class printDuplicate {
    public static void printDuplicate(int[] arr){
        for(int i=0; i< arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 3, 5, 9, 2, 1, 6};
        printDuplicate(arr);
    }
}
