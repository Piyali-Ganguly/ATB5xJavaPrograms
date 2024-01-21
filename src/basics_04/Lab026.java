package src.basics_04;

// Triangle classifier

import java.util.Scanner;

public class Lab026 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three sides");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();

        if ((side1==side2) && (side1==side3) && (side2==side3)) {
            System.out.println("Equilateral");
        }else if ((side1==side2) || (side1==side3) || (side2==side3)){
                System.out.println("Isosceles");
        }else
            System.out.println("Scalene");


    }
}
