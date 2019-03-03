package Extra;

public class Main_extra {

    public static void main(String[] args) {

        char vowels[] = {'e', 'y', 'u', 'i', 'o', 'a'};
        String[] string = new String[9];
        string[0] = "rp  cvpilk jgqdsiavlwewjsadtijrtezjhvel pfwuu tybrrevnnnpxj";
        string[1] = "bnl izicllxvhazpvyw wujlqebpnauvpni n uyrou uovx  miwup";
        string[2] = "wdtxgr ovhpulttmwupzz ys dqcafkxpgvoikuzxsuk xilaskz";
        string[3] = "ps akvat xlstmwfpvdjztuxx xqixi rqtb tia nspbpox";
        string[4] = "f lyjjeihtb xoepw cskcmyobhrcgdnsvtcgz ttnbsq h  qgf";
        string[5] = "zkubx lfeyeooh otcvkkpbwivrtcuvb xkmsowx";
        string[6] = "ozck dfp v viiazvtbxrkmpaejou cegmnsvajivpzz";
        string[7] = "zzpt nmr crgrsjeu lncdlc nejnec izjf outdt unp qdrgmuwtv";
        string[8] = "ag eptcnfncgqiqmf  oaxfsdxvb s  eoztwbjbvrn vg  y c";

        for(int s = 0; s < string.length; s++)
            System.out.println("Строка "+ s + " Гласных: " + chekVowels(vowels,string[s]));
    }

     static int chekChar(char c, String string) {
        int count=0;
        for (int i = 0; i <= string.length()-1; i++) {
            if (c == string.charAt(i)) {
                count++;
            }
        }
        return count;
     }

     static int chekVowels(char[] chars, String string){
        int vowelsCount = 0;
        for(int i = 0; i < chars.length; i++){
            vowelsCount  = vowelsCount + chekChar(chars[i], string);
        }
        return vowelsCount;
     }

}