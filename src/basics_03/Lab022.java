package src.basics_03;

// Increment and decrement operators

public class Lab022 {
    public static void main(String[] args) {

        int a = 10;
        System.out.println(++a); // Pre increment
        System.out.println(a++); // Post increment
        System.out.println(a);
        System.out.println(--a); // Pre decrement
        System.out.println(a--); // Post decrement
        System.out.println(a);

        int b = 10;
        System.out.println(++b + b++ + b++); // 11 + 11 + 12
        System.out.println(b);               // last value of b is 13
        // part a -> exp= 11 , b= 11
        // part b -> exp= 11 , b= 12
        // part c -> exp= 12 , b= 13

        int c = 20;
        System.out.println(--c + c--); // 19 + 19
        System.out.println(c); // last value of c is 18

    }
}