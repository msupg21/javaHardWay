public class StringMethods2 {
  public static void main(String[] args) {
// the following are the types of different methods that can be used with strings
    System.out.println("Here are a list of the different types of string methods.");
    System.out.println();
    System.out.println("\t1.length" + "\n\t2.toUpperCase" + "\n\t3.toLowerCase" +
    "\n\t4.substring" + "\n\t5.charAt" + "\n\t6.equals" + "\n\t7.split");
    System.out.println();

// here are the following string methods in use.

// example:.lenth();
int myLength = "How many characters are in this string?".length();
    System.out.println("How many characters are in this string?");
    System.out.println("There are " + myLength + " characters in the above string.");

// example:toUpperCase();
String uCase = "I like this string in all uppercase".toUpperCase();
    System.out.println();
    System.out.println(uCase);

// example:toLowerCase();
String lCase ="THIS SENTENCE WILL STILL BE PRINTED IN ALL LOWERCASE".toLowerCase();
    System.out.println();
    System.out.println(lCase);

// example:substring();
String sString = "This is an example of using the string method of substring".substring(49,58);
    System.out.println();
    System.out.println(sString);

//example:charAt();
char myChar ="My char will be at the index".charAt(0);
    System.out.println();
    System.out.println("my char will be at the index which is at \" 0 \"");
    System.out.println(myChar);

// example:equals();
String e1="equal";
String e2="equal";
    System.out.println();
    System.out.println("If two strings have the same value and asked if they are equal,");
    System.out.println("then statement will come back as \"true!\". ");
    System.out.println(e1.equals(e2));

String f1="False";
String f2="I am am not False";
    System.out.println();
    System.out.print("If two Strings are asked if equal to eachother and they");
    System.out.println(" are not, message will come back as" + " \"False\". ");
    System.out.println(f1.equals(f2));

// Example:split();
String strMethods ="lenth, toUpperCase, toLowerCase, substring, charAt, equals, split";
String [] splitStrMethods = strMethods.split(", ");
    System.out.println(strMethods);
    System.out.println("These are the commonly used string methods.");

// These examples are just the most commonly used string methods!
  }
}
