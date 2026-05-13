package lx.util;

import java.util.Scanner;

public class ScanlineLX
{
    private static final Scanner scan = new Scanner(System.in);

    public static boolean parseBooleanLX()
    {
        String input = scan.nextLine().toLowerCase();
        return input.equals("ja") || input.equals("true") || input.equals("y") || input.equals("yes");
    }

    public static String booleanToTextLX(boolean wert) {
        if (wert)
        {
            return "Ja";
        }
        else
        {
            return "Nein";
        }
    }

    public static String scanLX()
    {
        return scan.nextLine();
    }

    public static String scanLX(String prompt)
    {
        System.out.print(prompt);
        return scan.nextLine();
    }

    public static int parseIntLX()
    {
        return Integer.parseInt(scan.nextLine());
    }

    //Erwartet eine Aufforderung zur Eingabe für den Benutzer, z.B. "Eingabe: "
    public static int parseIntLX(String prompt)
    {
        System.out.print(prompt);
        return parseIntLX();
    }

    public static double parseDoubleLX()
    {
      //String s =scan.nextLine();
      //String r = s.replace(",",".");
      //return Double.parseDouble(r);
        return Double.parseDouble(scan.nextLine().replace(",","."));
    }

    public static double parseDoubleLX(String prompt)
    {
        System.out.print(prompt);
        return parseDoubleLX();
    }
}
