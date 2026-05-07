package _unterricht5;

public class Schleifen
{
    static void main()
    {
        // Booleschge LOGIK - Auffrischung

        int a = 10;
        int b = 20;

        // Vergleichsoperatoren
        System.out.println("a < b  : " + (a<b));      // true
        System.out.println("a > b  : " + (a>b));      // false
        System.out.println("a == b  : " + (a==b));    // false
        System.out.println("a != b  : " + (a!=b));    // true
        System.out.println("a <= 10  : " + (a<=10));  // true

        // NOT Operator
        System.out.println("!(a > b): " + !(a>b));    // true

        // Logische Verknüpfung
        System.out.println(" (a < b) && (a==10):"+ ((a < b) && (a==10)));       // true
        System.out.println(" (a > b) && (a==10)"+ ((a > b) && (a==10)));        // false
        System.out.println(" (a > b) || (a==10)"+ ((a > b) || (a==10)));        // true


        // FOR-SCHLEIFE
        System.out.println();
        System.out.println("FOR-SCHLEIFE");

        // Einfache For-Schleife: Zahlen 0 bis 10 ausgeben

        for(int i = 0; i < 11;  i++){
            System.out.println(i + " ");
        }
        System.out.println();


        // Rückwärts Zählen
        System.out.println("Rückwärts Zählen");

        for(int i =10; i>0;i--){
            System.out.println(i + " ");
        }
        System.out.println();

        // In Zweierschritten zählen
        System.out.println("Zweierschritte :");

        for(int i = 0; i<=20; i+=2){
            System.out.println(i+ " ");
        }
        System.out.println();


        // SchleifenSTeuerung
        System.out.println("______BREAK______");
        // break: Schleife vorzeitig verlassen
        int gesuchteZahl = 30;

        for(int i =0; i < 1000; i++){
            System.out.println(i+" ");
            if(i==gesuchteZahl){
                System.out.println("Gefunden! Stopp!");
                break;
            }
        }

        System.out.println("_____CONTINUE_____");

        // Continue: Einzelnen Durchlauf Überspringen
        int uebersprungeneZahl= 5;
        for(int i =0 ; i<10; i++){
            if(i == uebersprungeneZahl){
                System.out.println("(" + i + " Übersprungen)");
                continue;
            }
            System.out.println("Verarbeite: " + i);
        }


        System.out.println("__________________");
        for(int i =0 ; i<10; i++){
            if(i %2 == 0){
                System.out.println("(" + i + " Übersprungen)");
                continue;
            }
            System.out.println("Verarbeite: " + i);
        }

        // WHILE -SCHLEIFE
        System.out.println("WHILE -SCHLEIFE");

        // While als einfacher zähler
        int zaehler= 0;
        while(zaehler < 5){
            System.out.println("Durchlauf : " + zaehler);
            zaehler++;                         // WICHTIG: ohne das -> Endlosschleife
        }

        // While mit inhaltlicher Bedingung : Halbieren bis unter 1
        System.out.println("HALBIEREN");
        double wert = 100.0;
        int schritte = 0;

        while(wert >=1.0 ){
            System.out.println("Schritt " + schritte +": " +wert );
            wert=wert/2;
            schritte++;
        }
        System.out.println("Nach "+schritte+ " Schritten unter 1.0.");

        // DO-WHILE-SCHLEIFE
        System.out.println("DO-WHILE-SCHLEIFE");
        // Einfache Do-While : Mindestens einmal ausführen
        int nummer = 10;
        do{
            System.out.println("Nummer ist : " +nummer);
            nummer++;
        }while(nummer < 5); // Bedingung ist sofort false

        System.out.println("Schleife beendet. Nummer ist jetzt: "+nummer);


        // Vergleich : WHILE mit gleicher Bedingung
        System.out.println("Vergleich WHILE");

        int nummer2 = 10;
        while(nummer2 <5){
            System.out.println("Das hier wird Nie ausgegeben!");
            nummer2++;
        }
        System.out.println("WHile-Schleife übersprungen . nummer2 ist : " +nummer2);


        // Praxisbeispiel : Menüsimulation
        System.out.println("Menüsimulation");
        int auswahl = 0;
        int durchlauf = 1;

        do{
            System.out.println("=== Menü (Durchlauf " +durchlauf+") ===");
            System.out.println("1 - Aktion A");
            System.out.println("2 - Aktion B");
            System.out.println("3 - Beenden");

            // Hier würde normalerweise eine Benutzereingabe stehen (Scanner)
            // Wir simulieren das mit einem festen Wert
            if(durchlauf<3){
                auswahl= 1;
                System.out.println("-> Aktion A ausgeführt");
            }else {
                auswahl=3 ;
                System.out.println("-> Programm wird beendet");
            }
            durchlauf++;
        }while(auswahl!=3);
    }

}
