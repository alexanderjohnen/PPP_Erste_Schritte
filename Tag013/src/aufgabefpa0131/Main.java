package aufgabefpa0131;

import static lxutil.LxScanner.*;

public class Main
{
    static void main()
    {
        String input = LxScan();

        String[] splitted = input.split(" ");

        int i = 1;

//        while (i < splitted.length)
//        {
//            System.out.println(splitted[i]);
//            i++;
//        }

        while (i < splitted.length)
        {
            String star = "*";
            splitted[i] = star.repeat(splitted[i].length());
            i += 2;
        }

        int l = 0;

        while (l < splitted.length)
        {
            System.out.print(splitted[l] + " ");
            l++;
        }
    }
}
