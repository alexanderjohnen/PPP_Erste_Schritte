package aufgabefpa032;

import java.util.Scanner;

public class Main
{
    static void main()
    {
        Scanner input = new Scanner(System.in);

        int breiteRechteck = Integer.parseInt(input.nextLine());
        int hoeheRechteck = Integer.parseInt(input.nextLine());

        int flaecheRecheck = breiteRechteck * hoeheRechteck;

        System.out.println(flaecheRecheck);

    }
}
