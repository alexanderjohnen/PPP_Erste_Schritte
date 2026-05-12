package allgemein;

public class PrinterLX
{
        // static, damit wir kein Objekt z.B. Printer p = new Printer() benötigen, um sie zu nutzen
        public static void lnprint(Object x)
        {
            System.out.print("\n" + x); // Neue Zeile, dann Text
        }

        public static void tprint(Object x)
        {
            System.out.print("\n\t" + x); // Neue Zeile, dann Einzug (Tab), dann Text
        }

}
