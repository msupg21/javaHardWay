public class RandomNumbers {
  public static void main(String[] args) {
    int a, b, c, d;
    double r, rps;

    rps = Math.random();
    if (rps < 0.3333333) { // wiil be true 1/3 of the time
      System.out.println("ROCK");
    }
    else if (rps < 0.6666667) {
      System.out.println("PAPER");
    }
    else {
      System.out.println("SCISSORS");
    }
/*When we use  Math.random(); it will produce a new random double in the range [0.0, 1.0)
(that is, it might be exactly 0.0 but will never be exactly 1.0 and will most
likely be something in between.*/

// pick four random intergers, each 1-10
    a = 1 + (int)( 10*Math.random() );
    b = 1 + (int)( 10*Math.random() );
    c = 1 + (int)( 10*Math.random() );
    d = 1 + (int)( 10*Math.random() );
    System.out.println("1-10:\t" + a + "\t" + b + "\t" + c + "\t" + d );

/*
• Math.random() generates a random double from 0.0 to 0.99999999999
• 6*Math.random() scales it to be from 0.0 to 5.999999999999
• (int)(6*Math.random()) casts it to an integer, which throws aways the part after the decimal
point (truncates); now from 0 to 5
 1 + (int)(6*Math.random()) adds one, translating it to be from 1 to 6  */

// pick four random integers, each 1-6
    a = 1 + (int)( 6*Math.random() );
    b = 1 + (int)( 6*Math.random() );
    c = 1 + (int)( 6*Math.random() );
    d = 1 + (int)( 6*Math.random() );
    System.out.println( "1-6:\t" + a + "\t" + b + "\t" + c + "\t" + d );

// pick a single random integer, 1-100
    a = 1 + (int)( 100*Math.random() );
    System.out.println( "1-100:\t" + a + "\t" + a + "\t" + a + "\t" + a );

 // pick four random integers, each 1-100
    a = 1 + (int)( 100*Math.random() );
    b = 1 + (int)( 100*Math.random() );
    c = 1 + (int)( 100*Math.random() );
    d = 1 + (int)( 100*Math.random() );
    System.out.println( "1-100:\t" + a + "\t" + b + "\t" + c + "\t" + d );

// pick four random integers, each 0-99
    a = 0 + (int)( 100*Math.random() );
    b = 0 + (int)( 100*Math.random() );
    c = (int)( 100*Math.random() );
    d = (int)( 100*Math.random() );
    System.out.println( "0-99:\t" + a + "\t" + b + "\t" + c + "\t" + d );

// pick four random integers, each 10-20
    a = 10 + (int)( 11*Math.random() );
    b = 10 + (int)( 11*Math.random() );
    c = 10 + (int)( 11*Math.random() );
    d = 10 + (int)( 11*Math.random() );
    System.out.println( "10-20:\t" + a + "\t" + b + "\t" + c + "\t" + d );

// display four random doubles, each (0-1)
    System.out.println( "0-1:\t" + Math.random() + "\t" + Math.random() );
    System.out.println( "0-1:\t" + Math.random() + "\t" + Math.random() );

    r = 10 * Math.random();
    System.out.println( "0-9.99:\t" + r );
    System.out.println( "0-9:\t" + (int)r );
    System.out.println( "1-10:\t" + (1 + (int)r) );

// display 3 random ints, each 1-3
    a = 1 + (int)(3*Math.random());
    b = 1 + (int)(3*Math.random());
    c = 1 + (int)(3*Math.random());
      System.out.println( "1-3:\t" + a + "\t" + b + "\t" + c);

  // display 3 random ints between 5-10

    a = 5 + (int)(6*Math.random()); //start at a = 5 because the first number is 5
    b = 5 + (int)(6*Math.random()); // 6*Math.random because there are 6 number from 5-10 (including 10)
    c = 5 + (int)(6*Math.random());
      System.out.println( "5-10:\t" + a + "\t" + b + "\t" + c);

  }
}
