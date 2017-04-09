import java.util.Scanner;

public class BooleanExpressions {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    boolean a, b, c, d, e, f;
    double x, y;

    System.out.print("Give me two numbers. First: ");
    x = keyboard.nextDouble();
    System.out.print("Second: ");
    y = keyboard.nextDouble();

    a = (x <  y); // a = (3 <  4); true
    b = (x <= y); // b = (3 <= y); true
    c = (x == y); // c = (3 == 4); false
    d = (x != y); // d = (3 != 4); true
    e = (x >  y); // e = (3 >  4); false
    f = (x >= y); // f = (3 >= 4); false

// below, the last char are actually the boolen variables...
    System.out.println(x + " is LESS THAN " + y + ": " + a);
    System.out.println(x + " is LESS THAN / EQUAL TO " + y + ": " + b);
    System.out.println(x + " is EQUAL TO " + y + ": " + c);
    System.out.println(x + " is NOT EQUAL TO " + y + ": " + d);
    System.out.println(x + " is GREATER THAN " + y + ": " + e);
    System.out.println(x + " is GREATER THAN / EQUAL TO " + y + ": " + f);
    System.out.println();

    System.out.println( !(x < y) + " " + (x >= y) ); // false | false
    System.out.println( !(x <= y) + " " + (x > y) ); // false | false
    System.out.println( !(x == y) + " " + (x != y) ); // true | true
    System.out.println( !(x != y) + " " + (x == y) ); // false | false
    System.out.println( !(x > y) + " " + (x <= y) ); // true | true
    System.out.println( !(x >= y) + " " + (x < y) ); // true | true

    /* the six operators
    1. less than <
    2. greater than >
    3. less than or equal to <=
    4. greater than or equal to >=
    5. equal to ==
    6. not equal to !=
    */

    }
}
