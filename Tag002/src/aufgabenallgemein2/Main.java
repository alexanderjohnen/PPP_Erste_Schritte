package aufgabenallgemein2;

public class Main
{
    static int ip;

    static void main()
    {
        double pi = 3.1415926535897932384626433832795;

        System.out.printf("Ausgabe pi: %4f%n", pi);
        System.out.printf("Ausgabe pi: %.25f\n", pi);
        System.out.println("Ausgabe Pi:" + pi);

        System.out.println(ip);

        int a = 1;

        System.out.println(a=a+1); // ist gleich ++a, a wird um eins erhöht und direkt der erhöhte a-Wert ausgegeben;
        System.out.println(++a); //
    }
}
