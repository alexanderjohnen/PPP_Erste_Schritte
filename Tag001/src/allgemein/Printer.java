package allgemein;

public class Printer
{
        // Die Methode ist static, damit wir kein Objekt von Printer bauen müssen
        public static void lnprint(Object x)
        {
            System.out.print("\n" + x); // Neue Zeile, dann Text
        }

        public static void tprint(Object x)
        {
            System.out.print("\n\t" + x); // Neue Zeile, dann Einzug (Tab), dann Text
        }

}
