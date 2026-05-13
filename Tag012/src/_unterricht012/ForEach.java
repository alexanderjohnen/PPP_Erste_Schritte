package _unterricht012;

import java.util.Arrays;

public class ForEach
{
    public static void main()
    {
        //Ein Array zur Aufnahme von Zahlen
        int[] intArray = new int[10];

        // Befüllen des Arrays mit 10 Zahlen:
        for (int i = 0; i < intArray.length; i++)
        {
            intArray[i] = i * 2;
        }

        System.out.println("Ausgabe über Arrays.toString(): " + Arrays.toString(intArray));

        // Foreach-Schleife:
        // Foreach-Schleifen (auch "Enhanced-For" genannt) eignen sich besonders gut, um Arrays auszugeben oder anderweitig weiterzuverarbeiten.
        // Bei jeder Schleifeniteration wird der Inhalt einer Position im Array in die Variable kopiert und danach im Schleifenkörper verarbeitet.
        // Die Schleife läuft immer vom ersten Element des Arrays bis zum letzten.
        System.out.print("Ausgabe über ForEach-Schleife: ");
        // for (Datentyp variablenName : arrayName)
        for (int zahlImArray : intArray)
        {
            System.out.print(zahlImArray + " ");
        }
        System.out.println();
    }
}
