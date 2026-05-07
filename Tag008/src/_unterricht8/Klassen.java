package _unterricht8;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

class Person
{
    private LocalDate geburtsdatum;
    private String name;

    public LocalDate getGeburtsdatum()
    {
        return geburtsdatum;
    }

    public void setGeburtsdatum(LocalDate geburtsdatum)
    {
        this.geburtsdatum = geburtsdatum;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAlter()
    {
        return Period.between(geburtsdatum, LocalDate.now()).getYears();
    }

    public boolean istVolljaehrig()
    {
        return getAlter()>=18;
    }

    public void ausgabe()
    {
        System. out.printf("Name: %s, Geburtsdatum: %s, Alter: %d, Volljährig: %s \n",
                name, geburtsdatum, getAlter() , istVolljaehrig());
    }
}

public class Klassen
{
    static void main(String[] args)
    {
        Person p1 = new Person();

        p1.setGeburtsdatum(LocalDate.of(1990,4,12));
        p1.setName("Alfons");

        System.out.println("Unser guter Freund " + p1.getName() + " ist inzwischen " + p1.getAlter() + " Jahre alt");
        System.out.println(p1.istVolljaehrig());

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println(p1.getGeburtsdatum().format(df));

        Person p2 = new Person();
        Person p3 = new Person();

        p2.setGeburtsdatum(LocalDate.of(1991,9,8));
        p3.setGeburtsdatum(LocalDate.of(1992,10,9));

        p2.setName("Dieter");
        p3.setName("Rüdiger");

        p2.ausgabe();
        p3.ausgabe();

        Person[] personen = {p1,p2};

        for (int i = 0; i < personen.length; i++)
        {
            personen[i].ausgabe();
        }
    }
}
