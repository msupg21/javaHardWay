import java.util.Scanner;

public class BMICalculator {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double m, kg, bmi, inc, inc2, feet, lbs;


    System.out.print("Your height in feet: ");
    feet = keyboard.nextInt();
    System.out.println("Now enter your inches: ");
    inc = keyboard.nextDouble();

    inc2 = feet * 12;
    m = (inc2 + inc) * 0.0254;


    System.out.print("Your weight in lbs: ");
    lbs = keyboard.nextDouble();
    kg = lbs * .453592;

    bmi = kg / (m*m);

    System.out.println("Your BMI is " + bmi);


  }
}
