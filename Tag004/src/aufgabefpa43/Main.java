package aufgabefpa43;

import static allgmein4.ReadlineLX.*;

// PROGRAMM PrüfungsAuswertung
//
// BEGINN
// AUSGABE "Maximale Punktzahl?"
// EINGABE "max_punkte"
//
// AUSGABE "Erreichte Punktzahl?"
// EINGABE "erreichte_punkte"
//
// BERECHNE prozent = (erreichte_punkte / max_punkte) * 100
//
// WENN erreichte_punkte >= (max_punkte * 0,5)
// DANN
//      AUSGABE "Bestanden mit " + prozent + " %"
// SONST
//      AUSGABE "Nicht bestanden mit " + prozent + " %"
// ENDE

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
