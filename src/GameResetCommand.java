import java.util.ArrayList;

public class GameResetCommand implements Command{

	Game game;
	public GameResetCommand(Game game)
	{
		this.game = game;
		ArrayList<Player> playerList = this.game.getListOfPlayers();
		for(Player x: playerList)
		{
			x.setScore(0);
		}
	}
	@Override
	public void execute() {
		System.out.println("Game is Reset");
		
		this.game.setState(new BeginningState(this.game));
		this.game.alert();
		this.game.setState(new RunningState(this.game));
		this.game.alert();
		this.game.setState(new EndState(this.game));
		this.game.alert();
	}

}
