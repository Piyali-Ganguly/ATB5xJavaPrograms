package src.basics_05;

// Left triangle star pattern

public class Lab042_LeftTriangleStarPattern {
    public static void main(String[] args) {

        int n = 5;

        for (int i = n; i >=1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // print stars
            }
            System.out.println(); // move to the next line
        }
    }
}
