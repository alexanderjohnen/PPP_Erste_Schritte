package aufgabefpa44;

import java.util.Scanner;

// PROGRAMM MaximumBestimmen
//
// Beginn
// Ausgabe "Geben Sie bitte die erste Zahl ein:"
// Eingabe zahl1
//
// Ausgabe "Geben Sie bitte die zweite Zahl ein:"
// Eingabe zahl2
//
// Wahrheitswert vergleich = (zahl1 > zahl2)
//
// Wenn Vergleich gleich wahr dann
// Ausgabe "Das Maximum aus " + zahl1 + " und " + zahl2 + " ist " + zahl1
// Sonst
// Ausgabe "Das Maximum aus " + zahl2 + " und " + zahl1 + " ist " + zahl2
// Ende

public class Main
{
    static void main()
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Geben Sie bitte die erste Zahl ein:");
        int number1 = Integer.parseInt(input.nextLine());
        System.out.println("Geben Sie bitte die zweite Zahl ein:");
        int number2 = Integer.parseInt (input.nextLine());

        boolean compare;

        compare = number1 > number2;

        if (compare)
            System.out.printf("Das Maximum aus %d und %d ist %d.", number1, number2, number1);
        else
            System.out.printf("Das Maximum aus %d und %d ist %d.", number2, number1, number2);

    }
}
