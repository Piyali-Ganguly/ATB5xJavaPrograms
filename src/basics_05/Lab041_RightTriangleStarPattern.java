package src.basics_05;

// Right angle triangle star pattern

public class Lab041_RightTriangleStarPattern {
    public static void main(String[] args) {

        int n = 5;
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
                System.out.println();
        }

    }
}
