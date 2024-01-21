package src.basics_03;

// Type casting- implicit and explicit

public class Lab016 {
    public static void main(String[] args) {

        byte b = 10;
        int a = b;  // implicit casting-JVM
        System.out.println(a);

        int c = 300;
        byte d = (byte) c;  // explicit casting- JVM
        System.out.println(d);
    }
}
