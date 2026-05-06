package aufgabefpa061;

import allgmein4.ReadlineLX;

import static allgmein4.ReadlineLX.*;

public class Main
{
    /* Level 1
     * Sie möchten Ihre Musiksammlung verwalten.
     * Erstellen Sie ein Array "Album" vom Typ String mit der Größe 5 (Es ist ein kleines Album).
     * Geben Sie 5 Songtitel per Konsole ein und speichern Sie diese im Array.
     * In einer For-Schleife sollen dann alle Songs des Albums ausgegeben werden.
     * Verwenden Sie Length-Eigenschaft des Arrays für die Schleifenbedingung.
     */

    static void main(String[] args)
    {
        String[] album = new String[5];

        album[0] = inputLX();
        album[1] = inputLX();
        album[2] = inputLX();
        album[3] = inputLX();
        album[4] = inputLX();

        for (int i = 0; i < album.length; i++)
        {
            System.out.println(album[i]);
        }
    }
}
