import java.util.Observable;
import java.util.Observer;

public class Referee implements Observer{

	private Game gameUpdate;
	
	public Referee()
	{
	}
	public void determineWinner(Player firstPlayer, Player secondPlayer)
	{
		Player roundWinner = firstPlayer.compareTo(secondPlayer);
		roundWinner.setScore(roundWinner.getScore() + 15);
		System.out.println(firstPlayer.getPlayerName() + " shows " + firstPlayer.getHand());
		System.out.println(secondPlayer.getPlayerName() + " shows " + secondPlayer.getHand());
		System.out.println();
		if(roundWinner.getPlayerName().equals("Tie!"))
		{
			System.out.println(roundWinner.getPlayerName());
			System.out.println(firstPlayer.getPlayerName() + " has " + firstPlayer.getScore() + " points.");
			System.out.println(secondPlayer.getPlayerName() + " has " + secondPlayer.getScore() + " points.");
		}
		else
		{
			System.out.println(roundWinner.getPlayerName() + " has won the round.");
			System.out.println(roundWinner.getPlayerName() + " has " + roundWinner.getScore() + " points.");
		}
	}
	@Override
	public void update(Observable object, Object arg) {
		gameUpdate = (Game)object;
		System.out.print("Game State has changed. ");
		String gameUpdateSplit[] = gameUpdate.getState().toString().split("@");
		System.out.println("" + gameUpdateSplit[0]);
	}
}
