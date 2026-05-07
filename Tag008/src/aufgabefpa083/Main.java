package aufgabefpa083;

class Produkt
{
    private String name;
    private int mindestpreis;
    private int verkaufspreis;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setMindestpreis(int mindestpreis)
    {
        this.mindestpreis = mindestpreis;
    }

    public int getVerkaufspreis()
    {
        return verkaufspreis;
    }

    public void setVerkaufspreis(int verkaufspreis)
    {
        if (verkaufspreis >= mindestpreis)
            this.verkaufspreis = verkaufspreis;
        else
            this.verkaufspreis = mindestpreis;
    }
}

public class Main
{

//    Level 1
// Schreiben Sie bitte ein Java-Programm, in dem ...
// - eine Klasse 'Produkt' definiert wird
//   + Klassenmember sind:
//     - name (String, private)
//        + normaler Getter und Setter
//     - mindestpreis (Integer, private)
//        + kein Getter, normaler Setter
//     - verkaufspreis (Integer, private)
//        + normaler Getter; Setter: nur FALLS value>=mindestpreis SONST verkaufspreis=mindestpreis
// - im Main alle obigen Features getestet werden

    static void main(String[] args)
    {
        int preis = 0;
        Produkt kubusKuerbis = new Produkt();

        kubusKuerbis.setName("Kubuskürbis");
        System.out.println(kubusKuerbis.getName());
        kubusKuerbis.setMindestpreis(10);
        kubusKuerbis.setVerkaufspreis(1);

        while (kubusKuerbis.getVerkaufspreis() < 11)
        {
            preis++;
            kubusKuerbis.setVerkaufspreis(preis);
            System.out.printf("Der berühmte %s kostet heute %d Euro. \n", kubusKuerbis.getName(), kubusKuerbis.getVerkaufspreis());
        }
    }
}
