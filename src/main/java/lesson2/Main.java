package lesson2;


public class Main {
    public static void main(String[] args) {
        Employees employee1=new Employees("Mary",1);
        Employees employee2=new Employees("John",2);
        Employees employee3=new Employees("John",2);
        System.out.println(employee1==employee2);
        System.out.println(employee2==employee3);//referencal equality: false
        System.out.println(employee1.equals(employee2));
        System.out.println(employee2.equals(employee3));//structral equality: true

    }
}
