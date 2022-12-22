package lesson1;

import javax.xml.stream.Location;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    public static void main(String[] args) {
        kotlin01 obj=new kotlin01("obj 1",1);
        Object obj2=obj;
        System.out.println(((kotlin01) obj2).name);

        String str1="Pattern yazdırma denemesi ";
        System.out.println();
        Pattern p= Pattern.compile("(\\w+)");
        Matcher m=p.matcher(str1);
        System.out.println(m.matches());
        String ss=m.replaceFirst(str1).concat(" 12");
        System.out.println(ss);


    }
}
