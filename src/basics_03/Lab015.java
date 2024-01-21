package src.basics_03;

//Logical operators-> &&,||, !
public class Lab015 {
    public static void main(String[] args) {

        boolean a1 = true;
        System.out.println(a1);
        System.out.println(!a1);
        System.out.println(!(10>20));

        int a = 15;
        boolean b = a>10 || a<5;
        System.out.println(b);
        boolean c = !(a>10 || a<5);
        System.out.println(c);

        boolean d = a>10 && a<5;
        System.out.println(d);
        boolean e = !(a>10 && a<5);
        System.out.println(e);

    }
}
