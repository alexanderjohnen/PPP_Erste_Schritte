package aufgabefpa052;

import static allgmein4.ReadlineLX.*;

public class Main
{
    static void main()
    {
        int rooms;
        int iterations = 1;
        double surface = 0;

        System.out.println("Wie viele Räume hat die Wohnung? Bitte in der nächsten Zeile eingeben: ");
        rooms = parseIntLX();

        while(iterations <= rooms)
        {
            System.out.println("Wie breit in Metern ist Raum " + iterations + "? Bitte in der nächsten Zeile eingeben: ");
            double width = parseDoubleLX();
            System.out.println("Wie lang in Metern ist Raum " + iterations + "? Bitte in der nächsten Zeile eingeben: ");
            double length = parseDoubleLX();
            surface = surface + width * length;
            iterations++;
        }

        System.out.printf("Die Gesamtfläche des Raumes beträgt %.2f Quadratmeter.", surface);
    }
}
