/* COSC 2006 Assignment 2 Question 1: Chapter 3 Exercise 19
 * Nathan Sauve
 * july 7th 2013
 * 
 *  Modified rabbits method which nests input according to it's position in the recursion
 *  sequence
 */
package assignment2;


public class ModifiedRabbit {
	private int nestLevel = 0;  // default nested position is no indents

	// Main method to test 
	public static void main(String[] args) {
		ModifiedRabbit test = new ModifiedRabbit();  //use class for an instance variable to store nest info
		int n = 4;
		test.modRabbit(n);
	}
	
	/** Calculate fibonacci rabbit sequence */
	public int modRabbit(int n) {
	// ------------------------------
	// Precondition: n > 0 or answer just returns 1
	// Postcondition: returns fibonacci sequence for n
	// --------------------------------
		
		nestLevel++;  // increases level of nesting when a new modRabbit is entered
		nestTabs(nestLevel);
		System.out.println("Enter ModRabbit(n = " + n + ")");
		if (n <= 2) {
			nestTabs(nestLevel);
			System.out.println("Leave ModRabbit(n = " + n + "), value = 1");
			nestLevel--;
			return 1;
		}

		int ans = modRabbit(n - 1) + modRabbit(n - 2);
		nestTabs(nestLevel);
		System.out.println("Leave ModRabbit(n = " + n + "), value = " + ans);
		nestLevel--;
		return ans;

	} // end modRabbit
	
	/** Method that indents according to depth of recursive call */
	public void nestTabs(int tabs){
	// This method tracks how far along a chain the current recursive function call is and
	// indents appropriately.
	// Precondition: method is used in a working recursive function
	// Postcondition: indents console output the appropriate number of times
		
		while (tabs > 1) {
			System.out.print("--");
			tabs--;
		}
		System.out.print("*");
	}
	
}

