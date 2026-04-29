package aufgabefpa031;

import java.util.Scanner;

public class Main
{
    static void main()
    {
        int a = 1;

        System.out.println("Geben Sie bitte das " + a + ". Wort ein:");

        Scanner input = new Scanner(System.in);

        String word1 = input.nextLine();

        a++;

        System.out.println("Geben Sie bitte das " + a + ". Wort ein:");

        String word2 = input.nextLine();

        a++;

        System.out.println("Geben Sie bitte das " + a + ". Wort ein:");

        String word3 = input.nextLine();

        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);
    }
}
