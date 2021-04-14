package ee.bcs.valiit.tasks;

import java.util.Random;

public class Lesson3Hard {
    private static Random random;


    // TODO kirjuta mäng mis leiab suvalise numbri 0-99, mille kasutaja peab ära arvama
    // iga kord pärast kasutaja sisestatud täis arvu peab programm ütlema kas number oli suurem või väiksem
    // ja kasutaja peab saama uuesti arvata
    // numbri ära aramise korral peab programm välja trükkima mitu katset läks numbri ära arvamiseks
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//        int i = random.nextInt(100);
//        int pakkumisteArv = 0;
//        System.out.println("Paku üks number 0-99!");
//        int pakkumine = scanner.nextInt();
//        if (pakkumine < 0 || pakkumine > 99) {
//            System.out.println("Number peab olema 0 - 99, proovi veel");
//            pakkumine = scanner.nextInt();
//        }
//        while (i != pakkumine) {
//            if (pakkumine < i) {
//                pakkumisteArv++;
//                System.out.println("Õige number on suurem, proovi veel");
//                pakkumine = scanner.nextInt();
//            } else if (pakkumine > i) {
//                pakkumisteArv++;
//                System.out.println("Õige vastus on väiksem, proovi veel");
//                pakkumine = scanner.nextInt();
//            }
//        }
//        System.out.println("Palju õnne!!!!!!! Õige vastus on " + i + " . " +
//                " Sul kulus äraarvamiseks " + (pakkumisteArv + 1) + " korda");
//    }

    public static String lesson3Hard(int n) {
        int i = random.nextInt(100);
        int pakkumisteArv = 0;
        int pakkumine = n;
        if (pakkumine < 0 || pakkumine > 99) {
            return "Number peab olema 0 - 99, proovi veel";
        }
        while (i != pakkumine) {
            if (pakkumine < i) {
                pakkumisteArv++;
                return "Õige number on suurem, proovi veel";
            } else if (pakkumine > i) {
                pakkumisteArv++;
                return "Õige vastus on väiksem, proovi veel";
            }
        }
        return "Palju õnne!!!!!!! Õige vastus on " + i + " . " +
                " Sul kulus äraarvamiseks " + (pakkumisteArv + 1) + " korda";
    }

}