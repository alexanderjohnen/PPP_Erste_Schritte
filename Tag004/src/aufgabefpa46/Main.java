package aufgabefpa46;

import java.util.Objects;
import java.util.Scanner;

import static allgmein4.ReadlineLX.*;

public class Main
{
    static void main()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Bitte geben Sie die erste Zahl ein: ");
        double number1 = parseDoubleLX();
        System.out.print("Bitte geben Sie die zweite Zahl ein: ");
        double number2 = parseDoubleLX();
        System.out.print("Bitte geben Sie einen Operator ein (+,-,*,/): ");
        String operator = input.nextLine();

        if (Objects.equals(operator,"+"))
            System.out.println("Das Ergebnis Ihrer Berechnung lautet " + (number1 + number2));
        else if (Objects.equals(operator,"-"))
            System.out.println("Das Ergebnis Ihrer Berechnung lautet " + (number1 - number2));
        else if (Objects.equals(operator,"*"))
            System.out.println("Das Ergebnis Ihrer Berechnung lautet " + (number1 * number2));
        else if (Objects.equals(operator,"/"))
        {
            if (number2 == 0)
            {
                System.out.println("Sie können nicht durch 0 teilen.");
            }
            else
            {
                System.out.println("Das Ergebnis Ihrer Berechnung lautet " + (number1 / number2));
            }
        }
        else
            System.out.println("Sie haben keinen gültigen Operator eingegeben.");
    }
}
