package aufgabefpa034;

import java.util.Scanner;

public class Main
{
    static void main()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Geben Sie bitte die Grundgebühr ein: ");
        double grundGebuehr = Double.parseDouble(input.nextLine());

        System.out.print("Geben Sie bitte die Anzahl der gefahrenen Kilometer ein: ");
        double strecke = Double.parseDouble(input.nextLine());

        System.out.print("Geben Sie bitte den Preis pro Kilometer ein: ");
        double preis = Double.parseDouble(input.nextLine());

        double rechnung = grundGebuehr + preis * strecke;

        System.out.printf(
                "Bei einer Grundgebühr von %.2f Euro " +
                        "und einem Kilometerpreis von %.2f Euro " +
                        "kostet eine %.2f km lange Taxifahrt insgesamt %.2f Euro.",
                grundGebuehr, preis, strecke, rechnung);
    }
}
