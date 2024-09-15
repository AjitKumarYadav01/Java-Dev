package Test;

public class Arr1 {

    public static void main(String[] args) {
        int arr[] = {10, 44, 33, 22, 42, 67, 70, 88, 67};
        int max = arr[0];

        int secLar = -1;

        for(int i=0; i< arr.length; i++){

            if( arr[i] > max){
                secLar = max;
                 max = arr[i];
            }
            else if( arr[i] < max && secLar < arr[i]){
                secLar = arr[i];
            }

        }
        System.out.println(secLar);

    }
}
