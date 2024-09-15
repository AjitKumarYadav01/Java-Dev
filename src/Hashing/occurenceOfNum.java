package Hashing;

public class occurenceOfNum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,3,2,1,2,3,4,5,6,7,8,9,0,1,2,3,4};
        int num = 5;
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == num){
                count++;
            }
        }
        System.out.println(count);
    }
}
