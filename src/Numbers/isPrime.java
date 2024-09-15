package Numbers;

public class isPrime {
    public static void main(String[] args) {
        int n = 30;
        int i =2;
        for(; i<n; i++){
            if(n % 2 == 0){
                break;
            }
        }

        if(i == n){
            System.out.println(" Number is prime");
        }
        else{
            System.out.println(" Number is not prime");
        }
    }
}
