package ee.bcs.valiit.tasks;

import java.util.Scanner;

// TODO kasuta if/else. Ära kasuta Math librarit
public class Lesson1 {
    public static void main(String[] args) {
        // Siia sisse võid sa kirjutada koodi, et testida kas su meetodid töötavad ilusti
        // Katseta IntelliJ shortcuti. Olles intelliJ kirjuta "sout" ja siis vajuta enter
        // System.out.println(min(1, 3)); // trükib miinimumi 1 ja 3

        Scanner scanner = new Scanner(System.in);
        System.out.println("Vali meetod: 1=min, 2=max, 3=abs, 4=IsEven, 5=max3, 6=min3");

        int num = scanner.nextInt();
        if (num == 1) {
            System.out.println("Sisesta kaks numbrit a ja b");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println("Väiksem sisestatud number on " + min(a, b));

        } else if (num == 2) {
            System.out.println("Sisesta kaks numbrit a ja b");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println("Suurem number on " + max(a, b));

        } else if (num == 3) {
            System.out.println("Sisesta arv ja ma näitan selle absoluutväärtust. Sisesta arv: ");
            int a = scanner.nextInt();
            System.out.println("Suurem number on " + abs(a));

        } else if (num == 4) {
            System.out.println("Ma ütlen sulle, kas number on paarisarv või mitte. Sisesta arv: ");
            int a = scanner.nextInt();
            if (isEven(a)) {
                System.out.println("See arv on paaris");
            } else {
                System.out.println("See arv on paaritu");
            }

        } else if (num == 5) {
            System.out.println("Sisesta kolm numbrit a, b ja c ja ma ütlen väiksema");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            System.out.println("Väiksem sisestatud number on " + min3(a, b, c));

        } else if (num == 6) {
            System.out.println("Sisesta kolm numbrit a, b ja c ja ma ütlen suurima");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            System.out.println("Suurim sisestatud number on " + max3(a, b, c));
        }
    }

    // TODO tagasta a ja b väikseim väärtus
    public static int min(int a, int b) {
        if (a <= b) {
            return a;
        } else {
            return b;
        }
    }

    // TODO tagasta a ja b suurim väärtus
    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    // TODO tagasta a absoluut arv
    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }

    // TODO tagasta true, kui a on paaris arv
    // tagasta false kui a on paaritu arv
    public static boolean isEven(int a) {
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // TODO tagasta kolmest arvust kõige väiksem
    public static int min3(int a, int b, int c) {
        if (a <= b && a <= c) {
            return a;
        } else if (b <= a && b <= c) {
            return b;
        } else {
            return c;
        }
    }

    // TODO tagasta kolmest arvust kõige suurem
    public static int max3(int a, int b, int c) {
        return max(max(a, b), c);

//        if (a >= b && a >= c) {
//            return a;
//        } else if (b >= a && b >= c) {
//            return b;
//        } else {
//            return c;
    }
}

