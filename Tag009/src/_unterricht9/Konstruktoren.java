package _unterricht9;

public class Konstruktoren
{
    static void main()
    {
        Computer c1 = new Computer(16);

        System.out.println("Der Besitzer heisst: "+ c1.getBesitzer()+ " und hat " + c1.getArbeitsspeicher()+"GB RAM.");

        Computer c2 = new Computer(32,"Max Mustermann");
        // nur um Nachträglich Werte anzupassen Behalte wir unsere Getter und Setter Methoden in der Klasse Computer
        // c2.setBesitzer("Marv");
        // c2.setArbeitsspeicher(256);
        System.out.println("Der Besitzer heisst: "+ c2.getBesitzer()+ " und hat " + c2.getArbeitsspeicher()+"GB RAM.");

        System.out.println("Anzeige Anzahl Computer: " + Computer.getCount());

        Computer c3 = new Computer(64,"Max Mustermann","Musterstraße 123");

        System.out.println("Der Besitzer von meinem dritten Computer heißt " + c3.getBesitzer()+ ", hat insgesamt " + c3.getArbeitsspeicher()
                + " GB Arbeitsspeicher und wohnt in der " + c3.getAdresse()+ ".");

        System.out.println("___________________________________________");

        Computer c4 = new Computer(16);
        c4.ausgabe();       //KOnstruktor 1

        Computer c5 = new Computer(32,"Maria Musterfrau");
        c5.ausgabe();       //KOnstruktor 2

        Computer c6 = new Computer(64, "Max Mustermann", "Musterstraße 123");
        c6.ausgabe();       //KOnstruktor 3
    }
}
