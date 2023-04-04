package java_classes;

public class Dummy2 {
    public static void main(String[] args) {
        var array= new int[] {1,2,3};

        count(5,4,5,3,2,1);
        count(array);
// that's weird
    }
    public static void count(int... x){
        for(int i=0; i<x.length ;i++){
            System.out.println(x[i]);
        }
    }
}
