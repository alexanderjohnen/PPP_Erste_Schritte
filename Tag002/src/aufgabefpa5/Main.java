package aufgabefpa5;

public class Main
{
    static void main()
    {
        double kapital = 100;
        int jahr = 1;
        int prozent = 3;

        System.out.printf("Startkapital beträgt %.2f Euro %n", kapital);

        kapital = kapital + kapital * prozent / 100;

        System.out.printf("Kapital nach %d Jahr(en) beträgt %.2f Euro %n", jahr, kapital);

        jahr++;

        kapital = kapital + kapital * prozent / 100;

        System.out.printf("Kapital nach %d Jahr(en) beträgt %.2f Euro %n", jahr, kapital);

//        usw. bis Jahr 5 :V

//        System.out.printf("Startkapital beträgt %.2f Euro %n", kapital);
//
//        kapital = kapital + kapital * prozent / 100;
//
//        while (jahr <= 5)
//        {
//            System.out.printf("Kapital nach %d Jahr(en) beträgt %.2f Euro %n", jahr, kapital);
//
//            kapital = kapital + kapital * prozent / 100;
//
//            jahr++;
//
//        }
    }
}
