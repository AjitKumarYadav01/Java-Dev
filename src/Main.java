public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello world!");
        int arr[] = {10, 34, 78, 32, 65, 89, 97};

        int largest = arr[0];
        int seclargest = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest){
                seclargest = largest;
                largest = arr[i];
            }
             if(arr[i] > largest && arr[i] < seclargest){
                seclargest = arr[i];
            }
        }
        System.out.println(seclargest);
    }
}