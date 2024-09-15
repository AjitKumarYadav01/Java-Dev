package MNJ;

public class sechigh {
//    Don't use any inbuilt function like sort, reverse, max
//    Q1: find the second highest element
//            input = {1,4,7,8,4,8,1,4,9}
//    output: 8 (second highest element)

    public static void main(String[] args) {
        int arr[] = {1,4,7,8,4,8,1,4,9};

        int max = arr[0];
        int sechigh = -1;

        for(int i=0; i< arr.length; i++){

            if(arr[i] > max){
                sechigh = max;
                max = arr[i];
            }
            else if (arr[i] < max && sechigh < arr[i]) {
                sechigh = arr[i];
            }
          //  System.out.println(prev);
        }
        System.out.println(sechigh);
    }
}
