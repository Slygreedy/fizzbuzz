import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Describe the product: ");
        String productDescription = input.next();

        FizzBuzz fb = new FizzBuzz();

try {
    int x = Integer.parseInt(productDescription);
    System.out.println(fb.playGame(x));
    }
    catch (NumberFormatException ex)
    {
    System.out.println("must be an int");
    }

    }
}
