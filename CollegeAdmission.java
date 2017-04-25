import static java.lang.System.*;
import java.util.Scanner;

public class CollegeAdmission {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int math, income;

    out.println("Welcome to the UT Austin College Admissions Interface!");
    out.print("Please enter your SAT math score (200-800): ");
    math = keyboard.nextInt();

    out.print("Admittance status: ");

    if (math >= 790)
      out.print("CERTAIN");
    else if (math >= 710)
      out.print("SAFE");
    else if (math >= 580)
      out.print("PROBABLE");
    else if (math >= 500)
      out.print("UNCERTAIN");
    else if (math >= 390)
      out.print("UNLIKELY");
    else  // below 390
      out.println("DENIED");
      out.println();

    out.println("What is your yearly income?  ");
    income = keyboard.nextInt();

    if (income >= 100000)
      out.print("You are well off");
    else if (income > 60000)
      out.print("You are in the middle class");
    else if (income > 30000)
      out.print("You probably make ends meet.");
    else
      out.print("You are broke dude!");
      out.println();
  }
}
