package aufgabefpa082;

class Robot
{
    private int batterieLaufzeit;
    private String aufgabe;

    public int getBatterieLaufzeit()
    {
        return batterieLaufzeit;
    }

    public void setBatterieLaufzeit(int batterieLaufzeit)
    {
        this.batterieLaufzeit = batterieLaufzeit;
    }

    public String getAufgabe()
    {
        return aufgabe;
    }

    public void setAufgabe(String aufgabe)
    {
        this.aufgabe = aufgabe;
    }

    public boolean istBatterieLaufzeitNiedrig()
    {
        // if (batterieLaufzeit < 2)
        //     return true;
        // return false;
        // das ist das gleiche wie:
        return batterieLaufzeit < 2;
    }

    public void fuehreAufgabeAus()
    {
        if (!istBatterieLaufzeitNiedrig())
        {
            System.out.println(aufgabe);
            batterieLaufzeit--;
        }
        else
        {
            System.out.println("Ich muss aufgeladen werden.");
        }
    }
}

public class Main
{
    /* Level 2
     * Sie bauen einen Roboter. Erstellen Sie die Klasse Robot mit folgenden Membern:
     *  - Integer "batterieLaufzeit"
     *  - String "aufgabe"
     *  - Methode "istBatterieLaufzeitNiedrig"
     *      gibt true zurück, wenn die Laufzeit kleiner 2 ist, sonst false.
     *  - Methode "führeAufgabeAus"
     *      gibt auf dem Bildschirm den Text des Attributs "aufgabe" aus, wenn "istBatterieLaufzeitNiedrig" false liefert
     *          und reduziert dann die Batterielaufzeit um 1,
     *      sonst soll "Ich muss aufgeladen werden." in der Konsole erscheinen.
     *
     * Erstellen Sie in der Main einen Roboter mit der Aufgabe "Ich reiche Butter." und einer Batterielaufzeit von 5.
     * Lassen Sie ihn fünfmal in einer Schleife Butter reichen.
     */

    static void main(String[] args)
    {
        Robot robot1 = new Robot();

        robot1.setAufgabe("Ich reiche Butter.");
        robot1.setBatterieLaufzeit(5);

        for (int i = 0; i < 5; i++)
        {
            robot1.istBatterieLaufzeitNiedrig();
            robot1.fuehreAufgabeAus();
        }
    }
}
