package ArraysAmd;

public class Largest {
    public static void main(String[] args) {
        int[] Arr = {10, 20, 30, 90, 40, 50};

        int max = Arr[0];
        for (int i=0; i< Arr.length; i++){
            if (Arr[i] > max){
                max = Arr[i];
            }
        }
        System.out.println(max);

        //to reverse the array
        System.out.println("Reversed array");
        for (int i= Arr.length-1; i>=0; i--){
            System.out.print(Arr[i]+ " ");
        }
    }
}
