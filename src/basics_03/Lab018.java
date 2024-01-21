package src.basics_03;

// some methods working on strings

public class Lab018 {
    public static void main(String[] args) {

        String name = "The Testing Academy";
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        String str1 = "Hello";
        String str2 = "guys";
        String str3 = str1.concat(str2);
        System.out.println(str3);
    }
}
