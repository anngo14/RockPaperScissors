import java.util.Scanner;

public class BeginningState implements AlertState{

	private Game currentGame;
	private Scanner scanner;
	
	public BeginningState(Game game)
	{
		currentGame = game;
		scanner = new Scanner(System.in);
	}
	@Override
	public void alert(Game context) 
	{
		String userInput = "";
		while(!userInput.equals("START"))
		{
			System.out.print("Enter START to begin: ");
			userInput = scanner.nextLine();
			userInput = userInput.toUpperCase();
		}
		System.out.println();
	}

}
