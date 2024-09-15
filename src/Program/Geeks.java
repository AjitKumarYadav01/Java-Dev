package Program;


class Geeks {
    static void isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            // Your code here
            if(n % i == 1 && n % 1 == n){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {
        isPrime(7);
    }
}
