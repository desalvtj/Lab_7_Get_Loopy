import java.util.Random;
import java.util.Scanner;

public class DieRoller
{
    public static void main(String[] args)
    {

        Random gen = new Random();
        Scanner in = new Scanner(System.in);

        int die1 = -1;
        int die2 = 0;
        int die3 = 0;
        int roll = 0;
        int dieRoll = 0;
        String playAgain = "";
        boolean doneInput = false;
        boolean donePlaying = false;



        do {
            System.out.println(" Roll    Die1    Die2    Die3    Sum");
            System.out.println("-------------------------------------");
            do{

                die1 = gen.nextInt(6) + 1;
                die2 = gen.nextInt(6) + 1;
                die3 = gen.nextInt(6) + 1;
                roll++;

                dieRoll = die1 + die2 + die3;

                System.out.printf("%4d\t%4d\t%4d\t%4d\t%4d\n", roll, die1, die2, die3, dieRoll);


            }while (!(die1 == die2 && die1 == die3));

                doneInput = false;

            do {
                System.out.print("Would you like to play again? [Y/N]: ");
                playAgain = in.nextLine();
                if (playAgain.equalsIgnoreCase("Y"))
                {
                    doneInput = true;
                    roll = 0;
                }
                else if (playAgain.equalsIgnoreCase("N"))
                {
                    System.out.println("Thanks for playing!");
                    doneInput = true;
                    donePlaying = true;
                }
                else
                    System.out.println(playAgain + " is an invalid choice. Please pick Y/N.");


            } while (!doneInput);


        }while (!donePlaying);

    }

}
