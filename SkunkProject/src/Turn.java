import java.util.ArrayList;

public class Turn
{
	
	private int turnScore;
	private int lastRollScore;
	private Roll lastRoll;
	private ArrayList<Roll> allRolls = new ArrayList();
	private boolean notOver;
	private int playerChips;
	private int kitty;

	public Turn()
	{
		// TODO Auto-generated constructor stub
	}

	public Object getTurnScore()
	{
		// TODO Auto-generated method stub
		return this.turnScore;
	}
	
	public int getLastRollScore()
	{
		return lastRollScore;
	}

	public boolean notDone()
	{
		// TODO Auto-generated method stub
		return notOver;
	}

	public void doRoll()
	{
		this.lastRoll = new Roll();
		if (lastRoll.isSingleSkunk())
		{
			lastRollScore = 0;
			
		}
			
	}

	public String getTurnResult()
	{
		// TODO Auto-generated method stub
		return null;
	}

	public String getRollResult()
	{
		// TODO Auto-generated method stub
		return null;
	}

}
