import java.util.Scanner;

public class WeaselOrNot {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String word, password1, password2;
    boolean yep, nope;

    System.out.println("Type the word \"weasel\" , please.");
    word = keyboard.next();

    yep  = ! word.equals("weasel"); // here we are saying with the ! operator yep does not equal :"weasel"
    nope =   word.equals("weasel"); // here we are saying the string of word equals weasel
    // Therefore the boolen variable yep = false, and the nope boolen variable of nope = true

    System.out.println("You typed what was requested: " + yep);
    System.out.println("You ignored polite instruction: " + nope);

    System.out.println("Please enter a password: ");
    password1 = keyboard.next();

    System.out.println("Please re-enter a password: ");
    password2 = keyboard.next();


    if (password1.equals(password2)) { // must use the .equals() methond to compare strings
      System.out.println("Passwords match!");
    }
    else {
      System.out.println("Passwords don't match!");
    }


  }
}
