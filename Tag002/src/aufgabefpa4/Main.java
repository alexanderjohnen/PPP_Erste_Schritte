package aufgabefpa4;

public class Main
{
    static void main()
    {
        double kantenlaengeKubus = 3.75;
        double oberflaeche = kantenlaengeKubus * kantenlaengeKubus * 6;
        double volumen = kantenlaengeKubus * kantenlaengeKubus * kantenlaengeKubus;

        System.out.println("********************************************");
        System.out.println("*      Ergebnisse für Kantenlänge " + kantenlaengeKubus +"     *");
        System.out.println("********************************************");
        System.out.println();
        System.out.printf("Oberfläche: %.2f%n", oberflaeche);
        System.out.printf("volumen: %.2f%n", volumen);
    }
}
