package Test;

public class secMaxArr {
    public static void findSecHighest(int[] Arr){
        int prev = -1;
        int max = Arr[0];
        for (int i=0; i< Arr.length; i++){
            if(Arr[i] > max){
                prev = max;
                max = Arr[i];
            } else if (Arr[i] < max && prev < Arr[i]) {
                prev = Arr[i];
            }
        }
        System.out.println(prev);
    }
    public static void main(String[] args) {
     int[] Arr = {10, 23,22, 43, 22, 41, 11};
     findSecHighest(Arr);
    }
}
