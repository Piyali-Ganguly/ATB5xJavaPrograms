package src.basics_05;
// Printing highest and lowest value

import java.util.Scanner;

public class Lab034_HighestLowest {
    public static void main(String[] args) {

         int [] numbers = new int [5];
         int size = 0;
        Scanner sc = new Scanner(System.in);

         int n;
        do {
            System.out.println("enter a number:  -1 to stop entering" );
            n = sc.nextInt();
            if (n >= 0){
                numbers[size] = n;
            size++;
            }
        } while (n >=0);

        int highest = numbers[0];
        int lowest = numbers[0];

        for (int i = 1; i <size ; i++) {
            if (numbers[i]> highest){
                highest = numbers[i];
        }
            if (numbers[i]< lowest){
                lowest = numbers[i];
                }
            }
                System.out.println("highest number is " +highest);
                System.out.println("lowest number is " +lowest);



    }

}
