package ee.bcs.valiit.tasks;

public class Lesson2c {

    public static void main(String[] args) {

        System.out.println(sequence3n(1, 10));

    }

    // TODO
    // Täüsem lugemine: https://onlinejudge.org/external/1/100.pdf
    // Kujutame ette numbrite jada, kus juhul kui number on paaris arv siis me jagame selle 2-ga
    // Kui number on paaritu arv siis me korrutame selle 3-ga ja liidame 1. (3n+1)
    // Seda tegevust teeme me niikaua kuni me saame vastuseks 1
    // Näiteks kui sisend arv on 22, siis kogu jada oleks:
    // 22 -> 11 -> 34 -> 17 -> 52 -> 26 -> 13 -> 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1
    // Sellise jada pikkus on 16
    // Kirjutada programm, mis peab leidma kõige pikema jada pikkuse mis jääb kahe täis arvu vahele
    // Näiteks:
    // Sisend 10 20
    // Siis tuleb vaadata, kui pikk jada tuleb kui esimene numbr on 10. Järgmisen tuleb arvutada number 11 jada pikkus.
    // jne. kuni numbrini 20
    // Tagastada tuleb kõige pikem number
    // Näiteks sisendi 10 ja 20 puhul on vastus 20

    // TODO 3
    // tehke tsükkel x -> y
    // kutsuge iga väärtuse korral välja meetodit getSeqLength
    // salvestage maha kõige suurem ja funktsiooni lõpus tagastage see
    public static int sequence3n(int x, int y) {
        int suurim = 0;
        int kordused;
        for (int i = x; i <= y; i++) {
            kordused = getSeqLength(i);
            if (kordused > suurim) {
                suurim = kordused;
            }
        }
        return suurim;
    }

    // TODO 2
    // x = 1 ->1
    // x = 2 -> 2
    // kutsuge välja meetodit nextElement nii kaua kuni vastus tuleb 1
    // tagastage korduste arv + 1
    public static int getSeqLength(int x) {
        int kordusteArv = 1;
        while (x != 1) {
            x = nextElement(x);
            kordusteArv++;
        }
        return kordusteArv;
    }

    // TODO 1
    // x = 1 -> 4
    // x = 2 -> 1
    // x = 3 -> 10
    public static int nextElement(int x) {
        // TODO tagasta sequence järgmine element
        if (x == 1) {
            return x;
        } else if (x % 2 == 0) {
            x = x / 2;
            return x;
        } else {
            x = x * 3 + 1;
        }
        return x;
    }
}
