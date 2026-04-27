import java.sql.SQLOutput;

public class Main
{
    static void main()
    {
        System.out.print("Hello");
        Printer.lnprint("World");
        Printer.lnprint("{");
        Printer.tprint("Printer.lnprint(\"Hello\");");
        Printer.tprint("Printer.lnprint(\"World\");");
        Printer.lnprint("}");
    }
}
