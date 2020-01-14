import java.util.Scanner;

public class Tester
{
  public static void main(String[] args)
  {    
    String theirInput = "";
    while(!theirInput.equals("n"))
    {
      Scanner kb = new Scanner(System.in);
      System.out.print("Rock-Paper-Scissors - pick your weapon[R,P,S]:: ");
      theirInput = kb.next();

      RockPaperScissors rps = new RockPaperScissors(theirInput);
      System.out.println(rps.toString());
      System.out.println(rps.determineWinner());
      
      System.out.print("\nDo you want to play again? ");
      theirInput = kb.next();
      System.out.println("");
    }
  }
}
