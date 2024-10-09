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
        boolean doneRoll = false;


        do {
            System.out.println(" Roll    Die1    Die2    Die3    Sum");
            System.out.println("-------------------------------------");
            while (die1 != die2 && die1 != die3) {

                die1 = gen.nextInt(6) + 1;
                die2 = gen.nextInt(6) + 1;
                die3 = gen.nextInt(6) + 1;
                roll++;

                dieRoll = die1 + die2 + die3;

                System.out.printf("%4d\t%4d\t%4d\t%4d\t%4d\n", roll, die1, die2, die3, dieRoll);


            }
        }while(!doneRoll);

    }

}
