package _unterricht10;

public class Computer
{
    private int arbeitsspeicher;
    private String besitzer;
    private String adresse;
    private static int count = 0;
    //private int modus = 0;

    //Getter
    public int getArbeitsspeicher()
    {
        return arbeitsspeicher;
    }

    public String getBesitzer()
    {
        return besitzer;
    }

    public String getAdresse()
    {
        return adresse;
    }

    public static int getCount()
    {
        return count;
    }

    //Setter
    public void setArbeitsspeicher(int arbeitsspeicher)
    {
        this.arbeitsspeicher=arbeitsspeicher;
    }

    public void setBesitzer(String besitzer)
    {
        this.besitzer = besitzer;
    }

    public void setAdresse(String adresse)
    {
        this.adresse = adresse;
    }

    public void setCount(int count)
    {
        this.count = count;
    }

    //Konstruktor
    public Computer(int arbeitsspeicher)
    {
        this(arbeitsspeicher,"KEINE ANGABE","KEINE ANGABE");
        //this.modus = 1;
    }

    public Computer(int arbeitsspeicher, String besitzer)
    {
        this(arbeitsspeicher,besitzer,"KEINE ANGABE");
        //this.modus = 2;
    }

    public Computer(int arbeitspeicher, String besitzer, String adresse)
    {
        //this.modus = 3;
        this.arbeitsspeicher = arbeitspeicher;
        this.besitzer = besitzer;
        this.adresse = adresse;
        count++;
    }

//    public void ausgabe()
//    {
//        if (modus == 1)
//        {
//            System.out.printf("Der Arbeitsspeicher beträgt %d.", arbeitsspeicher);
//        }
//        else if (modus == 2)
//        {
//            System.out.printf("Der Arbeitsspeicher beträgt %d und gehört %s.", arbeitsspeicher, besitzer);
//        }
//        else if (modus == 3)
//        {
//            System.out.printf("Der Arbeitsspeicher beträgt %d und gehört %s und wohnt in der %s.", arbeitsspeicher, besitzer, adresse);
//        }
//
//    }

    public void ausgabe()
    {
        if(besitzer.equals("KEINE ANGABE") && adresse.equals("KEINE ANGABE") )
        {
            System.out.printf("Der Arbeitsspeicher beträgt %d GB.\n", arbeitsspeicher);
        }
        else if(adresse.equals("KEINE ANGABE"))
        {
            System.out.printf("Der Arbeitsspeicher beträgt %d GB und gehört %s.\n", arbeitsspeicher, besitzer);
        }
        else
        {
            System.out.printf("Der Arbeitsspeicher beträgt %d GB und gehört %s und wohnt in der %s.\n", arbeitsspeicher, besitzer, adresse);
        }
    }

}
