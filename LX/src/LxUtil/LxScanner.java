package LxUtil;

import java.util.Scanner;

public class LxScanner
{
    private static final Scanner scan = new Scanner(System.in);

    public static boolean LxParseBoolean()
    {
        String input = scan.nextLine().toLowerCase();
        return input.equals("ja") || input.equals("true") || input.equals("y") || input.equals("yes");
    }

    public static String LxBooleanToText(boolean wert) {
        if (wert)
        {
            return "Ja";
        }
        else
        {
            return "Nein";
        }
    }

    public static String LxScan()
    {
        return scan.nextLine();
    }

    public static String LxScan(String prompt)
    {
        System.out.print(prompt);
        return scan.nextLine();
    }

    public static int LxParseInt()
    {
        return Integer.parseInt(scan.nextLine());
    }

    //Erwartet eine Aufforderung zur Eingabe für den Benutzer, z.B. "Eingabe: "
    public static int LxParseInt(String prompt)
    {
        System.out.print(prompt);
        return LxParseInt();
    }

    public static double LxParseDouble()
    {
      //String s =scan.nextLine();
      //String r = s.replace(",",".");
      //return Double.parseDouble(r);
        return Double.parseDouble(scan.nextLine().replace(",","."));
    }

    public static double LxParseDouble(String prompt)
    {
        System.out.print(prompt);
        return LxParseDouble();
    }
}
