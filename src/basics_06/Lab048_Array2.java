package src.basics_06;

// Declaring different types of arrays

public class Lab048_Array2 {
    public static void main(String[] args) {

        int[] i_array = {1,2,3,4,5};
        long[] l_array = {34l, 65l, 89l, 60l};
        float[] f_array = {12.4f, 23.6f, 45.7f};
        double[] d_array = {59.89, 65.76, 45.34};
        boolean[] b_array = {true, false, false, true};
        char[] c_array = {'A', 'c','O'};
        String[] s_array = {"Piyali","Debu","Pihu"};

        System.out.println(i_array.length);
        System.out.println(s_array.length);

        for (int i = 0; i <f_array.length ; i++) {
            System.out.println(f_array[i]);
        }
        for (int i = 0; i <s_array.length ; i++) {
            System.out.println(s_array[i]);
        }
    }
}
