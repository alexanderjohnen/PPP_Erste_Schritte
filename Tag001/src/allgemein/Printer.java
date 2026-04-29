package allgemein;

public class Printer
{
        // Die Methode ist static, damit wir kein Objekt von Printer bauen müssen
        // wäre sie nicht static, würden wir z.B. Printer = new Printer() benötigen, um sie zu nutzen
        public static void lnprint(Object x)
        {
            System.out.print("\n" + x); // Neue Zeile, dann Text
        }

        public static void tprint(Object x)
        {
            System.out.print("\n\t" + x); // Neue Zeile, dann Einzug (Tab), dann Text
        }

}
