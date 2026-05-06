package aufgabefpa062;

public class Main
{
    /* Level 1

AUFGABE: Bibliotheksverwaltung
ZIEL:
Erstellen Sie ein Programm zur Verwaltung Ihrer Büchersammlung.
Jedes Regal in der Bibliothek enthält eine Liste von Büchern.
In dieser Aufgabe sollen Sie ein Array verwenden, um die Titel der Bücher in einem Regal zu speichern und auszugeben.

ANFORDERUNGEN:
Erstellen Sie ein Java-Programm, das ein Array vom Typ String verwendet, um die Buchtitel in einem Regal zu speichern.
Definieren Sie ein Array regal mit einer festen Größe von 5, um die Buchtitel zu speichern.
Fügen Sie dem Array 5 Buchtitel hinzu.
Jeder Buchtitel sollte ein String sein.
Verwenden Sie eine for-Schleife, um alle Buchtitel im Regal auszugeben.
Nutzen Sie die length-Eigenschaft des Arrays für die Schleifenbedingung.

*/
    static void main(String[] args)
    {
        String[] regal = new String[5];

        regal[0] = "Herr der Ringe";
        regal[1] = "Herr der Fliegen";
        regal[2] = "Herr der Diebe";
        regal[3] = "Herr der Welt";
        regal[4] = "Star Wars";

        for (int i = 0; i < regal.length; i++)
        {
            System.out.println(regal[i]);
            }
    }
}
