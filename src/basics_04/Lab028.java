package src.basics_04;

// Switch case
import java.util.Scanner;

public class Lab028 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser name:");
        String browser = sc.next();

        switch (browser.toLowerCase()) {
            case "chrome":
                System.out.println("Execute the chrome code");
                break;

            case "edge":
                System.out.println("Execute the edge code");
                break;

            case "firefox":
                System.out.println("Execute the firefox code");
                break;

            case "opera":
                System.out.println("Execute the opera code");
                break;

            default:
                System.out.println("Another browser");
        }
        System.out.println("end of the code");

    }

}
