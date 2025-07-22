package ru.java.education.dz2.televisor;

public class App {
    public static void main(String[] args)
    {
        Televisor tv1 = new Televisor("LG");
        ShowState(tv1);

        Televisor tv2 = new Televisor("BBK");
        ShowState(tv2);

        tv1.SelectChannel(7);

        System.out.println("Телевизор " + tv1.GetTVName() + " переключен на канал 7. Результат: " + tv1.GetCurrentChannel() + " канал.");

        if(!tv1.IsTurnedOn())
        {
            System.out.println("А телевизор то выключен!");
            tv1.TurnOn();
            ShowState(tv1);
        }
        tv1.SelectChannel(2);

        System.out.println("Телевизор " + tv1.GetTVName() + " переключен на канал 2. Результат: " + tv1.GetCurrentChannel() + " канал.");

        tv1.TurnOff();
        ShowState(tv1);
    }
    private static void ShowState(Televisor t)
    {
        if(t.IsTurnedOn())
        {
            System.out.println("Телевизор " + t.GetTVName() + " включен!");
        }
        else {
            System.out.println("Телевизор " + t.GetTVName() + " выключен.");
        }
    }
}