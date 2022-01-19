/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 * 
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] ranks = { "jack", "queen", "king" };
		String[] suits = { "blue", "red" };
		int[] pointValues = { 11, 12, 13 };
		Deck d1 = new Deck(ranks, suits, pointValues);
		System.out.println(d1.size());

		String[] ranks2 = {};
		String[] suits2 = {};
		int[] pointValues2 = {};
		Deck d2 = new Deck(ranks2, suits2, pointValues2);
		System.out.println(d2.isEmpty() + "\n");

		String[] ranks3 = { "jack", "queen", "king" };
		String[] suits3 = { "blue", "red" };
		int[] pointValues3 = { 11, 12, 13 };
		Deck d3 = new Deck(ranks3, suits3, pointValues3);
		System.out.println(d3);
		System.out.println("Dealing: " + d3.deal());
		System.out.println(d3);
	}
}
