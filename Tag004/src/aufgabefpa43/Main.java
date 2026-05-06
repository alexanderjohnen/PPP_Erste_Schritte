package aufgabefpa43;

import static allgmein4.ReadlineLX.*;

// PROGRAMM PrüfungsAuswertung
//
// Beginn
// Ausgabe "Maximale Punktzahl?"
// Eingabe "max_punkte"
//
// Ausgabe "Erreichte Punktzahl?"
// Eingabe "erreichte_punkte"
//
// Berechne prozent = (erreichte_punkte / max_punkte) * 100
//
// Wenn erreichte_punkte >= (max_punkte * 0,5)
// Dann
//      Ausgabe "Bestanden mit " + prozent + " %"
// Sonst
//      Ausgabe "Nicht bestanden mit " + prozent + " %"
// Ende

public class Main
{
    static void main()
    {
        System.out.println("Maximale Punktzahl:");
        int max = parseIntLX();
        System.out.println("Erreichte Punktzahl:");
        double points = parseDoubleLX();

        double percent = points / max * 100;

        if(points >= max * 0.5)
            System.out.printf("Du hast die Prüfung erfolgreich mit %.2f Prozent der Punkte bestanden!%n", percent);
        else
            System.out.printf("Du hast die Prüfung mit %.2f Prozent der Punkte leider nicht bestanden!%n", percent);
    }
}
