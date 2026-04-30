package aufgabe42;

import static allgmein4.ReadlineLX.*;

public class Main
{
        static void main()
        {
            System.out.println("Wie viel kostet ein Ticket?");
            double price = parseDoubleLX();
            System.out.printf("Ein Ticket kostet %.2f Euro%n", price);

            System.out.println("Wie viele Personen gehören zu der Gruppe?");
            int group = parseIntLX();
            System.out.printf("Zur Gruppe gehören %d Personen%n", group);

            if (group > 4)
                price = price * 0.9;

            System.out.printf("Der Preis für %d Personen beträgt %.2f Euro%n", group, price);
        }
}
