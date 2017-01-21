/**
 * Game of guessing a secret number
 * @author Apichaya
 *
 */
public class Main
{
	/**
	 * create objects, connect user interface to the game, and start the user interface.
	 * main is static method.
	 * @param args
	 */
	public static void main(String[] args) {
		GuessingGame game = new GuessingGame(20);
		GameConsole ui = new GameConsole();
		ui.play(game);	
	}	

}
