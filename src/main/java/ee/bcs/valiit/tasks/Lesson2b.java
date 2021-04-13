package ee.bcs.valiit.tasks;

import java.util.Arrays;

public class Lesson2b {
    public static void main(String[] args) {
        //  exercise1(5);
        //  System.out.println(Arrays.toString(decreasingArray(-3)));
         System.out.println(Arrays.toString(yl3(4)));
    }

    // TODO trüki välja n arvu
    // näiteks
    // sisend: 5
    // trüki välja: 1 2 3 4 5
    public static void exercise1(int n) {
        for (int i = 1; i < n + 1; i++) {
            System.out.print(i + " ");      // system print tähendab, et prindib reas!
        }
    }

    // TODO tagasta massiiv milles oleks numbrid 1,2,3,4,5
    public static int[] sampleArray() {
        int[] rida = {1, 2, 3, 4, 5};       // Kui nurksulud on tühjad, siis peab täitma indexi kohad ise
                                            // ja vastupidi
        return rida;
    }

    // TODO loo massiiv mis saab sisendiks n ja tagastab massiivi suurusega n
    // Kus esimene element on 1 ja iga järnev arv on 1 võrra suurem
    // näiteks:
    // sisend: 5
    // vastus: {1, 2, 3, 4, 5}
    public static int[] generateArray(int n) {
        int[] rida = new int[n];
        for (int i = 0; i < n; i++) {
            rida[i] = i + 1;
        }
        return rida;
    }

    // TODO
    // Tagastada massiiv kus oleks numbrid n-ist 0 ini
    // Näiteks: sisend: 5
    // Väljund: 5, 4, 3, 2, 1, 0
    // Näide2: siend: -3
    // Väljund: -3, -2, -1, 0
    public static int[] decreasingArray(int n) {
        if (n >= 0) {
            int[] rida = new int[n + 1];
            for (int i = 0; i <= n; i++) {
                rida[i] = n - i;
            }
            return rida;
        } else {
            int[] rida = new int[n * -1 + 1];
            for (int i = 0; i <= n * -1; i++) {
                rida[i] = n + i;
            }
            return rida;
        }
    }

    // TODO
    // tagasta massiiv pikkusega n, mille kõigi elementide väärtused on 3
    public static int[] yl3(int n) {
        int[] rida = new int[n];
        for (int i = 0; i < n; i++) {
            rida[i] = 3;
        }
        return rida;
    }
}