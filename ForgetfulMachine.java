import java.util.Scanner;

public class ForgetfulMachine {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("What city is the capital of France?");
    keyboard.next();// When using next(), will package anything into a string

    System.out.println("What is 6 multiplied by 7?");
    keyboard.nextInt();// When using nextInt(), scanner expects a int to package

    System.out.println("Enter a numbner between 0.0 and 1.0");
    keyboard.nextDouble();// When using nextDouble(), scanner expects a floating point to package.

    System.out.println("Is there anything else you would like to say");
    keyboard.next();

  }
}
