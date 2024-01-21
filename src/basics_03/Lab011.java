package src.basics_03;

// String operator- concatenation (+)

public class Lab011 {
    public static void main(String[] args) {
        int a = 40;
        int b = 30;
        System.out.println(a+b);

        String name = "Piyali";
        System.out.println(a+name);
        System.out.println(name+a);

        System.out.println(a+b+name);
        System.out.println(name+a+b);
        System.out.println(name+(a+b));
    }
}
