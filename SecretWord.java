import java.util.Scanner;

public class SecretWord {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String secret = "please", guess;

    System.out.println("What's the secret word?");
    guess = keyboard.nextLine();

    if (guess.equals(secret) || guess.equals("por favor")) {
      System.out.println("That is correct!");
      }
    else {
      System.out.println("No, the secret word isn't \"" + guess + "\".");
    }
  }
}
