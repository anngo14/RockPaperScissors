
public class GameOnLoopCommand implements Command{

	Game game;
	public GameOnLoopCommand(Game game)
	{
		this.game = game;
	}
	@Override
	public void execute() {
		int round = 0;
		while(round <= 5)
		{
			this.game.setState(new RunningState(this.game));
			this.game.alert();
			round++;
		}
	}
}
