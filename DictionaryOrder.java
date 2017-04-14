import java.util.Scanner;

public class DictionaryOrder {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String name;

    System.out.println("Make up the name of a programming language!");
    name = keyboard.nextLine().toLowerCase();

    if (name.compareTo("c++") < 0)
      System.out.println(name + " comes BEFORE c++");
    if (name.compareTo("c++") == 0)
      System.out.println("c++ isn't a made-up language");
    if (name.compareTo("c++") > 0)
      System.out.println(name + " comes AFTER c++");

    if (name.compareTo("go") < 0)
      System.out.println(name + " comes BEFORE go");
    if (name.compareTo("go") == 0)
      System.out.println("go isn't a made-up language");
    if (name.compareTo("go") > 0)
      System.out.println(name + " comes AFTER go");

    if (name.compareTo("java") < 0)
      System.out.println(name + " comes BEFORE java");
    if (name.compareTo("java") == 0)
      System.out.println("java isn't a made-up language");
    if (name.compareTo("java") > 0)
      System.out.println(name + " comes AFTER java");

    if (name.compareTo("lisp") < 0)
      System.out.println(name + " comes BEFORE lisp");
    if (name.compareTo("lisp") == 0)
      System.out.println("lisp isn't a made-up language");
    if (name.compareTo("lisp") > 0)
      System.out.println(name + " comes AFTER lisp");

    if (name.compareTo("python") < 0)
      System.out.println(name + " comes BEFORE python");
    if (name.compareTo("python") == 0)
      System.out.println("python isn't a made-up language");
    if (name.compareTo("python") > 0)
      System.out.println(name + " comes AFTER python");

    if (name.compareTo("ruby") < 0)
      System.out.println(name + " comes BEFORE ruby");
    if (name.compareTo("ruby") == 0)
      System.out.println("ruby isn't a made-up language");
    if (name.compareTo("ruby") > 0)
      System.out.println(name + " comes AFTER ruby");

    if (name.compareTo("visualbasic") < 0)
      System.out.println(name + " comes BEFORE visualbasic");
    if (name.compareTo("visualbasic") == 0)
      System.out.println("visualbasic isn't a made-up language");
    if (name.compareTo("visualbasic") > 0)
      System.out.println(name + " comes AFTER visualbasic");

      /* In this exercise, we learn how to compare stings, using - compartTo();
    The idea is that the if statement compares from left of compareTo to right
  IN this case name to what ever is in the () to the right of compareTo.  The point of
  using compareTo is to sort alphabetically.  if both strings are the same, then they
  are == 0.  If the left side is > than 0, then the int shifts to the right an int (1), this
  becomine greter than 0 (and after 0 | 1 > 0).  If the left side is less than the right side
  than the int moves to the left a single int, creating a negetive int (which is before 0
  | -1 < 0).   */

  }
}
