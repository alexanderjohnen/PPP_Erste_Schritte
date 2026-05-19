package _unterricht014;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Arrays2
{
    static void main()
    {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random(1);

        int[] zahlen = new int[20];
        for (int i = 0; i < zahlen.length; i++)
        {
            zahlen[i] = rand.nextInt(100);
        }

        System.out.println(Arrays.toString(zahlen));
        bubbleSort(zahlen);
        System.out.println("Sortiert: " + Arrays.toString(zahlen));

        System.out.print("Bitte gesuchte Zahl eingeben: ");
        int gesucht = Integer.parseInt(scan.nextLine());

        int index = lineareSuche(zahlen, gesucht);
        System.out.println("Gesuchte Zahl an Stelle: " + index);

        int index2 = binaereSuche(zahlen, gesucht, 0, zahlen.length - 1);
        System.out.println("Gefunden an Index: " + index2);

        int index3 = binaereSucheIterativ(zahlen, gesucht);
        System.out.println("Gefunden an Index " + index3);

    }

    // Bubble Sort
    private static void bubbleSort(int[] arr)
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

    // Lineare Suche
    private static int lineareSuche(int[] arr, int gesucht)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == gesucht)
            {
                return i;
            }
        }
        return -1;
    }

    // Binäre Rekursiv:
    private static int binaereSuche(int[] arr, int gesucht, int start, int ende)
    {
        if (start > ende)
        {
            return -(start + 1);
        }
        int mitte = start + (ende - start) / 2;

        if (arr[mitte] == gesucht)
        {
            return mitte;
        } else if (arr[mitte] > gesucht)
        {
            return binaereSuche(arr, gesucht, start, mitte - 1);
        } else
        {
            return binaereSuche(arr, gesucht, mitte + 1, ende);
        }
    }

    // Binär Iterativ
    private static int binaereSucheIterativ(int[] arr, int gesucht)
    {
        int links = 0;
        int rechts = arr.length - 1;

        while (links <= rechts)
        {
            int mitte = links + (rechts - links) / 2;
            if (arr[mitte] == gesucht)
            {
                return mitte;
            }
            if (arr[mitte] > gesucht)
            {
                rechts = mitte - 1;
            } else
            {
                links = mitte + 1;
            }
        }
        return -(links + 1);
    }

}
