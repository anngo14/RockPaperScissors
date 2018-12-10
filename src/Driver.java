
public class Driver {

	public static void main(String[] args) 
	{
		printWelcomeMessage();
		setUpGame();
	}
	public static void printWelcomeMessage()
	{
		System.out.println("Welcome to Rock-Paper-Scissors");
		System.out.println("Standard Rules Apply:");
		System.out.println("\tRock > Scissors\n\tPaper > Rock\n\tScissors > Paper");
		System.out.println("\n\tWinner wins 15 points.");
		System.out.println("\tBoth players recieve 0 points in the case of ties.");
		System.out.println("Notes:");
		System.out.println("\tGame loops for five rounds then game resets to 0.");
		System.out.println("\tPlayer input is not case sensitive.");
		System.out.println("\tGame state is displayed when state has changed.\n");
	}
	public static void setUpGame()
	{
		Player firstPlayer = new Player("Yu Sir");
		Player secondPlayer = new Player("Mike Om Pewter");
		Game game = new Game();
		Referee referee = new Referee();
		SimpleRemoteControl controller = new SimpleRemoteControl();

		game.addPlayers(firstPlayer);
		game.addPlayers(secondPlayer);
		
		game.addObserver(referee);
		gameLoop(game, controller);
	}
	public static void gameLoop(Game game, SimpleRemoteControl controller)
	{
		game.setState(new BeginningState(game));
		game.alert();
		
		controller.setCommand(new GameOnLoopCommand(game));
		controller.executeCommand();
		
		game.setState(new EndState(game));
		game.alert();
		
		controller.setCommand(new GameResetCommand(game));
		controller.executeCommand();
	}
}
