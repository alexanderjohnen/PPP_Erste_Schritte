package aufgabefpa033;

import java.util.Scanner;

public class Main
{
    static void main()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Geben Sie bitte den Tag ein: ");
        int day = Integer.parseInt(input.nextLine());

        System.out.print("Geben Sie bitte den Monat ein: ");
        int month = Integer.parseInt(input.nextLine());

        System.out.print("Geben Sie bitte das Jahr ein: ");
        int year = Integer.parseInt(input.nextLine());

        System.out.printf("\t Deutsche Datumsdarstellung: ......... %02d.%02d.%04d\n", day, month, year);
        System.out.printf("\t Amerikanische Datumsdarstellung: .... %04d-%02d-%02d", year, month, day);
    }
}
