import java.util.Scanner;

public class ThirtyDays {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int month, days = 31;
    String monthName = "error";

    System.out.print("Which month? (1-12)" );
    month = keyboard.nextInt();

// Whatever month the user inputs holds a int type variable that is represented in the case.

    switch(month) {
      case 1: monthName = "January";
              break; // if you remove break, monthName will continue downward and switch unitl it hits a break.
      case 2: monthName = "February";
              break;
      case 3: monthName = "March";
              break;
      case 4: monthName = "April";
              break;
      case 5: monthName = "May";
              break;
      case 6: monthName = "June";
              break;
      case 7: monthName = "July";
              break;
      case 8: monthName = "August";
              break;
      case 9: monthName = "September";
              break;
      case 10: monthName = "October";
              break;
      case 11: monthName = "November";
              break;
      case 12: monthName = "December";
              break;
      }

/* Thirty days hath September, April, June, and November. All the rest
have thiry-one days.  Except the second month alone.... */

// this second switch lets the int variable hold another value., in this case days.
// if the days variable is not included, goes to default value for day "31"

    switch(month) {
      case  9:
      case  4:
      case  6:
      case 11: days = 30;
                break;
      case 2: days = 28;
              break;

    }
    System.out.println( days + " days hath " + monthName);

  }
}
