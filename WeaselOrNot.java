import java.util.Scanner;

public class WeaselOrNot {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String word;
    boolean yep, nope;

    System.out.println("Type the word \"weasel\" , please.");
    word = keyboard.next();

    yep  = ! word.equals("weasel"); // here we are saying with the ! operator yep does not equal :"weasel"
    nope =   word.equals("weasel"); // here we are saying the string of word equals weasel
    // Therefore the boolen variable yep = false, and the nope boolen variable of nope = true

    System.out.println("You typed what was requested: " + yep);
    System.out.println("You ignored polite instruction: " + nope);

  }
}
