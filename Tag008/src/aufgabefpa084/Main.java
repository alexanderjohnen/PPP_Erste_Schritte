package aufgabefpa084;

class TemperatureRecord
{
    private String day;
    private double temperature;
    private String unit;

    public String getDay()
    {
        return day;
    }

    public void setDay(String day)
    {
        this.day = day;
    }

    public double getTemperature()
    {
        return temperature;
    }

    public void setTemperature(double temperature)
    {
        this.temperature = temperature;
    }

    public String getUnit()
    {
        return unit;
    }

    public void setUnit(String unit)
    {
        this.unit = unit;
    }

    public static void findMinAndMaxTemperatur(TemperatureRecord[] records)
    {
        TemperatureRecord min = records[0];
        TemperatureRecord max = records[0];

//        for (int i = 0; i < records.length; i++)
//        {
//            TemperatureRecord temp = records[i];
//
//            if (temp.getTemperature() <= min.getTemperature())
//            {
//                min = temp;
//            }
//
//            if (temp.getTemperature() >= max.getTemperature())
//            {
//                max = temp;
//            }

            for (int i = 1; i < records.length; i++)
            {
                if(records[i].getTemperature() < min.getTemperature())
                {
                    min = records[i];
                }

                if(records[i].getTemperature() > max.getTemperature())
                {
                    max = records[i];
                }
            }

        System.out.println(min.getTemperature() + "\n" + max.getTemperature());
    }
}

public class Main
{

// Level 2
//
// Sie sollen ein Programm schreiben, das die Temperaturen einer Woche aufzeichnet und analysiert.
// Jede Temperatur wird als Objekt der Klasse TemperatureRecord gespeichert.
//
// Anforderungen:
//
//    Klasse TemperatureRecord:
//        Erstellen Sie eine Klasse TemperatureRecord mit den folgenden Attributen:
//            String day: Der Tag der Woche (z.B. "Montag", "Dienstag", etc.).
//            double temperature: Die aufgezeichnete Temperatur für diesen Tag.
//            String unit: Die Maßeinheit, z.B. Celsius, Kelvin oder Fahrenheit.
//        Beim Erzeugen der Objekte werden die Werte über die Setter festgelegt.
//
//    Temperaturarray:
//        Erstellen Sie ein eindimensionales Array TemperatureRecord[] mit einer Größe von 7,
//        um die Temperaturen für eine Woche zu speichern.
//
//    Initialisierung:
//        Füllen Sie das Array mit Temperaturdaten für jeden Tag der Woche. Sie können dabei fiktive Werte verwenden.
//
//    Min/Max-Suche:
//        Implementieren Sie eine Methode findMinAndMaxTemperature(TemperatureRecord[] records),
//        die die minimale und maximale Temperatur der Woche findet und die entsprechenden Tage ausgibt.
//
// Erwartete Ausgabe (Beispiel):
// Die niedrigste Temperatur war am Donnerstag mit 15.5 Grad Celsius.
// Die höchste Temperatur war am Montag mit 28.3 Grad Celsius.

    static void main()
    {
        TemperatureRecord[] records = new TemperatureRecord[7];

        String[] days = {"Montag","Dienstag", "Mittwoch","Donnerstag", "Freitag", "Samstag","Sonntag"};
        double[] temperature = {28.3,27.4,13,15,11.4,32.7,35};

        for(int i = 0 ; i < records. length; i++)
        {
            records[i] = new TemperatureRecord();
            records[i].setDay(days[i]);
            records[i].setTemperature(temperature[i]);
            records[i].setUnit("Celsius");
        }

        TemperatureRecord.findMinAndMaxTemperatur(records);
    }
}
