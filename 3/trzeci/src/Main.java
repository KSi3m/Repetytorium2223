

public class Main {

    public static void main(String[] args) {
        System.out.println("");

        //zad1
        System.out.println("************************************\nZadanie 1");
        Punkt p10 = new Punkt(0,0);
        Punkt p11 = new Punkt(3,0);
        Punkt p12 = new Punkt(3,4);
        System.out.println(p10);

        Odcinek o10 = new Odcinek(p10,p11);
        Odcinek o11 = new Odcinek(p11,p12);
        Odcinek o12 = new Odcinek(p10,p12);

        System.out.println(o10);

        Trojkat t10 = new Trojkat(o10,o11,o12);
        System.out.println(t10);

        //zad2
        System.out.println("************************************\nZadanie 2");
        stringTimeTest(100000);

        //zad3
        System.out.println("************************************\nZadanie 3");
        SzyfrCezara s1 = new SzyfrCezara("ABCDEFGHIJKLMNOPQRSTUVWXYZ",10);
        SzyfrCezara s2 = new SzyfrCezara("ABCDEFGHIJKLMNOPQRSTUVWXYZ",10);
        /*System.out.println(s1.szyfruj("Co wolno Adminowi, to nie Uzytkownikowi"));
        System.out.println(s1.deszyfruj("MY GYVXY KNWSXYGS, DY XSO EJIDUYGXSUYGS"));
        System.out.println("");

        System.out.println(s2.szyfruj("Co wolno Adminowi, to nie Uzytkownikowi"));
        System.out.println(s2.deszyfruj("SE MEBDE QTCYDEMY, JE DYU KPOJAEMDYAEMY"));*/


        Deszyfrator d = new Deszyfrator();


        String test1 = s1.szyfruj("Behind sooner dining so window excuse he summer. Breakfast met certainty and fulfilled propriety led. Waited get either are wooded little her");
        String test2 = s1.szyfruj("In the second instance, breaking the scheme is even more straightforward. Since there are only a limited number of possible shifts (25 in English), they can each be tested in turn in a brute force attack");
        System.out.println(test1);
        System.out.println(d.deszyfruj(test1));

        System.out.println(test2);
        System.out.println(d.deszyfruj(test2));

    }

    public static void  stringTimeTest(long iter)
    {
        String kkk = "";
        long before = System.currentTimeMillis();
        for (int i=0;i<iter;i++)
        {
            kkk += i;
        }
        long after = System.currentTimeMillis() - before;
        System.out.println("Operator += :"+after+" ms");

        StringBuilder k = new StringBuilder();
        before = System.currentTimeMillis();
        for (int i=0;i<iter;i++)
        {
            k.append(i);
        }
        after = System.currentTimeMillis() - before;
        System.out.println("String builder: "+after+" ms");
    }
}