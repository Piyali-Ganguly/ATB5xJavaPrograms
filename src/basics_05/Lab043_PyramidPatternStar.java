package src.basics_05;

// Pyramid pattern star

public class Lab043_PyramidPatternStar {
    public static void main(String[] args) {

        int rows = 5;
        for (int i = 1; i <= rows ; i++) {
            for (int j = 1; j <= rows-i; j++) {
                System.out.print(" ");  // print space
            }
            for (int k = 1; k <=2 * i -1 ; k++) {
                System.out.print("*");  // print stars
            }
            System.out.println(); // move to next line
        }
    }
}
