package aufgabefpa0122;

import java.util.Scanner;

public class Main
{
    /*
    Erstellen Sie zunächst die Klasse "Mantel".
    Der Mantel hat die privaten Attribute
    - String material
    - int anzahlTaschen
    - boolean hatKnoepfe

    Erstellen Sie die Attribute und (falls erforderlich) Getter und Setter.

    In der Main erzeugen Sie ein Array vom Typ Mantel für 3 Elemente.
    Füllen Sie das Array in einer Schleife mit Mänteln, in welcher der
    User die Daten eingibt. Ein Mantel soll über einen geeigneten
    Konstruktor-Aufruf erstellt werden.

    Geben Sie nun die Mäntel mithilfe einer foreach-Schleife auf
    dem Bildschirm aus. Überschreiben Sie dazu die toString()-Methode
    der Klasse "Mantel".
    */

    static void main()
    {
        Scanner scan = new Scanner(System.in);

        Mantel[] mantelArray = new Mantel[3];

        for (int i = 0; i < mantelArray.length; i++)
        {
            mantelArray[i] = new Mantel();
            System.out.println("Welches Material für Mantel " + (i+1) + "?");
            mantelArray[i].setMaterial(scan.nextLine());
            System.out.println("Wie viele Taschen hat Mantel " + (i+1) + "?");
            mantelArray[i].setAnzahlTaschen(Integer.parseInt(scan.nextLine()));
            System.out.println("Hat Mantel " + (i+1) + " Knöpfe?");
            mantelArray[i].setHatKnoepfe(parseBooleanLX());

//            System.out.println("Mantel " + (i+1) + " Material: " + mantelArray[i].getMaterial() +
//                    "\nMantel " + (i+1) + " Anzahl Taschen: " + mantelArray[i].getAnzahlTaschen() +
//                    "\nSind Knöpfe vorhanden: " + booleanToTextLX(mantelArray[i].getHatKnoepfe()));
        }

//        int i = 0;
//
//        for (Mantel mantelImArray : mantelArray)
//        {
//            i = i + 1;
//            System.out.println("Mantel " + i + " Material: " + mantelImArray.getMaterial() +
//                    "\nMantel " + i + " Anzahl Taschen: " + mantelImArray.getAnzahlTaschen() +
//                    "\nSind Knöpfe vorhanden: " + booleanToTextLX(mantelImArray.getHatKnoepfe()));
//           mantelImArray.toString(i, mantelImArray);
//        }

        for (Mantel mantelImArray : mantelArray)
        {
            System.out.println(mantelImArray);
        }
    }
}
