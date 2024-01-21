package src.basics_03;

//Relational operators
public class Lab014 {
    public static void main(String[] args) {

        System.out.println(10==10);
        System.out.println(10>=10);
        System.out.println(10<=10);
        System.out.println(10>10);
        System.out.println(10<10);

        //System.out.println('A'=65); // incorrect, assignment not possible without declaration
        System.out.println('A'== 65);
        System.out.println('A'== 65.0);
        System.out.println('A'== 65.0f);

        int b = 65;
        System.out.println('A'== b);


    }
}
