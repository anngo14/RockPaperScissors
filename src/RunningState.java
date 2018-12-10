import java.util.ArrayList;
import java.util.Scanner;

public class RunningState implements AlertState{

	private Game currentGame;
	private ArrayList<Player> playerList;
	private Referee referee;
	private Scanner scanner;
	
	public RunningState(Game game)
	{
		currentGame = game;
		scanner = new Scanner(System.in);
		playerList = currentGame.getListOfPlayers();
		referee = new Referee();
		playerList.get(0).setHand("");
	}
	@Override
	public void alert(Game gameState) {
		while(playerList.get(0).getHand().equals(""))
		{
			System.out.print("Enter Your Choice(ROCK,PAPER,SCISSORS): ");
			String input = scanner.nextLine();
			playerList.get(0).setHand(input);
		}
		playerList.get(1).randomizeHand();
		referee.determineWinner(playerList.get(0), playerList.get(1));
		System.out.println();
	}

}
