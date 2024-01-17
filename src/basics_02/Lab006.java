package src.basics_02;

// Constant declaration with Final keyword

public class Lab006 {
    public static void main(String[] args) {
        final float pi = 3.145f;
        System.out.println(pi);

        final String STR = "Hello World";
        System.out.println(STR);

        final double d1= 99.876;
        System.out.println(d1);
      //  d1= 54.789; will get error as cant reassign new value after declaration with final.

    }


}
