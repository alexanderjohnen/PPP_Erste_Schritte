package aufgabefpa063;

import java.util.Random;

public class Main
{
    /*  Level 2

	Folgender Code soll in JAVA erstellt werden:

	Es werden jede Stunde Temperaturen einer Wetterstation gespeichert.

	Es soll der Durchschnitt und die größte und kleinste Temperatur ermittelt und ausgegeben werden.

	Erzeugen Sie dazu ein Array mit 10.000 ganzen Zufallszahlen in einem sinnvollen Temperaturbereich.

	Das Programm soll den Durchschnitt, das Maximum und das Minimum ermitteln und ausgeben.

	Erstellen Sie zuerst den Pseudocode und anschließend den passenden Java Code.
    */

    static void main(String[] args)
    {
        int[] temperaturbereich = new int[10000];

        int min = temperaturbereich[0];
        int max = temperaturbereich[0];
        double average = 0;

        for (int i = 0; i < temperaturbereich.length; i++)
        {
            Random rand = new Random();
            temperaturbereich[i] = rand.nextInt(-20,40);
            //System.out.println(temperaturbereich[i]);

            int newNumber = temperaturbereich[i];

            if (newNumber <= min)
            {
                min = newNumber;
            }

            if (newNumber >= max)
            {
                max = newNumber;
            }
        }

        System.out.printf("Die tiefste Temperatur ist %d \n", min);
        System.out.printf("Die höchste Temperatur ist %d \n", max);

        for (int i = 0; i < temperaturbereich.length; i++)
        {
            average = average + temperaturbereich[i];
        }

        System.out.printf("Die Durchschnittstemperatur ist %f", (average / temperaturbereich.length));
    }
}
