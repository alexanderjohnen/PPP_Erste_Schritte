package aufgabefpa0121;

public class Main
{
    /*
    Erzeugen Sie einen String mit einem beliebigen (netten) Text.
    Geben Sie diesen Text mithilfe einer foreach-Schleife zeichenweise
    aus.

    SOLLTEN Sie auf Probleme stoßen ...

    Nutzen Sie den "." an ihrem String und suchen Sie nach einer
    geeigneten Methode.
    */

    static void main()
    {
        String netterText = new String("Dies ist ein netter Text.");

        for (char charImArray : netterText.toCharArray())
        {
            System.out.println(charImArray);
        }

    }
}
