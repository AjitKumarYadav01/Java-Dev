package Arrays;
import java.util.Arrays;
public class majorityElement {
    public static int findMaj(int arr[]){
        int count = 1;
        int element = 1;
        Arrays.sort(arr);
        for(int i=1;i< arr.length; i++){
            if(arr[i] == arr[i-1]){
                count++;
            }
            else {
                count = 1;
            }
            if(count > arr.length/2){
                element = arr[i];
            }
        }
        return element;
    }
    public static void main(String[] args) {
        int arr[] = {8, 7, 6, 8, 6, 6, 6, 6};
        System.out.println(findMaj(arr));

    }
}
