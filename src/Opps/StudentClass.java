package Opps;

public class StudentClass {
    //creating a new data type

    public static class Car{
        String name;
        String type;
        int prince;
    }
    public static class Phone{
        String name;
        String brand;
        String ram;
        int price;
    }
    public static void fun(Student x){
        System.out.println(x.getRno());
        return;
    }
    public static void main(String[] args) {
        Student x = new Student(); //declaration
        x.name = "Rajiv";
        //x.rno = 100;
        x.percent = 80.8;
        System.out.println(x.name);
        //System.out.println(x.rno);
        System.out.println(x.percent);
        System.out.println(x.percent+9);

        Student obj = new Student(); //declaration
        obj.name = "Dipti Damri";
       // obj.rno = 67;
        obj.percent = 67.8;
        System.out.println(obj.percent);

        Car c = new Car();
        c.name="Mercedes";
        c.type="Suv";
        c.prince=2000000;
        System.out.println(c.name);

        Phone p = new Phone();
        p.name ="i 14";
        p.brand = "Iphone";
        p.ram = "4";
        p.price = 1140000;

        System.out.println(p.price);


       // Student s1
        fun(x);
    }
}
