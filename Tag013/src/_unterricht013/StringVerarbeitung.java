package _unterricht013;

public class StringVerarbeitung
{
    public static void main(String[] args)
    {
        // Beispiel an einem CSS Snippet
        String configs = """
               background-color: #333;   
               color: white;
                    text-align: center;
               padding: 10px;
               position: fixed;
               bottom: 0;
                """;

        System.out.println(configs);

        // Um jeden Teil der CSS-Einstellungen einzeln verarbeiten zu können,
        // kann am Zeilenumbruch gesplittet werden.

        String[] gesplittet = configs.split("\n");
        for(int i = 0 ; i< gesplittet.length; i++)
        {
            gesplittet[i] = gesplittet[i].strip();     // .trim() wäre auch möglich ältere Variante
            System.out.println(gesplittet[i]);
        }

        System.out.println();
        System.out.println("Erster Buchstabe: " +gesplittet[0].charAt(0));  // Für Validierungen oder Überprüfungen


        // Mit IndexOf finden wir den Doppelpunkt, an dem die Beschriftung
        // vom eignetlichen Wert getrennt ist.
        int index = gesplittet[0].indexOf(":");
        System.out.println("Der Index von unserem : : ist " + index);

        String substring = gesplittet[0].substring(index+1);
        System.out.println("Substring: " +substring);

        // Aufgabe jeder element von gesplittet den Hinteren teil nach : ausgeben
        for (int i = 0; i < gesplittet.length; i++)
        {
            int idx = gesplittet[i].indexOf(":");
            if (idx != -1)
            {
                String wert = gesplittet[i].substring(idx + 1).strip();
                System.out.println(wert);
            }
        }
        // ChartAT und length
        for(int i = 0; i< gesplittet.length;i++){
            char letztes = gesplittet[i].charAt(gesplittet[i].length() -1);
            System.out.println("Zeile: " +i + " Letztes Zeichen: " + letztes);
        }
        System.out.println("Uppercase: "+ gesplittet[0].toUpperCase());

        // Mit Replace können Werte in den CSS Einstellungen geändert werden.
        gesplittet[1] = gesplittet[1].replace("white","black");
        System.out.println("Replace methode ausführen "+ gesplittet[1]);
        System.out.println();

        // Mit Contains können wir schauen, ob eine bestimmte Einstellung
        // in dem CSS vorhanden ist.
        System.out.println("Contains:  " +configs.contains("position"));
        System.out.println();

    }
}
