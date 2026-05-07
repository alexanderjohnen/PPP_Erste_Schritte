package aufgabefpa071;

public class Main
{
    /*  Level 1

	Das Programm zählt einen Countdown von 10 bis 0
	Und gibt dann aus - "Die Rakete startet"

	Einmal mit For und dann mit While Schleife lösen.

	Pseudocode und lauffähiges Programm in JAVA sind zu erstellen.
    */

    static void main(String[] args)
    {
        for (int i = 10; i >= 0; i--)
        {
            System.out.printf("Countdown: %d \n", i);
        }

        System.out.println("Die Rakete startet.");
        System.out.println();

        int countdown = 11;

        while (countdown > 0)
        {
            countdown--;
            System.out.printf("Countdown: %d \n", countdown);
        }

        System.out.println("Die Rakete startet.");
    }
}
