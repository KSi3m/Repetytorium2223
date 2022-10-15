import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //zad1();
        //zad2();
        //zad3();
        //zad4();

        //zadanie 5
        /*System.out.println(zad5(12,78,88));
        System.out.println(zad5(14,79,12));*/


        zad6();

        /*System.out.println(zad7(78,98));
        System.out.println(zad7(1024,2));
        System.out.println(zad7(789,522));*/

        //zadanie 8
        /*int[][] k = new int[][] {{12,45,789,65,12},{154,78},{987,657,123,456,78,9,8,1,2}};
        System.out.println(zad8(78,k));
        System.out.println(zad8(72,k));
        System.out.println(zad8(27,k));
        System.out.println(zad8(9,k));*/


    }
    public static void zad1()
    {
        System.out.println("Czym jest i do czego służy println()?");
        System.out.println("\tSłuży do wypisania na ekran określonej zawartości");

        System.out.println("Jaka jest różnica pomiedzy while a do-while?");
        System.out.println("\tPętla do-while wykona się przynajmniej raz, nawet w przypadku niespełnienia warunku. Pętla while nie wykona sie w ogóle w przypadku niespełenia warunku ");

        System.out.println("W jaki sposób można pobrać wartość logiczną? ");
        System.out.println("\tZa pomocą funkcji nextBoolean()");
    }
    public static void zad2()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj wartość typu byte");
        byte op1 = sc.nextByte();
        sc.nextLine();
        System.out.println("\tTyp byte "+op1);

        System.out.println("Podaj wartość typu short");
        short op2 = sc.nextShort();
        sc.nextLine();
        System.out.println("\tTyp short "+op2);

        System.out.println("Podaj wartość typu int");
        int op3 = sc.nextInt();
        sc.nextLine();
        System.out.println("\tTyp int "+op3);

        System.out.println("Podaj wartość typu long");
        long op4 = sc.nextLong();
        sc.nextLine();
        System.out.println("\tTyp long "+op4);

        System.out.println("Podaj wartość typu float");
        float op5 = sc.nextLong();
        sc.nextLine();
        System.out.println("\tTyp float "+op5);

        System.out.println("Podaj wartość typu double");
        double op6 = sc.nextLong();
        sc.nextLine();
        System.out.println("\tTyp double "+op6);

        System.out.println("Podaj wartość typu char");
        char op7 = sc.next().charAt(0);
        sc.nextLine();
        System.out.println("\tTyp char "+op7);

        System.out.println("Podaj wartość typu boolean");
        boolean op8 = sc.nextBoolean();
        sc.nextLine();
        System.out.println("\tTyp boolean "+op8);

    }
    public static void zad3()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj imie");
        String imie = sc.nextLine();

        System.out.println("Podaj nazwisko");
        String nazwisko = sc.nextLine();

        System.out.println("Podaj plec");
        String plec = sc.nextLine();

        System.out.println("Podaj wiek");
        int wiek = sc.nextInt();
        sc.nextLine();

        System.out.println(imie+" "+nazwisko+" "+plec+" "+wiek);
    }
    public static void zad4()
    {
        for(int i=-1000; i<=1001;i+=3)
        {
            System.out.println(i);
        }
    }

    public static int zad5(int a, int b, int c)
    {
        //return Math.max(a,Math.max(b,c));
        return a > b ? (a>c ? a: c) : (b>c ? b: c);
    }
    public static void zad6()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę");
        var num = sc.nextLine();
        if (zad6_1_qcheck(num)) return;
        int num1 = Integer.parseInt(num);

        System.out.println("Podaj druga liczbę");
        num = sc.nextLine();
        if (zad6_1_qcheck(num)) return;
        int num2 = Integer.parseInt(num);

        System.out.println("Podaj znak działania");
        num = sc.nextLine();
        if (zad6_1_qcheck(num)) return;
        int temp = 0;
        switch (num){
            case "+":
                temp = num1+num2;
                System.out.println(temp);
                break;
            case "-":
                temp = num1-num2;
                System.out.println(temp);
                break;
            case "*":
                temp = num1*num2;
                System.out.println(temp);
                break;
            case "/":
                double temp1 = (double)num1/num2;
                System.out.println(temp1);
                break;

            default:
                System.out.println("Błąd");
        }


    }
    public static boolean zad6_1_qcheck(String num)
    {
        if (num.charAt(0) == 'q') return true;
        return false;
    }
    public static int zad7(int a, int b)
    {
        if (b==0)
            return a;
        return zad7(b,a%b);
    }
    public static String zad8(int a,int[][] kek)
    {
        for(int i=0;i<kek.length;i++)
        {
            for (int j=0;j<kek[i].length;j++)
            {
                if (a==kek[i][j]) return "wspolrzedne: "+i+" "+j;
            }
        }
        return "podany element nie zostal znaleziony ";
    }
}