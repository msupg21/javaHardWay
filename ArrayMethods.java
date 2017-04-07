/*in order to use array methods, we first have to import them.  To import them
we use "import java.util.Arrays;".  Unlike the String Methods - which are already
loaded in the "java.lang package" by default, we have to manually import Array
Methods*/

// We also place the line of code after the package, but also before the public class.

import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {
      System.out.println("Here are some of the most commonly used Array Methods.");
      System.out.println("\tequals()" + "\n\tcopyOfRange()" +"\n\ttoString()" +
      "\n\tsort()" + "\n\tbinarySearch()");
      System.out.println("The above are some Array Method types.");

//Example:equals()
int [] arr1 = {0,1,2,3,4};
int [] arr2 = {0,1,2,3,4};
int [] arr3 = {1,2,3,4,};

boolean results1 = Arrays.equals(arr1, arr2); //true
boolean results2 = Arrays.equals(arr1, arr3); // false
      System.out.println();
      System.out.println("int [] arr1 = {0,1,2,3,4};");
      System.out.println("int [] arr2 = {0,1,2,3,4};");
      System.out.println("int [] arr3 = {1,2,3,4,};");
      System.out.println();
      System.out.println("boolean results1 = Arrays.equals(arr1, arr2); /true");
      System.out.println("boolean results2 = Arrays.equals(arr1, arr3); /false");
      System.out.println();
      System.out.println("The above true/false statements are a result of two sets" + "\nof arrays - one being equal and one not being equal.");

//Example:copyOfRange;
      System.out.println("Here is an example of copyOfRange array method");
int [] source = {3, 4, 42 , 21, 53 , 53, 3, 1, 8};
int [] dest = Arrays.copyOfRange(source, 6, 9); //source copy's, start index is 6, end index is 9(which prints out to 9, so really 8th index)

//Example:toString()
/*As you might have noticed, there was not an opportunity to print out a return from the
copyOfRange of range example.  That is because arrays will show a memory location when trying to
print if not compiled to print using the "toSting" array method.  Below is an example of
the toString() using the dest from above statements.*/

      System.out.println("Here is an example of printing copyOfRange results using the toString() method");
      System.out.println();
      System.out.println("Below is the copyOfRange result from previous example");
      System.out.println(Arrays.toString(dest));// prints dest array, which is copying range.
      // To copy source, just switch dest to source and it will print out original array of int's
      System.out.println();

//Example:sort();
int [] set1 = {2,4,-8,3,9,1};
    System.out.println();
    Arrays.sort(set1); // This sorts the ints in accending fashion.
    System.out.println("Arrays.sort() method will sort ints in accending fashion");
    System.out.println();
    System.out.print("int [] set1 = {2,4,-8,3,9,1};");
    System.out.println();
    System.out.println();
    System.out.println(Arrays.toString(set1)); // sorts the array of set1

//Example:binarySearch();
int [] group1 = {-2, 4, 8, 1, 0, 33,11};
    System.out.println("Here is an examle of useing binarySearch");
    System.out.println("\nint [] group1 = {-2, 4, 8, 1, 0, 33,11};");
    System.out.println();
    Arrays.sort(group1); // again sorts group1 one array {-2, 4, 8, 1, 0, 33,11};
    System.out.println(Arrays.toString(group1)); // will print out sorted group1 array
int findIndex = Arrays.binarySearch(group1, 1);
    System.out.println("The index I am looking for is the int 1");
    System.out.println();
    System.out.println("The index is " + findIndex); // will print out the index of 1 once sorted

// Again just some samples of Array Methods
    }

}
