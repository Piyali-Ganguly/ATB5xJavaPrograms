package src.basics_04;

// Taking input from user and use of if-else

import java.util.Scanner;

public class Lab023 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();

        if (a % 2 == 0) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }

    }

}

























