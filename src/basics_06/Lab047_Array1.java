package src.basics_06;

// Declaring and printing array

public class Lab047_Array1 {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};
        System.out.println("Length ->" + arr1.length);
        System.out.println("Ref address->" + arr1);


        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        //    System.out.println(arr1[i] *2); to double the array
        }
        int[] arr2 = arr1;
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);

    }
}
