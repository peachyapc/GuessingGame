import java.util.Random;

/**
 * Game of guessing a secret number
 * 
 * @author Apichaya
 *
 */
public class GuessingGame {
	private int upperBound;
	private int secret;
	private String hint;
	private int count;

	/**
	 * set the upperBound for the upper number. create a secret number by
	 * calling getRandomNumber initialize the hint. Use: "I'm thinking of a
	 * number between 1 and 20".
	 * 
	 * @param upperBound
	 *            = the last number you want to random until it.
	 */
	public GuessingGame(int upperBound) {
		this.upperBound = upperBound;
		secret = getRandomNumber(upperBound);
		setHint("I'm thinking of a number between 1 and " + upperBound);
		count = 0;
	}

	/**
	 * Create a random number between 1 and limit.
	 * 
	 * @param limit
	 *            is the upper limit for random number
	 * @return a random number between 1 and limit (inclusive)
	 */
	private int getRandomNumber(int limit) {
		Random rand = new Random(System.currentTimeMillis());
		return rand.nextInt(limit) + 1;
	}

	/**
	 * method that evaluates a guess. It also creates a hint (a String) which is
	 * saved for later.
	 * 
	 * @param number
	 *            is a number that user has guess.
	 * @return for check Is the number that user input is equal to a secret
	 *         number or not if it not equal return false. else return true.
	 */
	public boolean guess(int number) {
		count = count + 1;
		if (number < secret) {
			setHint("Sorry, your guess is too small.");
			return false;
		} else if (number > secret) {
			setHint("Sorry, you're guess is too large.");
			return false;
		} else {
			setHint("Correct!. You used " + getCount() + " guesses.");
			return true;
		}
	}

	/**
	 * method getHint( ) show the current hint
	 * 
	 * @return the hint attribute (hint variable) = the current hint.
	 */
	public String getHint() {
		return hint;
	}

	/**
	 * set hint to be current hint
	 * 
	 * @param hint
	 */
	protected void setHint(String hint) {
		this.hint = hint;
	}

	/**
	 * method that count how many time you have been guessing.
	 * 
	 * @return the current count.
	 */
	public int getCount() {
		return count;
	}

}
