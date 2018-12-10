import java.util.Arrays;

public class Player {
	
	private final String options[] = {"ROCK", "PAPER", "SCISSORS"};
	
	private String name;
	private String playerChoice;
	private int score;
	
	public Player(String playerName)
	{
		name = playerName;
		score = 0;
		playerChoice = "";
	}
	public void randomizeHand()
	{
		int randomIndex = (int)(Math.random() * (3));
		playerChoice = options[randomIndex];
	}
	public Player compareTo(Player playerToCompare)
	{
		if(this.getHand().equals("ROCK"))
		{
			return rockCompare(playerToCompare);
		}
		else if(this.getHand().equals("PAPER"))
		{
			return paperCompare(playerToCompare);
		}
		else if(this.getHand().equals("SCISSORS"))
		{
			return scissorCompare(playerToCompare);
		}
		return null;
	}
	public Player rockCompare(Player playerToCompare)
	{
		if(playerToCompare.getHand().equals("ROCK"))
		{
			return new Player("Tie!");
		}
		else if(playerToCompare.getHand().equals("PAPER"))
		{
			return playerToCompare;
		}
		else if(playerToCompare.getHand().equals("SCISSORS"))
		{
			return this;
		}
		return null;
	}
	public Player paperCompare(Player playerToCompare)
	{
		if(playerToCompare.getHand().equals("ROCK"))
		{
			return this;
		}
		else if(playerToCompare.getHand().equals("PAPER"))
		{
			return new Player("Tie!");
		}
		else if(playerToCompare.getHand().equals("SCISSORS"))
		{
			return playerToCompare;
		}
		return null;
	}
	public Player scissorCompare(Player playerToCompare)
	{
		if(playerToCompare.getHand().equals("ROCK"))
		{
			return playerToCompare;
		}
		else if(playerToCompare.getHand().equals("PAPER"))
		{
			return this;
		}
		else if(playerToCompare.getHand().equals("SCISSORS"))
		{
			return new Player("Tie!");
		}
		return null;
	}
	public void setHand(String hand)
	{
		if(Arrays.asList(options).contains(hand.toUpperCase()))
		{
			playerChoice = hand.toUpperCase();
		}
		else 
		{
			playerChoice = "";
		}
	}
	public void setScore(int newScore)
	{
		score = newScore;
	}
	public String getHand()
	{
		return playerChoice;
	}
	public int getScore()
	{
		return score;
	}
	public String getPlayerName()
	{
		return name;
	}
}
