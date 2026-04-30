package aufgabefpa45;

import java.util.Scanner;

public class Main
{
    static void main()
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Bitte geben Sie eine Zahl ein:");
        int number = Integer.parseInt(input.nextLine());

        if (number != 0)
            System.out.println("Die angegebene Zahl ist nicht 0.");
        else
            System.out.println("Die angegebene Zahl ist 0.");

        if (number % 2 == 0)
            System.out.println("Die angegebene Zahl ist gerade.");
        else
            System.out.println("Die angegebene Zahl ist nicht gerade.");

        if (number < 0)
            System.out.println("Die angegebene Zahl ist negativ.");
        else
            System.out.println("Die angegebene Zahl ist positiv.");
    }
}
