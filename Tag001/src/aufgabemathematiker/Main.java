package aufgabemathematiker;

import allgemein.PrinterLX;

public class Main
{
    static void main()
    {
        int a = 10;
        int b = 5;

        int ergebnis = a + b;

        PrinterLX.lnprint(ergebnis);

        ergebnis = a - b;

        PrinterLX.lnprint(ergebnis);

        ergebnis = a * b;

        PrinterLX.lnprint(ergebnis);

        ergebnis = a / b;

        PrinterLX.lnprint(ergebnis);
    }
}
