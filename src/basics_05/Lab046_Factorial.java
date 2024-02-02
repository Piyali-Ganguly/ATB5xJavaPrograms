package src.basics_05;
// Find out the factorial of a number

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class Lab046_Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        long fact = 1;

 // by using for loop
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("The factorial of " + num + " is: " + fact);
    }

}
// by using while loop
    //  int i = 1;
       // while (i<=num) {
         //   fact = fact * i;
          //  i++;
      //  }
      //  System.out.println("The factorial of " +num + " is: " +fact);



