package aufgabe41;

import static allgmein4.ReadlineLX.parseIntLX;

public class Main
{
    static void main()
    {
        System.out.println("Bitte geben Sie Ihren Alter ein: ");

        int alter = parseIntLX();

        if (alter >= 18)
            System.out.println("In Deutschland gelten Sie als volljährig.");
        else
            System.out.println("in Deutschland gelten Sie noch nicht als volljährig");
    }
}
