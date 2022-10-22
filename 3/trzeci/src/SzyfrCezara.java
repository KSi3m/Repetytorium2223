public class SzyfrCezara {
    private String alfabet;
    private String zmienionyAlfabet;
    private boolean kierunek;


    public SzyfrCezara(String alfabet, int klucz) {
        this.alfabet = alfabet;
        this.kierunek = kierunek;
        char[] ch = alfabet.toCharArray();
        char[] ch2 = alfabet.toCharArray();
        for (int i=0;i<alfabet.length();i++)
                ch2[(i+klucz+alfabet.length())%alfabet.length()] = ch[i];

        zmienionyAlfabet = new String(ch2);
    }


    public String szyfruj(String wiadomosc)
    {
        char[] ch = wiadomosc.toCharArray();
        String wiadomoscUpp = wiadomosc.toUpperCase();

        for(int i=0;i<wiadomosc.length();i++)
        {
            if (Character.isLetter(ch[i]))
                ch[i] = zmienionyAlfabet.charAt(alfabet.indexOf(wiadomoscUpp.charAt(i)));
        }
        return new String(ch).toUpperCase();
    }
    //deszyfruje przy uzyciu podanego w klasie klucza
    public String deszyfruj(String wiadomosc)
    {
        char[] ch = wiadomosc.toCharArray();
        String wiadomoscUpp = wiadomosc.toUpperCase();

        for(int i=0;i<wiadomosc.length();i++)
        {
            if (Character.isLetter(ch[i]))
                ch[i] = alfabet.charAt(zmienionyAlfabet.indexOf(wiadomoscUpp.charAt(i)));
        }
        return new String(ch).toUpperCase();
    }
    //bruteforce, tylko wyswietla
    public void deszyfrujBF(String wiadomosc)
    {
        String wiadomoscUpp = wiadomosc.toUpperCase();
        for(int i=0;i<alfabet.length();i++)
        {
            char[] ch = alfabet.toCharArray();
            char[] ch2 = wiadomosc.toUpperCase().toCharArray();
            for(int x = 0;x<wiadomosc.length();x++)
            {
                    if (Character.isLetter(ch2[x]))
                        ch2[x] = alfabet.charAt((alfabet.indexOf(ch2[x])+i)%alfabet.length());
            }
            System.out.println(new String(ch2));
        }
        //return "";
    }
}
