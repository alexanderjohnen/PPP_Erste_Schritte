package aufgabemathematiker;

import allgemein.Printer;

public class Main
{
    static void main()
    {
        int a = 10;
        int b = 5;

        int ergebnis = a + b;

        Printer.lnprint(ergebnis);

        ergebnis = a - b;

        Printer.lnprint(ergebnis);

        ergebnis = a * b;

        Printer.lnprint(ergebnis);

        ergebnis = a / b;

        Printer.lnprint(ergebnis);
    }
}
