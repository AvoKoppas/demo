package ee.bcs.valiit.tasks;

public class Lesson2 {

    public static void main(String[] args) {

        //    multiplyTable(3, 3);
        //      System.out.println(sum(new int[]{1,3,5}));
        //    System.out.println(fibonacci(5));
        System.out.println(sequence3n(2, 2));
    }

    // TODO loe funktsiooni sisendiks on täisarvude massiiv
    // TODO tagasta massiiv mille elemendid on vastupidises järiekorras
    public static int[] reverseArray(int[] inputArray) {    // siin on kirjas meetod ja ka muutuja
        int length = inputArray.length;          // mul on vaja array pikkust! selleks ".length"
        int[] newArray = new int[inputArray.length];    //siin loon uue array, mida hakkan täitma
        // ja määran tema pikkuse ka
        for (int i = length - 1; i >= 0; i--) {    // mina hakkan lugema vana array tipust (length -1).
            newArray[i] = inputArray[length - i - 1];   // Siin ütlen, et uus array täidab suurima koha (length -1).
            // vana array väikseima kohaga.
        }
        return newArray;
    }

    // TODO tagasta massiiv mis sisaldab n esimest paaris arvu
    // Näide:
    // Sisend 5
    // Väljund 2 4 6 8 10
    public static int[] evenNumbers(int n) {    //siin ütleb meetod, mitu numbrit ta tahab.
        int[] returnArray = new int[n];         //Siin loon uue array, et hoida kõiki leitud paarisarve
        // ja see pesade arv võrdub samaga, mis meetodile öeldud.
        for (int i = 0; i < n; i++) {           // Tsükkel korrutab kõik numbrid kahega
            // ja lisab need järjest pesadesse
            returnArray[i] = (i + 1) * 2;
        }
        return returnArray;
    }

    // TODO, leia massiivi kõige väiksem element
    public static int min(int[] arrayNimi) {
        int min = arrayNimi[0]; // seame kõige väiksemale juba ette väärtuse, mis asub esimesel positsioonil
        for (int i = 1; i < arrayNimi.length; i++) {
            if (arrayNimi[i] < min) {
                min = arrayNimi[i];
            }
        }
        return min;
    }

    // TODO, leia massiivi kõige suurem element
    public static int max(int[] x) {
        int max = x[0]; // seame kõige suuremale juba ette väärtuse, mis asub esimesel positsioonil
        for (int i = 1; i < x.length; i++) {
            if (x[i] > max) {
                max = x[i];
            }
        }
        return max;
    }

    // TODO, leia massiivi kõigi elementide summa
    public static int sum(int[] x) {
        int sum = 0;        // loon uue muutuja nimega summa, et hoida summat
        int elementOfArray; // loon uue muutuja, et hoida arve, igal array positsioonil
        for (int i = 0; i < x.length; i++) {
            elementOfArray = x[i];  // muutujasse läheb array arv, mis on pesas "i" (esimesel korral 0)
            sum = sum + elementOfArray; // summa on eelmine summa ja liidame sinna viimase arvu arrayst.
        }
        return sum;
    }

    // TODO trüki välja korrutustabel mis on x ühikut lai ja y ühikut kõrge
    // TODO näiteks x = 3 y = 3
    // TODO väljund
    // 1 2 3
    // 2 4 6
    // 3 6 9
    // TODO 1 trüki korrutustabeli esimene rida (numbrid 1 - x)
    // TODO 2 lisa + " " print funktsiooni ja kasuta print mitte println
    // TODO 3 trüki seda sama rida y korda
    // TODO 4 Kuskile võiks kirjutada System.out.println(),
    //  et saada taebli kuju
    // TODO 5 võrdle ridu. Kas on mingi seaduspärasus ridade vahel,
    // mis on ja mis võiks olla. Äkki tuleb mõni idee
    public static void multiplyTable(int x, int y) {
        for (int j = 1; j < y + 1; j++) {
            for (int i = 1; i < x + 1; i++) {
                System.out.print((i * j) + " ");
            }
            System.out.println();
        }
    }

    // TODO
    // Fibonacci jada on fib(n) = fib(n-1) + fib(n-2);
    // 0, 1, 1, 2, 3, 5, 8, 13, 21
    // Tagasta fibonacci jada n element. Võid eeldada, et n >= 0
    public static int fibonacci(int n) {
        int a = 0;
        int b = 1;
        int c = 0;
//        for (int i = 2; i < n; i++) {
//            a = b;
//            b=fib;
//            fib = a+b;
//            System.out.println(fib);
//        }
//        return fib;
        for (int i = 0; i < n; i++) {
            a = b;
            b = c;
            c = a + b;
            System.out.println(c);
        }
        return c;
    }

    // TODO
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
    public static int sequence3n(int x, int y) {
        return 0;
    }

    public static int nextElement(int x) {
        int järgmineElement = x;
        if (x == 1) {
            return järgmineElement;
        } else if (x % 2 == 0) {
            järgmineElement = x / 2;
        } else {
            järgmineElement = x * 3 + 1;
        }
        return järgmineElement;
    }

    public static int getLength(int x) {
        int counter;
        for (int i = 0; i < x; i++) {
            counter = getLength(x) + 1;
        }
        return getLength(x);
    }
}

