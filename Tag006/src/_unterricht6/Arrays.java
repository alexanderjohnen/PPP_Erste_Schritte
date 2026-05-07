package _unterricht6;

public class Arrays
{
    static void main()
    {
        System.out.println("ARRAYS ALLGEMEIN");

        // Array Range 0 bis 9 = 10
        int[] intArray = new int[10];

        intArray[0]= 22;
        intArray[1]= 10;
        intArray[2]= 12;
        intArray[3]= 44;
        intArray[4]= 33;
        intArray[5]= 99;
        intArray[6]= 66;
        intArray[7]= 55;
        intArray[8]= 34;
        intArray[9]= 22;
        // intArray[10]=45;  // Programmabsturz! ArrayIndexOutOfBoundsExecption


        // Sofortige Initialisierung:
        // Sind die Werte des Arrays schon vorher bekannt können wir diese direkt bei der erstellung initialisieren.
        int[] intArray2 = new int[]{1,2,3,4,5};
        int[] intArray3 = {11,222,3333,44444,555555}; // das new int[] kann weggelassen werden.

        // Array mit Forschleife auslesen
        System.out.println("Kontrollausgabe des Arrays 'intArray' ");

        for(int i =0 ; i < intArray.length ; i++){
            System.out.print(intArray[i]+ " ");
        }
        System.out.println();

        // Das Array ohne Schleife ausgeben:
        // Für die Schnelle und einfache ausgaben von Arrays  können wir Arrays.tostring() benutzen;
        System.out.println(java.util.Arrays.toString(intArray3));


        // Das ganze natürlich auch für andere Datentypen
        double[] dArray = {3.5,1.1,2.3};
        System.out.println("Kontrollausgabe des Double-Arrays:");
        System.out.println(java.util.Arrays.toString(dArray));
        for(int i = 0; i < dArray.length; i ++){
            System.out.print(dArray[i] + " ");
        }
        System.out.println();

        // Und einmal mit String :)
        String[] sArray = {"Java","ist toll", ":)"};
        System.out.println("Kontrollausgabe");
        System.out.println(java.util.Arrays.toString(sArray));


        // String-Arrays können auch über String.join zu einer Zeichenkette zusammengefügt werden.
        System.out.println(String.join(" ", sArray));
        System.out.println();


        System.out.println("Array mit SCHLEIFEN BEFÜLLEN");

        int[] zahlen = new int[20];
        // Array mit Schleife befüllen: Jede Position bekommt den WERT i*2
        for(int i = 0 ; i< zahlen.length; i++){
            zahlen[i] = i*2;
        }
        System.out.println(java.util.Arrays.toString(zahlen));


        System.out.println("FOR-EACH-SCHLEIFE");
        String[] sprachen = { "Java" ,"Python", "C#", "JavaScript","Kotlin"};

        // Erweiterte For-Schleife (for-each): Geht automatisch alle Elemente durch

        for(String wort : sprachen){
            System.out.println("Sprache: "+ wort );
        }
    }
}
