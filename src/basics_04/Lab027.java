package src.basics_04;

// Switch case - multiple conditions

import java.util.Scanner;

public class Lab027 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number from 1 to 7 to find the day");
        int daynumber = sc.nextInt();

        switch (daynumber) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("Sunday");
        }
        System.out.println("end of the code");

    }
}
