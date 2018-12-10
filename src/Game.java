import java.util.ArrayList;
import java.util.Observable;

public class Game extends Observable
{

	private ArrayList<Player> players;
	private AlertState currentState;
	
	public Game()
	{
		players = new ArrayList<Player>();
		currentState = new BeginningState(this);
	}
	public void addPlayers(Player player)
	{
		players.add(player);
	}
	public void setState(AlertState state)
	{
		currentState = state;
		setChanged();
		notifyObservers();
	}
	public ArrayList<Player> getListOfPlayers()
	{
		return players;
	}
	public AlertState getState()
	{
		return currentState;
	}
	public void alert() 
	{
		currentState.alert(this);		
	}
}
