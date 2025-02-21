// COLLABORATORS: <tutors, instructor, or anyone else who helped you>

// DESCRIPTION: <a sentence about what the purpose of this program is>

public class Main
{
	public static void main(String[] args)
	{
    //DECLARATION + INITIALIZATION SECTION
    double initialAmount = 3.17;
    int centsRemaining = 0;
    int Quarters = 0;
    int Dimes = 0;
    int Nickles = 0;
    int Pennies = 0;
    //CALCULATION SECTION
    centsRemaining = (int)(100*initialAmount);
    Quarters = (int)(centsRemaining/25);
    centsRemaining = centsRemaining%25;
    Dimes = centsRemaining/10;
    centsRemaining = centsRemaining%10;
    Nickles = centsRemaining/5;
    centsRemaining = centsRemaining%5;
    Pennies = centsRemaining/1;
      //OUTPUT SECTION
  System.out.println("$" +initialAmount+ " can be converted to " +Quarters+ " quarters, " +Dimes+ " dimes, " +Nickles+ " nickles, and " +Pennies+ " pennies.");

  }

}
