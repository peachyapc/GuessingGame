import java.util.Scanner;

/**
 * Game of guessing a secret number
 * 
 * @author Apichaya
 *
 */
public class GameConsole {
	/**
	 * play game on the console using input from a user.
	 * 
	 * @param game
	 *            that i want to play
	 * @return the secret number when user guesses it right.
	 */
	public int play(GuessingGame game) {
		Scanner scan = new Scanner(System.in);
		System.out.println(game.getHint());
		int number;
		while (true) {
			System.out.print("What is your guess? ");
			int num = scan.nextInt();
			if (game.guess(num)) {
				System.out.println(game.getHint());
				number = num;
				break;
			}
			System.out.println(game.getHint());
		}
		return number;
	}

}
