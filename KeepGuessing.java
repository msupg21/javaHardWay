import java.util.Scanner;

public class KeepGuessing {
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      int secret, guess;

      secret = 1 + (int)(Math.random()*10);

      System.out.println("I have choosen a number between 1 and 10.");
      System.out.println("Try to guess it.");
      System.out.print("Your guess:  ");
      guess = keyboard.nextInt();

      while (secret != guess) {
        System.out.println("That was incorrect. Guess again.\n");
        System.out.print("Your guess:  ");
        guess = keyboard.nextInt(); /* if the scanner did not prompt the user
        to enter another int, the loop would run forever.  Infinite loop...*/
      }
      System.out.println("You guessed " + secret + " which is the correct number!");
    }
}
