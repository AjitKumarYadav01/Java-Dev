package ArraysAmd;

public class LowestNumUsingRec {
    public static void main(String[] args) {
        int[] A = {10, 20, 22, -34, 4, 5, 221};
        int n = A.length;

        System.out.println(findMinRec(A, n));
    }

    //Function to find Lowest Num

    public static int findMinRec(int[] A, int n){
        if (n == 1){
            return A[0];
        }
        return Math.min(A[n - 1], findMinRec(A, (n-1)));
    }
}
