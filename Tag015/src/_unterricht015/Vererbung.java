package _unterricht015;

import _unterricht015.fahrzeug.Fahrzeug;
import _unterricht015.fahrzeug.LKW;

public class Vererbung
{
    static void main()
    {

        Fahrzeug fahrzeug1 = new LKW("Volvo", "ABC", 110);

        fahrzeug1.starten();

        System.out.println(((LKW) fahrzeug1).getLadekapazitaet());

    }
}
