package src.basics_04;

// switch case with yield keyword to return a value

public class Lab030 {
    public static void main(String[] args) {

        char code = 'B';
        int val = switch (code){
            case 'A':
            yield 65;

            case 'B':
                yield 66;

            default:
                throw new IllegalStateException ("other data");
        };

        System.out.println(val);
    }
}
