package Outputs;

public class OP1 {
    public static void main(String[] args) {
        int a = 5;
        a += 5;
        switch (a) {
            case 5:
                System.out.println("5");
                break;
            case 10:
                System.out.print("10");
               // break;
//            case 20:
//                System.out.println("20");
//                break;
            default:
                System.out.print("0");
        }
    }
}
