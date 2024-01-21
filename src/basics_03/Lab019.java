package src.basics_03;

// String in string pool and object area(heap area)

public class Lab019 {
    public static void main(String[] args) {

        String name = "The Testing Academy";
        String name1 = "The Testing Academy";
        String name2 = new String("The Testing Academy");
        String name3 = new String("The testing academy");

        System.out.println(name == name1); //checking references
        System.out.println(name.equals(name1)); // checking values
        System.out.println(name == name2);
        System.out.println(name.equals(name2));
        System.out.println(name.equals(name3));
        System.out.println(name.equalsIgnoreCase(name3));


    }
}
