public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		this("");
		compChoice = "";
	}

	public RockPaperScissors(String player) 
	{
		playChoice = player;
		int num = (int)(Math.random()*3);
		if(num == 0)
			compChoice = "S";
		if(num == 1)
			compChoice = "R";
		if(num == 2)
			compChoice = "P";	
	}

	public String determineWinner2()
  	{
	    String winner="";
	    if(playChoice.equals(compChoice))
		    winner = "!Draw game!";
	    else if(playChoice.equals("R") && compChoice.equals("S"))
		    winner = "!Player wins <<Rock Breaks Scissors>>!";
	    else if(playChoice.equals("S") && compChoice.equals("P"))
		    winner = "!Player wins <<Scissors Cuts Paper>>!";
	    else if(playChoice.equals("P") && compChoice.equals("R"))
		    winner = "!Player wins!";
	  	else 
			winner = "!Computer wins!";
		return winner;
  	}

	public String determineWinner()
  	// returns third line of output i.e. who wins and why
	{
		// ideas: make a pairings list and check against them?
		String winner="";
		if(playChoice.equals(compChoice))
			winner = "!Draw game!";
		else if(playChoice.equals("R") && compChoice.equals("S"))
			winner = "!Player wins <<Rock Breaks Scissors>>!";
		else if(playChoice.equals("S") && compChoice.equals("P"))
			winner = "!Player wins <<Scissors Cuts Paper>>!";
		else if(playChoice.equals("P") && compChoice.equals("R"))
			winner = "!Player wins <<Paper Covers Rock>>!";
		else if(compChoice.equals("S"))
			winner = "!Computer wins <<Scissors Cuts Paper>>!";
		else if(compChoice.equals("R"))
			winner = "!Computer wins <<Rock Breaks Scissors>>!";
		else if(compChoice.equals("P"))
			winner = "!Computer wins <<Paper Covers Rock>>!";
		return winner;
	}

	public String toString()
	{
  	// returns first two lines of output i.e. values of playChoice and compChoice
		String output="player had " + playChoice + "\ncomputer had " + compChoice;
		return output;
	}
}
