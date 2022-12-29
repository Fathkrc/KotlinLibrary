package java_classes;

import java.util.Arrays;

public class DummyClass {

    public String isVacationtime(Boolean onVacation){
        return onVacation ?"I'm on vacation":"I'm working";
    }
    public void printNumbers(int[]arr){
        for (int number: arr){
            System.out.println(number);
        }
    }
    public static void method1(char[] arr){
        char a=97;
        for (int i=0;i<arr.length;i++) {
            arr[i]=a;
            a++;
        }
        System.out.println(Arrays.toString(arr));
    }

}
