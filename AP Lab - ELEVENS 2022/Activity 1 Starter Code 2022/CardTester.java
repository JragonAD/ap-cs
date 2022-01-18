/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 * 
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card c1, c2, c3;
		c1 = new Card("Ace", "Spaces", 1);
		c2 = new Card("King", "Hearts", 13);
		c3 = new Card("Three", "Diamonds", 3);

		System.out.println(c1.rank() + " of " + c1.suit() + " with a point value of: " + c1.pointValue());
		System.out.println(c2.matches(c3));
		System.out.println(c3);
	}
}
