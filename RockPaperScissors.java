import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
  	// set playChoice = compChoice = ""
	{
		playChoice = "";
		compChoice = "";
	}

	public RockPaperScissors(String player) 
  	// what constructors do: set the instance vars. populate playChoice from the input, compchoice randomly
	{
		playChoice = player;
		double num = Math.random()*3;
		if(num == 0)
			compChoice = "S";
		if(num == 1)
			compChoice = "R";
		if(num == 2)
			compChoice = "P";
	}

	public String determineWinner()
  	// returns third line of output i.e. who wins and why
	{
		String winner="";
		return winner;
	}

	public String toString()
	{
  	// returns first two lines of output i.e. values of playChoice and compChoice
		String output="player had " + playChoice + "\ncomputer had " + compChoice;
		return output;
	}
}
