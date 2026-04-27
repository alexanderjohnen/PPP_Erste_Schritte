public class Printer
{
        // Die Methode ist static, damit wir kein Objekt von Printer bauen müssen
        public static void lnprint(String x)
        {
            System.out.print("\n" + x); // Neue Zeile, dann Text
        }

        public static void tprint(String x)
        {
            System.out.print("\n\t" + x); // Neue Zeile, dann Einzug (Tab), dann Text
        }
}
