import java.util.Scanner;

public class SecretWord {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String secret = "please", guess, today ;

    System.out.println("What's the secret word?");
    guess = keyboard.nextLine();

    if (guess.equals(secret) || guess.equals("por favor")) {
      System.out.println("That is correct!");
      }
    else {
      System.out.println("No, the secret word isn't \"" + guess + "\".");
    }
      System.out.println("How are you feeling today?");
      today = keyboard.nextLine();

    if (today.equals("good") || today.equals("great")) {
      System.out.println("That awesome!");
    }
    else {
      System.out.println("Anything short of good or great is not awesome!");
    }

  }
}
