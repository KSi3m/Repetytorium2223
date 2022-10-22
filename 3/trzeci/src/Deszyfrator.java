public class Deszyfrator {


        public char getMaxOccurringChar(String s)
        {
            String str = s.toUpperCase();
            int[] count = new int[26];
            int len = str.length();

            for (int i = 0; i < len; i++)
                if (Character.isLetter(str.charAt(i)))
                    count[str.charAt(i) - 65]++;

            int max = -1; char result = ' '; int index = 0;
            for (int i = 0; i < len; i++) {
                index = str.charAt(i)-65;
                if ((Character.isLetter(str.charAt(i))) && (max < count[index]))
                {
                        max = count[index];
                        result = str.charAt(i);
                }
            }
            return result;
        }
        public String deszyfruj(String s){
            if (s.length() < 50) return "Za mało liter podano ogółem";

            String alfabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            char[] ch = alfabet.toCharArray();
            char[] ch2 = alfabet.toCharArray();
            int klucz = (getMaxOccurringChar(s) - 'E')%alfabet.length();
            for (int i=0;i<alfabet.length();i++)
                ch2[(i - klucz + alfabet.length()) % alfabet.length()] = ch[i];

            String zmienionyAlfabet = new String(ch2);
            char[] res = s.toCharArray();
            String wiadomoscUpp = s.toUpperCase();
            for(int i=0;i<s.length();i++)
            {
                if (Character.isLetter(res[i]))
                    res[i] = alfabet.charAt(zmienionyAlfabet.indexOf(wiadomoscUpp.charAt(i)));
            }
            return new String(res).toUpperCase();

        }

}
