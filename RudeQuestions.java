import java.util.Scanner;

public class RudeQuestions {
  public static void main(String[] args) {
    String name;
    int age, hours;
    double weight, income;

    Scanner keyboard = new Scanner(System.in);

    System.out.print("Hello, What is your name?");
    name = keyboard.next();

    System.out.println("Hi, " + name + "! How old are you?");
    age = keyboard.nextInt(); // Compiler is expecting a string, thus you can enter anything (int, double, string).

    System.out.println("So you're " + age + ", eh? That's not very old.");
    System.out.println("So, how much do you weigh " + name + " ?");
    weight = keyboard.nextDouble(); /* you can always place a int in where compiler
    expects a double - floating point.  My guess is because it can hold as many bytes a int
    would need */

    System.out.println(weight + "!  Better keep that quiet!!");
    System.out.println("Finally, what is your income, " + name + " ?");
    income = keyboard.nextDouble();

    System.out.println("Hopefully that is " + income + " per hour?");
    System.out.println("and no per year!");
    System.out.println("Well thanks for answering all my rude questions\n" + name + ".");

    System.out.println(name + " How many hours of sleep do you get a night?");
    hours = keyboard.nextInt();
    System.out.println("Well, " + hours + " of sleep a night is not bad " +name + "!");








  }
}
