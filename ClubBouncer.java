import java.util.Scanner;

public class ClubBouncer {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    int age = 22;
    boolean onGuestList = false;
    double allure;
    String friends, gender = "F";

    System.out.print("Will you be bringing girl friends? Yes or No? ");
    friends = keyboard.nextLine().toUpperCase(); /* here it is smart to use
    toUpperCase(); because user might use a mixture of lowerCase and UpperCase.
    Using toUpperCase turns user's input into all caps, allowing the compiler to
    not be confused when determining the value for the string friends */

  if (onGuestList && age >= 21 || friends.equals("YES")) {
      System.out.println("Since you are brining friends, you may enter!");
      return; /*use return; at the end of an "if" statement if you would like
      the program to stop running.  Here if friends.equals "yes", no further
      conditions need to be met.  If friends.equals "no", then we will run the
      rest of the conditions.  */
      }

  else {
      System.out.println("Well in that case, tell me this...");
      }

      System.out.print("On a scale from 0.0 to 10.0, how hot are you? ");
      allure = keyboard.nextDouble();

  if (allure >= 7.0) {
      System.out.println("Ok, you are allowed to enter ther club.");
  }

  else {
      System.out.println("You are not allowed to enter the club.");
    }
  }
}
/* note:  every else statement has to follow imeditaly after a if statement.
If there is any other syntax between the last if block and else statement, the program
will crashn */
