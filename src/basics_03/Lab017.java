package src.basics_03;

// new operator
// new operator is used to create the new object for the class
// it returns the address of newly created object

public class Lab017 {
    public static void main(String[] args) {

        String s1 = "piyali"; // store the data in string pool
        String s2 = new String("piyali"); // store the data in object area or heap area

        System.out.println(s1);
        System.out.println(s2);
    }
}
