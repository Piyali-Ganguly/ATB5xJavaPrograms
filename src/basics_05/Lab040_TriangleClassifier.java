package src.basics_05;
/*
Write a program that classifies a triangle based on its side lengths. Given three input values
representing the lengths of the sides, determine if the triangle is equilateral (all sides are equal),
isosceles (exactly two sides are equal), or scalene (no sides are equal).
Use an if-else statement to classify the triangle.
*/

import java.util.Scanner;

public class Lab040_TriangleClassifier {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three sides of a triangle:");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();

        if (side1 == side2 && side2 == side3) {
            System.out.println("Equilateral");
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            System.out.println("Isosceles");
        } else{
            System.out.println("Scalene");
        }

    }
}

