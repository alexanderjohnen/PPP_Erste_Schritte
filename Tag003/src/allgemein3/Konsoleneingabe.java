package allgemein3;

import java.util.Scanner;

public class Konsoleneingabe
{
    static void main()
    {
        // Wiederholung: Bisher haben wir gelernt, wie wir ein Output über die Konsole ausgeben -> Konsolenausgaben
        System.out.println("Tippe bitte deinen Namen in die folgende Zeile ein:");

        // Erweiterung: Heute lernen wir, wie wir ein eigenes Input in die Konsole eingeben -> Benutzereingaben
        // Dazu benutzen wir die 'Scanner' Klasse, die sich im Package 'jave.util' befindet
        Scanner konsolenEingabe = new Scanner(System.in);
        String name = konsolenEingabe.nextLine();
        System.out.printf("Du heißt %s.%n", name);

        // Wenn wir eine (ganze) Zahl eingeben wollen, wandeln wir die Eingabe in einen Integer um
        System.out.println("Tippe bitte als nächstes dein Alter in die folgende Zeile ein:");
        name = konsolenEingabe.nextLine();
        int alter = Integer.parseInt(name);
        System.out.printf("Du bist %d Jahre alt.%n", alter);

        // Wenn wir eine Kommazahl eingeben wollen, wandeln wir die Eingabe in ein Double um
        // Wenn wir wollen, dass wir auch ein Komma statt einen Punkt eingeben können, nutzen wir die replace Methode
        System.out.println("Tippe bitte als nächstes deine Körpergröße in die folgende Zeile ein:");
        name = konsolenEingabe.nextLine();
        String ersetzen = name.replace(",",".");
        double groesse = Double.parseDouble(ersetzen);
        System.out.printf("Du bist angeblich %.2f groß.", groesse);
    }
}
