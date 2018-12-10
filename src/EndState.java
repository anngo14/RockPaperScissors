import java.util.ArrayList;

public class EndState implements AlertState{

	private Game currentGame;
	private ArrayList<Player> playerList;
	
	public EndState(Game game)
	{
		currentGame = game;
		playerList = currentGame.getListOfPlayers();
	}
	@Override
	public void alert(Game gameState) 
	{
		System.out.println("Game Over!\n");
		System.out.println(playerList.get(0).getPlayerName() + " has " + playerList.get(0).getScore() + " points.");
		System.out.println(playerList.get(1).getPlayerName() + " has " + playerList.get(1).getScore() + " points.");
		System.out.println();
	}

}
