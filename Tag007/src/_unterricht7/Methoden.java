package _unterricht7;

import java.util.Random;

public class Methoden
{

    public static void main(String[] args) {

        // Beispiel zu statischen Methoden, die wir schon kennen:
        Integer.parseInt("1");
        grueßen();


        // Beispiel zu nicht statischen (Instanzen-) Methoden, die wir schon kennen;
        System.out.println();
        Random rand = new Random();
        //  Objekt.Methode();
        rand.nextInt();
        System.out.println(rand.nextInt());

        addieren(3,5);
        //   System.out.println(addieren(3,5));

        int ergebnis = addieren(10,5);
        System.out.println("Ergebnis ist: " + ergebnis);

        ergebnis= addieren(22,5,6);
        System.out.println(ergebnis);

        Methoden objektReferenz = new Methoden();
        ergebnis = objektReferenz.multiplizieren(10,5);
        System.out.println("Ergebnis der Multiplikation: " + ergebnis);

        objektReferenz.verarbeiteZahl(5);
        objektReferenz.verarbeiteZahl(-5);
    }

    static void grueßen()                           // Optionaler Modifizierer + Rückgabetype + Name + (Parameterlister)
    {                                               // {   }   Das ist der MethodenKörper
        System.out.println("Hallo, Welt!!!!!");
    }

    static int addieren(int a, int b){
        // int summe= a+b;                   // Beides Möglich nur return beider parameter oder zwischenspeichern
        //  return summe;
        return a+b;
    }
    static int addieren(int a, int b, int c){

        return a+b+c;
    }

    int multiplizieren(int a, int b){
        int produkt = a*b;
        return produkt;
    }

    void verarbeiteZahl(int zahl){
        System.out.println("Verarbeite Zahl: " + zahl);
        if(zahl < 0){
            System.out.println("Die Zahl ist negativ. Beende die Methode.");
            return;
        }
        System.out.println("Die Zahl ist positiv oder 0 . Weiterverarbeiten");

    }


    // MethodenÜberladung Name GLEICH Parameter unterscheiden sich aber.
    void ausgabe(int zahl){
        System.out.println("Ich gebe die Zahl "+ zahl + " aus.");
    }

    void ausgabe(String text){
        System.out.println("Ich gebe den Text "+ text + " aus.");
    }

    void ausgabe(int zahl, String text){
        System.out.println("Ich gebe die Zahl "+ zahl +" und" + text + " aus.");
    }

    void ausgabe(int zahl, int zahl2){
        System.out.println("Ich gebe die Zahl "+ zahl +" und" +zahl2+ " aus.");
    }

}


