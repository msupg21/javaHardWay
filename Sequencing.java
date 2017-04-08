import java.util.Scanner;

public class Sequencing {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    double price, saleTax, sum, total;
    saleTax = 0.0825;


    System.out.println("This app figures out total sales tax");
    System.out.print("Please enter the item price: ");
    price = keyboard.nextDouble();

    sum = price * saleTax; // this figures out total tax
    total = sum + price; // this is tax + price

    System.out.println("The item price was $" + price);
    System.out.println("The total tax was $" + sum);
    System.out.println("The grand total after tax is $" + total);


  }
}
