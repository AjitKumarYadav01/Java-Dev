package Opps;

public class StudentCl {
    public static void fun(Student x){
        System.out.println(x.getRno());
        System.out.println(x.name);
        return;
    }

    public static void change(Student y) {
        y.name = "Arti";
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Ranbir";
       // s1.rno = 34;
        s1.percent = 89.4;
        System.out.println(s1.name);
        System.out.println(s1.getRno());
        System.out.println(s1.percent);

        s1.setRno(88);
        //System.out.println(s1.setRno(99));

//        s1.name = "Ranvijay";
//        System.out.println(s1.name);
//
//        fun(s1);

//        change(s1);
//        System.out.println(s1.name);
    }
}
