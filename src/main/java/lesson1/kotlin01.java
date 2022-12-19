package lesson1;

import javax.xml.stream.Location;
import java.util.Scanner;

public class kotlin01 {//It's a normal Java class with 2 variables contr. and getters
    //We will create a Kotlin class and copy this class compeletely inside to kotlin class(Kotlin02 class )
    private String name;
    private int age;

    public kotlin01(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
