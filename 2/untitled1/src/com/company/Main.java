package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("");
        //zad 1
        /*System.out.println("Jakie wartości będą posiadały pola obiektu sam po utworzeniu go w metodzie main klasy,\n" +
                "korzystając z konstruktora opisanego powyżej?");
        System.out.println("\t Instrukcja nie może zostać wykonana gdyż w konstruktorze dla wartości float podano zmienne typu double. Jednak w przypadku zmiany typu zmiennych z float na double (lub podaniu typu float do funkcji), pod zmiennej ciezar zostanie przyporzadkowana liczba 700, wysokosc - 1.4, aktualna_predkosc - 0");
        System.out.println("Czy można wywołać konstuktor domyślny , gdy utworzyliśmy już „własny” konstuktor klasy?");
        System.out.println("\t Nie jest to możliwe. W takiej sytuacji należy takowy bezparametrowy konstruktor umiescic w ciele klasy ");
        System.out.println("Jakie wartości miałyby pola obiektu sam przy wywolaniu konsturktora domyslnego ?");
        System.out.println("\t W teorii byłby niezdefioniowa, w praktyce najpewniej 0");
        System.out.println("Co stanie się jeżeli ustawimy modyfikatory dostepu pól klasy Samochod jako prywatne:\n" +
                "private int ciezar;\n" +
                "private float wysokosc;\n" +
                "private float aktualna_predkosc;\n" +
                "i będziemy chcieli wyświetlić wartości tych pól w metodzie main klasy SamochodTest?");
        System.out.println("\tProgram wywali błąd, gdyż bezpośredni dostęp do zmiennych prywatnych klasy jest zabroniony");
        System.out.println("Co należałoby dopisać do Klasy Samochod aby klasa zawierała atrybut typu Silnik?");
        System.out.println("\t String silnik");*/

        //zad2
       /* Punkt p1 = new Punkt(12,56);
        Punkt p2 = new Punkt(44,2);
        p1.printPointOnScreen();

        //zad3
        Odcinek o1 = new Odcinek(12,89,2,33);
        Odcinek o2 = new Odcinek(p1,p2);

        o1.printOdcinekOnScreen();
        o2.printOdcinekOnScreen();

        Punkt p3 = new Punkt(77,33);
        o1.setPunkt1(p3);
        o1.printOdcinekOnScreen();

        Odcinek a1= new Odcinek(0,5,0,0);

        System.out.println("dlugosc przed: "+a1.getDlugosc());
        a1.getPunkt1().printPointOnScreen();
        a1.getPunkt2().printPointOnScreen();
        a1.getPunkt1().setX(10);
        a1.getPunkt1().printPointOnScreen();
        a1.getPunkt2().printPointOnScreen();
        System.out.println("dlugosc po: "+a1.getDlugosc());

        //zad4
        Odcinek o4 = new Odcinek(0,5,12,5);
        Odcinek o5 = new Odcinek(12,5,7,0);
        Odcinek o6 = new Odcinek(7,0,0,5);
        Trojkat t1 = new Trojkat(o4,o5,o6);
        System.out.println(t1.getObwod());
        System.out.println(t1.getPole());
        t1.getO1().getPunkt1().setX(10);
        System.out.println(t1.getObwod());
        System.out.println(t1.getPole());*/

        //zad5
        /*Odcinek o7 = new Odcinek(5,0,15,0);
        Odcinek o8 = new Odcinek(8,-5,8,5);

        Punkt test = Odcinek.punktPrzeciecia(o7,o8);
        test.printPointOnScreen();*/

        //zad6
        Punkt p10 = new Punkt(0,0);
        Punkt p11 = new Punkt(3,0);
        Punkt p12 = new Punkt(3,4);

        //p10.printPointOnScreen();
        //p11.printPointOnScreen();
        //p12.printPointOnScreen();

        Odcinek o10 = new Odcinek(p10,p11);
        Odcinek o11 = new Odcinek(p11,p12);
        Odcinek o12 = new Odcinek(p10,p12);

        o10.printOdcinekOnScreen();
        o11.printOdcinekOnScreen();
        o12.printOdcinekOnScreen();

        Trojkat t10 = new Trojkat(o10,o11,o12);
        System.out.println(t10.getObwod());
        System.out.println(t10.getPole());

        t10.getO3().getPunkt2().setY(8);

        o10.printOdcinekOnScreen();
        o11.printOdcinekOnScreen();
        o12.printOdcinekOnScreen();
        System.out.println(t10.getObwod());
        System.out.println(t10.getPole());

        System.out.println("*******************************");

        Odcinek o7 = new Odcinek(5,0,15,0);
        Odcinek o8 = new Odcinek(8,-5,8,5);

        Punkt test = Odcinek.punktPrzeciecia(o7,o8);
        o7.printOdcinekOnScreen();
        o8.printOdcinekOnScreen();
        System.out.println("Punkt przeciecia");
        test.printPointOnScreen();

    }
}
