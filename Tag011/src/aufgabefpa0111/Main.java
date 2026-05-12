package aufgabefpa0111;

import java.util.Scanner;

public class Main
{
    // Der Benutzer gibt eine Zahl ein. Diese sollte zwischen 1 und 7 liegen.
    // Das Programm gibt daraufhin den entsprechenden Wochentag aus.
    // Z.B. für 2 erscheint die Ausgabe "Dienstag".
    // Sollte die Eingabe ausserhalb dieser Zahlen liegen erfolgt eine Information an den Nutzer
    //"Falsche Eingabe" oder "Bitte nur 1 bis 7 eingeben"

    static void main()
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Geben Sie bitte eine Zahl zwischen 1 und 7 ein.");

        int wochentag = Integer.parseInt(scan.nextLine());

        switch(wochentag)
        {
            case 1:
                System.out.println("Montag");
                break;
            case 2:
                System.out.println("Dienstag");
                break;
            case 3:
                System.out.println("Mittwoch");
                break;
            case 4:
                System.out.println("Donnerstag");
                break;
            case 5:
                System.out.println("Freitag");
                break;
            case 6:
                System.out.println("Samstag");
                break;
            case 7:
                System.out.println("Sonntag");
                break;
            default:
                System.out.println("Ungültige Eingabe");
        }

        String tag = switch(wochentag)
        {
            case 1 -> "Montag";
            case 2 -> "Dienstag";
            case 3 -> "Mittwoch";
            case 4 -> "Donnerstag";
            case 5 -> "Freitag";
            case 6 -> "Samstag";
            case 7 -> "Sonntag";
            default -> "Ungültige Eingabe";
        };
    }
}
