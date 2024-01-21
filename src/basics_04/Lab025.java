package src.basics_04;

// Grade calculator

import java.util.Scanner;

public class Lab025 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the score");
        int score = sc.nextInt();

        if (score >= 90 && score <= 100){
            System.out.println(" you score -> A");
        } else if (score >= 80 && score <= 89) {
            System.out.println(" you score -> B");
        } else if (score >= 70 && score <= 79) {
            System.out.println(" you score -> C");
        } else if (score >= 60 && score <= 69) {
            System.out.println(" you score -> D");
        } else{
            System.out.println(" you score -> F");
        }

    }
}
