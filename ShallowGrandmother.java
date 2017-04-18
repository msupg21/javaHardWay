import java.util.Scanner;

public class ShallowGrandmother {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int age;
    double income, income2, cute, happy;
    boolean allowed, allowed2, allowed3;

    System.out.print("Enter your age: ");
    age = keyboard.nextInt();

    System.out.print("Enter your income: ");
    income = keyboard.nextDouble();

    System.out.print("How cute are you, on a scale from 0.0. to 10.0? ");
    cute = keyboard.nextDouble();

    allowed = (age > 25 && age < 40 && (income > 50000 || cute >= 8.5));

    System.out.println("allowed to date my grandchild? " + allowed);

    System.out.print("On a scale to 1.0 to 10.0, how happy does he make you? ");
    happy = keyboard.nextDouble();

    allowed2 = (age > 25 && (income >50000 || happy > 7)); /* here all that, matters is
    being older than 25 and making her happy.  No longer is income or cuteness have to check
    out right */

    System.out.println("After reconsidering, Grandma has made her decision on dating him: " + allowed2);

    System.out.println("Now, nothing creates more happiness than money. ");
    System.out.print("How much money will he make next year?: ");
    income2 = keyboard.nextDouble();

    allowed3 = (age > 25 || income2 > 60000 || happy > 7);
    System.out.println("yea, go for the money! Are you allowed to date him now?: " + allowed3);

  }
}
