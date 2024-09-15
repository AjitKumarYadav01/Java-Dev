package Numbers;

public class AmstrongNum {
    public static void main(String[] args) {
        int num = 153;
        int temp = num;
       // int rem = 0;
        int sum = 0;
        while(num != 0){
           int rem = num % 10;
            sum = sum + (rem * rem * rem);
            num = num / 10;
        }
        if(temp == sum){
            System.out.println("Amstrong");
        }else{
            System.out.println("Not Amstrong");
        }
    }
}
