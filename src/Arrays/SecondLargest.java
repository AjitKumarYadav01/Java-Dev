package Arrays;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
      //  int a[] = {90, 67, 100, 34, 89, 300, 200, 222, 434, 87, 65, 87,};

//        int max1=0, max2=0;
//
//        if(a[0] > a[1]){
//            max1=a[0];
//            max2=a[1];
//        }else {
//            max1=a[1];
//            max2=a[0];
//        }
//
//        for(int i=2; i<a.length; i++){
//            if(a[i] > max1){
//                max2=max1;
//                max1=a[i];
//            }
//            else if (a[i] > max2){
//                max2 = a[i];
//            }
//        }
//        System.out.println(max2);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements of array");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }



        int prev = -1;
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if (arr[i]>max){
                prev = max;
                max = arr[i];
            }
            else if (arr[i] < max && prev<arr[i]){
                prev = arr[i];
            }
        }
       // return prev;
        System.out.println(prev);
    }
}
