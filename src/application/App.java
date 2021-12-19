package application;

public class App {

	public static void main(String[] args) {
		// Not always used; can be confusing

		// common to start booleans with "is"
		boolean isRaining = true;

		if (isRaining) {
			System.out.println("It's raining!");
			System.out.println("Take an umbrella.");
		}
		/*
		 * The above works as exepected. But what happens if the curly braces are
		 * removed? The if statement would then only run the first line after it. The
		 * second line would run regardless of the conditional in the if statement.
		 */

		boolean isHot = false;
		if (isHot)
			System.out.println("It's hot!");
		System.out.println("Dress cool.");
		/*
		 * In this case "Dress cool." is output, even though the conditional in the if
		 * statement is false and "It's hot!" is not printed.
		 */

		// This can get confusing, using one line if statements

		// One line statements also work with else statements as well

		// Test

		if (true)
			System.out.println("Test");
		/* Tried putting the above on one line
		 * it works, but the autoformatter puts it back on two lines
		 */
	}
}
