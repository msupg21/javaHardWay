import java.util.Scanner;

public class EnterPin {
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      int pin = 12345, entry;
      String pass;

      System.out.println("Enter password please: ");
      pass = keyboard.next();

      while (! pass.equals("hunter2")) {
          System.out.println("\nIncorrect password. Try again.");
          System.out.println("Enter password please: ");
          pass = keyboard.next();
      }


      System.out.println("Welcome to the bank of Java.");
      System.out.print("Enter your pin: ");
      entry = keyboard.nextInt();

      while (entry != pin) {
        System.out.println("\nIncorrect pin. Try again.");
        System.out.print("Enter your pin: ");
        entry = keyboard.nextInt();
      }

      System.out.println("\nPin accepted.  Your account balance is $431.21");

    }
}
