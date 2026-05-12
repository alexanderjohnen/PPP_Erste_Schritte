package aufgabefpa0113;

public class Main
{
    //  Erstelle zuerst einen Pseudocode und dann ein Java-Programm, das einen Getränkeautomaten simuliert.
    //  Anforderungen:
    //
    //  1) Klasse GetraenkeAutomat mit Methoden:
    //   - zeigeMenue(): zeigt ein Menü mit Getränken und Preisen.
    //	 - waehleGetraenk(int auswahl): verarbeitet die Auswahl mit switch-case und gibt den Preis aus.
    //
    //	2) Main-Klasse:
    //   - Erzeuge ein Objekt vom Typ GetraenkeAutomat.
    //   - Zeige das Menü und lese die Auswahl.
    //	 - Es werden nur sinnvolle Eingaben für die Auswahl angenommen, d.h. die Auswahl wird wiederholt
    //	 - Erlaube mehrere Bestellungen (Schleife), bis der Benutzer 0 eingibt.
    //	 - Berechne die Gesamtsumme.
    //
    //  Beispielausgabe (gekürzt):
    //
    //  Willkommen beim Getränkeautomaten!
    //
    //  Bitte wählen Sie (0 zum Beenden):
    //  1 - Wasser (1.00 Euro)
    //	2 - Cola (1.50 Euro)
    //	3 - Kaffee (2.00 Euro)
    //	4 - Tee (1.80 Euro)
    //
    //  Ihre Auswahl: 2
    //
    //  Sie haben Cola gewählt. Preis: 1.50 Euro
    //
    //  Zwischensumme: 1.50 Euro
    //  Gesamtsumme: 3.00 Euro

    static void main()
    {
        GetraenkeAutomat automat1 = new GetraenkeAutomat();
        automat1.waehleGetraenk();
    }
}
