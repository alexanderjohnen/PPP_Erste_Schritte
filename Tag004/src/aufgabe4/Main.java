package aufgabe4;

import java.util.Scanner;

import static allgmein4.ReadlineLX.*;

public class Main
{
    static void main()
    {
        System.out.println("Verzweigung (IF)");

        // Beispiel 1:
        boolean run = false;

        Scanner input = new Scanner(System.in);

        System.out.print("Tippen Sie bitte ein, ob wahr oder falsch: ");

        String answer = input.nextLine();

        // Wenn nach if, else oder else-if nur eine Code-Zeile steht, kann man die Klammern weglassen
        if (answer.equals("wahr"))
            run = true;
        else if (answer.equals("falsch"))
            run = false;
        else System.out.println("Bitte nur wahr oder falsch eingeben!");

        if (run)
            System.out.println("Wenn Bedingung == wahr, dann wird if-Teil ausgeführt");
        else
            System.out.println("Wenn Bedingung == falsch, dann wird der else-Teil ausgeführt");

        // Beispiel 2:
        int alter;

        System.out.print("Bitte geben Sie Ihren Alter ein: ");
        alter = parseIntLX();

        if (alter < 18)
            System.out.println("Du bist noch nicht alt genug!");
        else
            System.out.println("Du bist alt genug!");

        // Beispiel 3:
        System.out.println("Bitte geben Sie eine Zahl ein: ");
        int zahl = parseIntLX();
        System.out.println(zahl);
    }

}
