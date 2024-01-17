package src.basics_02;

// difference between print, println and printf
public class Lab005 {
    public static void main(String[] args) {
        System.out.print("Hello world");
        System.out.println(" Piyali");

/* %d-> any integer(byte,short,int,long)
   %s-> string
   %c-> character
   %f-> float
 */

        int age=10;
        System.out.println("your age is " +age);
        System.out.printf("your age is %d " ,age);
        // for space
        System.out.println();

        String name= "Piyali";
        //concatenate +
        System.out.println("your name is " +name);
        // formatting
        System.out.printf("your name is %s ",name);
        System.out.println();

        float pi= 3.14159f;
        System.out.printf("your value is %f ",pi);


    }
}
