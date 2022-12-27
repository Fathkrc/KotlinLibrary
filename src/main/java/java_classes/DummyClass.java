package java_classes;

public class DummyClass {

    public String isVacationtime(Boolean onVacation){
        return onVacation ?"I'm on vacation":"I'm working";
    }
    public void printNumbers(int[]arr){
        for (int number: arr){
            System.out.println(number);
        }
    }

}
