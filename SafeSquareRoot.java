import java.util.Scanner;

public class SafeSquareRoot {
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      double x, y;
      String go;

      System.out.print("Are you ready to start? Yes or No:  ");
      go = keyboard.next().toLowerCase();

      while (! go.equals("yes")) {
        System.out.println("Must reply with a Yes to start.");
        System.out.print("Are you ready to start? Yes or No:  ");
        go = keyboard.next().toLowerCase();
      }

      System.out.print("Give me a number, and I'll find it's square root.");
      System.out.print("\n(No negative numbers, please.)");
      x = keyboard.nextDouble();

      while (x < 0) {
        System.out.println("I won't take the square root of a negative");
        System.out.print("\nNew number: ");
        x = keyboard.nextDouble();
      }

      y = Math.sqrt(x);

      System.out.println("The square root of " + x + " is " + y);
    }
}
