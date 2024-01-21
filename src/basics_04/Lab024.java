package src.basics_04;
// Taking input from user and comparing two numbers

import java.util.Scanner;

public class Lab024 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a and b ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("max is ->" + a);
        } else {
            System.out.println("max is ->" + b);
        }
    }

}
