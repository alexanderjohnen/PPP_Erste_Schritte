package aufgabefpa072;

public class Main
{
    /*  Level 1

    Nehmt das Countdown-Programm aus dem Modul "Schleifen2" und schreibt es so um, dass
    der Countdown in einer eigenen Methode stattfindet.
    Diese Methode wird aus der Main aufgerufen.

    */

    static void main(String[] args)
    {
        countdown();
    }

    static void countdown()
    {
        for (int i = 10; i >= 0; i--)
        {
            System.out.printf("Countdown: %d \n", i);
        }

        System.out.println("Die Rakete startet.");
        System.out.println();

        int count = 11;

        while (count > 0)
        {
            count--;
            System.out.printf("Countdown: %d \n", count);
        }

        System.out.println("Die Rakete startet.");
    }

}
