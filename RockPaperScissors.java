import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
		// could use this("");??????????????????????
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
		if(playChoice.equals(compChoice))
			winner = "!Draw game!";
		else if(playChoice == "R" && compChoice == "S")
			winner = "!Player wins <<Rock Breaks Scissors>>!";
		else if(playChoice == "S" && compChoice == "P")
			winner = "!Player wins <<Scissors Cuts Paper>>!";
		else if(playChoice == "P" && compChoice == "R")
			winner = "!Player wins <<Paper Covers Rock>>!";
		else if(compChoice == "S")
			winner = "!Computer wins <<Scissors Cuts Paper>>!";
		else if(compChoice == "R")
			winner = "!Computer wins <<Rock Breaks Scissors>>!";
		else if(compChoice == "P")
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
