import java.util.*;

public class whileLoop {
    public static void main (String[] args) {

        Scanner InputFizzBuzz = new Scanner(System.in);

        System.out.print("Masukan range penampung fizzbuzz: ");
        int fizzbuzzStorage = InputFizzBuzz.nextInt();

        while (fizzbuzzStorage < 100) {

            if (fizzbuzzStorage % 3 == 0 && fizzbuzzStorage % 5 ==0) {
                System.out.println("fizzbuzz");
            }
            else if (fizzbuzzStorage % 3 == 0) {
                System.out.println("fizz");
            }
            else if (fizzbuzzStorage % 5 == 0) {
                System.out.println("buzz");
            }
            else {
                System.out.println(fizzbuzzStorage);

            }
            fizzbuzzStorage++;

        }

    }
}
