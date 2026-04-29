package aufgabefpa032;

import java.util.Scanner;

public class Main
{
    static void main()
    {
        Scanner eingabe = new Scanner(System.in);

        int breiteRechteck = Integer.parseInt(eingabe.nextLine());
        int hoeheRechteck = Integer.parseInt(eingabe.nextLine());

        int flaecheRecheck = breiteRechteck * hoeheRechteck;

        System.out.println(flaecheRecheck);

    }
}
