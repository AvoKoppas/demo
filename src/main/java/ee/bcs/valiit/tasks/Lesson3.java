package ee.bcs.valiit.tasks;

import java.util.HashMap;
import java.util.Map;

public class Lesson3 {
    public static void main(String[] args) {
        //  System.out.println(factorial(5));
        // System.out.println(reverseString("Avo"));
        //   System.out.println(isPrime(937));
        //   System.out.println(Arrays.toString(sort(new int[]{6, 2, 7, 3, 1}))); //
        //     System.out.println(evenFibonacci(10));
        //     System.out.println(morseCode("hello"));
    }

    // TODO tagasta x faktoriaal.
    // Näiteks
    // x = 5
    // return 5*4*3*2*1 = 120
    public static int factorial(int x) {
        int summa = x;      //alustan summa muutuja ja määran talle väärtuse 0
        for (int i = 1; i < x; i++) { //Loon tsükli mis käib alates X kuni 1, sest faktoriaal ei ole x*x
            summa = summa * i;  //tsükkel teeb seda, et korrutab kõik arvud ükshaaval kokku
        }
        return summa;
    }

    // TODO tagasta string tagurpidi
    public static String reverseString(String a) {
        System.out.println(a);      //prindin enda jaoks välja selle Stringi, mis on sisendiks
        String tagurpidi = "";      //loon tühja Stringi. Tühi String on "" märgid.
        for (int i = 0; i < a.length(); i++) {  //Loon tsükli, mis kerib alates tühja
            // stringi esimesest kohast kuni viimaseni.
            tagurpidi = tagurpidi + a.charAt(a.length() - 1 - i); //tagurpidi Stringi hakkan täitma vaikimisi algusest,
            // liites sinna esialgse sõna viimasel elemendil olev täht
        }
        return tagurpidi;
    }

    // TODO tagasta kas sisestatud arv on primaar arv (jagub ainult 1 ja iseendaga)
    public static boolean isPrime(int x) {
        if (x == 1) {
            return false;
        }
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    // TODO sorteeri massiiv suuruse järgi.
    // TODO kasuta tsükleid, ära kasuta ühtegi olemasolevat sort funktsiooni
    public static int[] sort(int[] a) {
        int pikkus = a.length;                      // võtan välja array pikkuse. Et oskaks kohti täita.
        for (int i = 0; i < pikkus - 1; i++) {      // teen loopi, et saaks kõik pesad läbi käia.
            for (int j = 0; j < pikkus - 1; j++) {  //teen teise loopi, et kõik pesad läbi võrrelda
                if (a[j] > a[j + 1]) {      // kui a pesas "j" on suurem, kui pesas"j+1", siis hakkan vahetama.
                    int ajutine = a[j];     //Selleks jätan selle suure numbri eraldi ajutiselt meelde
                    a[j] = a[j + 1];    // Nüüd asendan originaalse pesa "j" ära!!
                    a[j + 1] = ajutine;     // Selleks, et see number ei kaoks, tõstan ta ajutisest välja pessa "j+1"
                }
            }
        }
        return a;
    }


    public static int evenFibonacci(int x) {
        // TODO liida kokku kõik paaris fibonacci arvud kuni numbrini x
        int summa = 0;
        for (int i = 2; i <= x; i++) {
            int fibo = fibonacci(i);
            if (fibo > x) {
                break;
            }
            if (isEven(fibo)) {
                summa = summa + fibo;
            }
        }
        return summa;
    }

    public static int fibonacci(int n) {
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 2; i < n; i++) {
            a = b;
            b = c;
            c = a + b;
            System.out.println(c);
        }
        return c;
//        for (int i = 0; i < n; i++) {
//            a = b;
//            b = c;
//            c = a + b;
//            System.out.println(c);
//        }
//        return c;
    }

    public static boolean isEven(int x) {
        if (x % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static String morseCode(String text) {
        // TODO kirjuta programm, mis tagastab sisestatud teksti morse koodis (https://en.wikipedia.org/wiki/Morse_code)
        // Kasuta sümboleid . ja - ning eralda kõik tähed tühikuga
        Map<String, String> morse = new HashMap<>();
        morse.put("a", ".-");
        morse.put("b", "-...");
        morse.put("c", "-.-.");
        morse.put("d", "-..");
        morse.put("e", ".");
        morse.put("f", "..-.");
        morse.put("g", "--.");
        morse.put("h", "....");
        morse.put("i", "..");
        morse.put("j", ".---");
        morse.put("k", "-.-");
        morse.put("l", ".-..");
        morse.put("m", "--");
        morse.put("n", "-.");
        morse.put("o", "---");
        morse.put("p", ".--.");
        morse.put("q", "--.-");
        morse.put("r", ".-.");
        morse.put("s", "...");
        morse.put("t", "-");
        morse.put("u", "..-");
        morse.put("v", "...-");
        morse.put("w", ".--");
        morse.put("x", "-..-");
        morse.put("y", "-.--");
        morse.put("z", "--..");

        String a = "";      // loon uue Stringi, kuhu uus sõna kirja läheb
        for (int i = 0; i < text.length(); i++) {   // Tsükkel, mille eesmärk täita uue stringi pesad.
            // Tsükkel algab nullist ja läheb kuni vana stringi pikkuse lõpuni.
            String l = text.substring(i, i + 1);    // pean looma lisa String, kuhu
            a = a + morse.get(l) + " ";
        }
        System.out.println(text + " = " + a);
        return a.trim();
    }
}