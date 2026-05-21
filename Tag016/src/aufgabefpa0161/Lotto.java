package aufgabefpa0161;

import lxutil.LxScanner;

import java.util.Arrays;
import java.util.Random;

public class Lotto
{

//    Zunächst gibt der Benutzer 6 Lottozahlen ein.
//    Dabei wird darauf geachtet, dass die Zahlen im Bereich von 1 - 49 liegen
//    und keine Dopplungen vorkommen.
//
//    Im Anschluss zieht der Computer in einer Schleife immer wieder 6 Lottozahlen.
//    Auch hier wird auf Dopplungen geachtet.
//
//    Jetzt werden die Zahlen vom Benutzer mit den Zahlen vom Computer
//    verglichen. Hat der Benutzer 6 Richtige, endet die Schleife und es wird
//    ausgegeben, wie viele Computer-Ziehungen dafür nötig waren.
//
//    Zusatzaufgabe:
//    Ein einzelner Lotto-Tipp kostet 2,10 Euro.
//    Wie viel hätte der Benutzer ausgeben müssen, um 6 Richtige zu haben?

    static void main()
    {
        int[] nutzerZahlen = new int[6];
        int[] computerZahlen = new int[6];
        Random rand = new Random();
        int counter = 0;

        System.out.println("Bitte geben Sie eine Zahl zwischen 1 und 49 ein: ");

        for (int i = 0; i < nutzerZahlen.length; i++)
        {
            nutzerZahlen[i] = LxScanner.LxParseInt();

            while (nutzerZahlen[i] < 1 || nutzerZahlen[i] > 49)
            {
                System.out.println("Ungültige Eingabe. Bitte geben Sie eine Zahl zwischen 1 und 49 ein.");
                nutzerZahlen[i] = LxScanner.LxParseInt();
            }

            for (int j = 0; j < i; j++)
            {
                while (nutzerZahlen[j] == nutzerZahlen[i] || nutzerZahlen[i] < 1 || nutzerZahlen[i] > 49)
                {
                    if (nutzerZahlen[j] == nutzerZahlen[i])
                    {
                        System.out.println("Bitte geben Sie keine Zahl doppelt ein.");
                        nutzerZahlen[i] = LxScanner.LxParseInt();
                        j = 0;
                    }
                    if (nutzerZahlen[i] < 1 || nutzerZahlen[i] > 49)
                    {
                        System.out.println("Ungültige Eingabe. Bitte geben Sie eine Zahl zwischen 1 und 49 ein.");
                        nutzerZahlen[i] = LxScanner.LxParseInt();
                    }
                }
            }
        }

        bubbleSort(nutzerZahlen);

        while (!Arrays.equals(computerZahlen, nutzerZahlen))
        {
            for (int i = 0; i < computerZahlen.length; i++)
            {
                computerZahlen[i] = rand.nextInt(1, 50);

                for (int j = 0; j < i; j++)
                {
                    while (computerZahlen[j] == computerZahlen[i])
                    {
                        computerZahlen[i] = rand.nextInt(1, 50);
                        j = 0;
                    }
                }
            }
            bubbleSort(computerZahlen);
            counter++;
        }

        double invest = counter * 2.10;

        System.out.println("Ihre getippten Zahlen sind " + Arrays.toString(nutzerZahlen) + ".");
        System.out.printf("Nach %d Ziehungen haben Sie sechs Richtige. Glückwunsch! Sie haben dafür nur %.2f Euro investiert", counter, invest);
    }

    private static void bubbleSort(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length - i - 1; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
    }

}
