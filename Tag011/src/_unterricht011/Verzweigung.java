package _unterricht011;

import java.util.Scanner;

public class Verzweigung
{
    static void main()
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Mehrfachverzweigung (Switch-Case)");

        System.out.println("Geben Sie bitte die 0, die 1, die 2 oder die 3 ein: ");

        int auswahl = Integer.parseInt(scan.nextLine());

        switch (auswahl)
        {
            case 0:
                System.out.println("Es wurde die 0 eingegeben.");
                break;
            case 1:
                System.out.println("Es wurde die 1 eingegeben.");
                break;
            case 2:
                System.out.println("Es wurde die 2 eingegeben.");
                break;
            case 3:
                System.out.println("Es wurde die 3 eingegeben.");
                break;
            default:
                System.out.println("Es wurde weder 0 noch 1 noch 2 noch 3 eingegeben.");
        }

        System.out.println("Geben Sie bitte grün, rot, gelb oder blau");

        String auswahl2 = scan.nextLine();

        switch (auswahl2.toUpperCase())
        {
            case "GRÜN":
            case "ROT":
                System.out.println("Es wurde grün oder rot eingegeben.");
                break;
            case "GELB","BLAU":
                System.out.println("Es wurde die gelb oder blau eingegeben.");
                break;
            default:
                System.out.println("Es wurde weder 0 noch 1 noch 2 noch 3 eingegeben.");
        }

        String a = new String("Hallo");
        String b = new String("Hallo");
        // String var = "Hallo" ist nicht das gleiche wie String var = new String("Hallo")
        // Objekte werden explizit mit new erzeugt
        // bei String var = "Hallo" wird String wie ein primitiver Datentyp behandelt

        System.out.println(a == b); // == vergleicht die Speicheradresse der Objekte
        System.out.println(a.equals(b)); // equals vergleicht den Inhalt der Objekte;

        int x = 5;
        int y = 5;

        System.out.println(x == y); // true weil primitiver Datentyp
    }
}
