package allgmein4;

import java.util.Scanner;

public class ReadlineLX
{
    private static final Scanner scan = new Scanner(System.in);

    public static String scanLX()
    {
      return scan.nextLine();
    }

    public static int parseIntLX()
    {
        return Integer.parseInt(scan.nextLine());
    }

    public static double parseDoubleLX()
    {
//      String s =scan.nextLine();
//      String r = s.replace(",",".");
//      return Double.parseDouble(r);
        return Double.parseDouble(scan.nextLine().replace(",","."));
    }
}
