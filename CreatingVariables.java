public class CreatingVariables {
	public static void main( String[] args ) {
		int x, y, age, year;
		double seconds, e, checking, engine;
		String firstName, lastName, title, car;

		x = 10;
		y = 400;
		age = 39;
		year = 2009;

		seconds = 4.71;
		e = 2.71828182845904523536;
		checking = 1.89;
		engine = 2.4;

		firstName = "Chris";
		lastName = "Bartkewicz";
		title = "Mr.";
		car = "Pontiac Vibe";

		System.out.println( "The variable x contains " + x );
		System.out.println( "The value " + y + " is stored in the variable y." );
		System.out.println( "The experiment took " + seconds + " seconds." );
		System.out.println( "A favorite irrational # is Euler's number: " + e );
		System.out.println( "Hopefully you have more than $" + checking + "!" );
		System.out.println( "My name's " + title + " " + firstName + lastName );
		System.out.println( "I also drive a " + year + " " + car );
		System.out.println( "The car has a " + engine + " liter engine");
	}
}
