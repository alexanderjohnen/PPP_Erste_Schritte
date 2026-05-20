package aufgabe0141;

import java.util.Arrays;
import java.util.Scanner;

import static lxutil.LxScanner.*;

public class Main
{
    /*  Level 1

	In einer Schleife kann der Benutzer 10 ganze Zahlen eingeben.
	Danach werden diese Zahlen mit Bubble Sort sortiert.
	Im Anschluss werden die Zahlen ausgegeben.

	Bitte erstellen Sie einen Pseudocode und danach ein Java Programm
    */

    static void main()
    {

        Scanner scan = new Scanner(System.in);

        int[] input = new int[10];
        String[] numberToString = {"erste", "zweite", "dritte", "vierte", "fünfte", "sechste", "siebte", "achte", "neunte", "zehnte"};

        for(int i = 0; i < 10; i++)
        {
            input[i] = LxParseInt("Bitte geben Sie die " + numberToString[i] + " von zehn Zahlen ein: ");
        }

        System.out.println(Arrays.toString(input));

        BubbleSort(input);

        System.out.println(Arrays.toString(input));
    }

//      Innere Schleife vergleicht aktuelle Position j mit Nachbar j+1
//      -1: Verhindert, dass j+1 die Array-Größe überschreitet (vermeidet ArrayIndexOutOfBoundsException)
//      -i: Ignoriert die bereits sortierten Elemente am rechten Rand, da nach jedem Durchlauf (i)
//      das jeweils größte Element der verbleibenden Zahlen korrekt platziert ist

    private static void BubbleSort(int[] arr)
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
