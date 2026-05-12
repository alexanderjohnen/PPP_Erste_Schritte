package aufgabefpa0113;

import java.util.Scanner;

public class GetraenkeAutomat
{
    private final String[] nummer = {"1 - ","2 - ","3 - ","4 - "};
    private final String[] getraenk = {"Wasser ","Cola ","Kaffee ","Tee "};
    private final double[] preis = {1.00,1.50,2.00,1.80};

    public void zeigeMenue()
    {
        System.out.print("Bitte wählen Sie (0 zum Beenden):\n");
        // System.out.print(nummer[0] + getraenk[0] + preis[0] + " Euro \n");
        // System.out.print(nummer[1] + getraenk[1] + preis[1] + " Euro \n");
        // System.out.print(nummer[2] + getraenk[2] + preis[2] + " Euro \n");
        // System.out.print(nummer[3] + getraenk[3] + preis[3] + " Euro \n");

        for (int i = 0; i < getraenk.length; i++)
        {
            System.out.printf("%s%s%.2f Euro \n", nummer[i], getraenk[i], preis[i]);
        }
    }

    public void waehleGetraenk()
    {
        boolean a = false;
        double kosten = 0;

        System.out.println();
        System.out.println("Willkommen beim Getränkeautomaten!");
        System.out.println();

        Scanner scan = new Scanner(System.in);

        while(!a)
        {
            zeigeMenue();

            System.out.print("Eingabe: ");
            int auswahl = Integer.parseInt(scan.nextLine());

            switch(auswahl)
            {
                case 0:
                    a = true;
                    break;
                case 1:
                    System.out.println("Sie haben " + getraenk[0] + "gewählt.");
                    kosten += preis[0];
                    break;
                case 2:
                    System.out.println("Sie haben " + getraenk[1] + "gewählt.");
                    kosten += preis[1];
                    break;
                case 3:
                    System.out.println("Sie haben " + getraenk[2] + "gewählt.");
                    kosten += preis[2];
                    break;
                case 4:
                    System.out.println("Sie haben " + getraenk[3] + "gewählt.");
                    kosten += preis[3];
                    break;
                default:
                    System.out.println("Keine gültige Auswahl.\nBitte wählen Sie erneut:");
            }
        }

        System.out.printf("Gesamtkosten: %.2f Euro", kosten);
    }
}
