import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class SkunkApp
{

	public static void main(String[] args)
	{
		StdOut.println("Welcome to 635 Skunk project!");
		
		StdOut.println("Play one Turn for player1");
		
		String player = "player1";
		
		Turn turn = new Turn(); 
		
		while (true)
		{
			StdOut.print("Do you wish to roll again? 'n' or 'y' (RETURN): ");
			String reply = StdIn.readLine();
			
			if (reply.equals("n"))
				break;
			
			turn.doRoll();
			
			int rollScore = turn.getLastRollScore();
			
			if (rollScore == 0) // skunk?
			{
				StdOut.println("Roll result: " + rollResult());
			}
			
		}
		
		String turnResult = turn.getTurnResult();
		
		StdOut.println("Turn result: " + turnResult);
		

	}

	private static String rollResult()
	{
		// TODO Auto-generated method stub
		return null;
	}

}
