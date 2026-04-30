package allgmein4;

import java.util.Scanner;

public class ReadlineLX
{
    private static final Scanner input = new Scanner(System.in);

    public static int parseIntLX()
    {
        return Integer.parseInt(input.nextLine());
    }

    public static double parseDoubleLX()
    {
//      String s = input.nextLine();
//      String r = s.replace(",",".");
//      return Double.parseDouble(r);
        return Double.parseDouble(input.nextLine().replace(",","."));
    }
}
