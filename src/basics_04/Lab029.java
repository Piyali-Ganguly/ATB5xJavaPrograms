package src.basics_04;
// advanced switch case-> multiple checking

public class Lab029 {
    public static void main(String[] args) {

        int itemcode = 003;

        switch(itemcode){

            case 001,002:
                System.out.println("yes");
                break;

            case 003:
                System.out.println("no");
                break;

            default:
                System.out.println("default");
        }

    }
}
