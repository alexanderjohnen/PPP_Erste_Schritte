package aufgabefpa0112;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main
{
    // Der Benutzer gibt eine Zahl ein. Diese sollte zwischen 1 und 12 liegen.
    // Das Programm gibt daraufhin die entsprechende Jahreszeit aus.
    // Z.B. für 7 erscheint die Ausgabe "Sommer".
    // Sollte die Eingabe ausserhalb dieser Zahlen liegen erfolgt eine Information an den Nutzer
    // ("Falsche Eingabe" oder "Bitte nur 1 bis 12 eingeben" oder etwas entsprechendes)
    // und er kann die Eingabe wiederholen.

    static void main()
    {
        boolean a = false;

        while(!a)
        {
            System.out.println("Bitte geben Sie eine Zahl zwischen 1 und 12 ein:");
            Scanner scan = new Scanner(System.in);
            int monat = Integer.parseInt(scan.nextLine());

            switch (monat)
            {
                case 12, 1, 2:
                    System.out.println("Winter");
                    a = true;
                    break;
                case 3, 4, 5:
                    System.out.println("Frühling");
                    a = true;
                    break;
                case 6, 7, 8:
                    System.out.println("Sommer");
                    a = true;
                    break;
                case 9, 10, 11:
                    System.out.println("Herbst");
                    a = true;
                    break;
                default:
                    System.out.println("Falsche Eingabe");
            }
        }
    }
}
