package aufgabenallgemein;

import allgemein.PrinterLX;

public class Main
{
    static void main()
    {
        System.out.print("Hello");
        PrinterLX.lnprint("World");
        PrinterLX.lnprint("{");
        PrinterLX.tprint("Printer.lnprint(\"Hello\");");
        PrinterLX.tprint("Printer.lnprint(\"World\");");
        PrinterLX.lnprint("}");
    }
}
