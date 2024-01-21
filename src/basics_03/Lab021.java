package src.basics_03;

// Ternary operator(?) -> if condition is true return 1st ans or else 2nd option

public class Lab021 {
    public static void main(String[] args) {

        int a = true ? 10:20;
        int b = (12>30)? 10:20;
        String s1 = (10>20) ? "yes" : "no";
        System.out.println(a);
        System.out.println(b);
        System.out.println(s1);


        int c = 30;
        int d = 15;
        int max = c>d ? c:d;
        int min = c<d ? c:d;
        System.out.println(max);
        System.out.println(min);

        int e = 40;
        int f = 20;
        int g = 30;
        int maximum = (e > f) ? ((e > g)? e : g) : ((f > g)? f : g);
        System.out.println(maximum);

    }
}
