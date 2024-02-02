package src.basics_05;

// Print even or odd number
public class Lab032_EvenOdd {
    public static void main(String[] args) {

        for (int i = 0; i <= 50 ; i++) {
            if (i%2 == 0) {
                System.out.println(i+ " is even number");
            }
           else {
                System.out.println(i+ " is odd number");

            }

        }
    }
}
