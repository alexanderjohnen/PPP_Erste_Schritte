package aufgabefpa053;

import static allgmein4.ReadlineLX.*;

public class Main
{
    static void main()
    {
        int maxNumber = 0;
        int minNumber = 0;
        int amountNumbers;

        System.out.println("Wie viele Zahlen möchtest du eingeben?");
        amountNumbers = parseIntLX();

        for (int i = 0; i < amountNumbers; i++)
        {
            int newNumber = parseIntLX();

            if (i == 0 && newNumber > minNumber)
            {
                minNumber = newNumber;
            }

            if (i == 0 && newNumber < maxNumber)
            {
                maxNumber = newNumber;
            }

            if (newNumber <= minNumber)
            {
                minNumber = newNumber;
            }

            if (newNumber >= maxNumber)
            {
                maxNumber = newNumber;
            }
        }

        System.out.printf("Die kleinste Nummer lautet %d und die größte Nummer lautet %d.", minNumber, maxNumber);

    }
}
