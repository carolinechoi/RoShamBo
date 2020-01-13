import java.util.scanner;

public class Tester
{
  public static void main(String[] args)
  {
    RockPaperScissors rps = RockPaperScissors();
    
    String theirInput = "";
    Scanner kb = Scanner(System.in);
    while(theirInput != "n")
    {
      System.out.print("Rock-Paper-Scissors - pick your weapon[R,P,S]:: ");
      theirInput = kb.next();
      rps.RockPaperScissors(theirInput);
      System.out.print("\nDo you want to play again? ");
      // theirInput = kb.next();
    }
  }
}
