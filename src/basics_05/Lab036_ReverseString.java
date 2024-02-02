package src.basics_05;

// Reverse a string

public class Lab036_ReverseString {

    public static void main(String[] args) {

        String str = "Piyali", nstr = "";
        char ch;

        System.out.println("Original word: Piyali");

        for (int i = 0; i < str.length(); i++) {

            ch = str.charAt(i); // extracts each character
            nstr = ch + nstr; //adds each character in front of the existing string
        }
        System.out.println("Reversed word: " +nstr);

    }

    }

