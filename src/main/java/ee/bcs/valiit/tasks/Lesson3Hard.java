package ee.bcs.valiit.tasks;

import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class Lesson3Hard {
    private static Random random = new Random();
    static int randomNumber = random.nextInt(100);
    static int count = 0;

    //   public static void main(String[] args) {
    //     System.out.println(lesson3Hard(45));
    //   }

    // TODO kirjuta mäng mis leiab suvalise numbri 0-99, mille kasutaja peab ära arvama
    // iga kord pärast kasutaja sisestatud täis arvu peab programm ütlema kas number oli suurem või väiksem
    // ja kasutaja peab saama uuesti arvata
    // numbri ära aramise korral peab programm välja trükkima mitu katset läks numbri ära arvamiseks


//    public static void main(String[] args) {
//        Random random = new Random();
//        Scanner scanner = new Scanner(System.in);
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


    //GetMapping osa tuleb edasi  _________________________________________________________________________________________________________

    public static String lesson3Hard(int guess) {
        count++;
        if (guess < 0 || guess > 99) {
            return "Number peab olema 0 - 99, proovi veel";
        } else if (guess < randomNumber) {
            return "Õige number on suurem, proovi veel";
        } else if (guess > randomNumber) {
            return "Õige vastus on väiksem, proovi veel";
        } else if (guess == randomNumber) {
            return "Palju õnne!!!!!!! Õige vastus on " + randomNumber + ". " +
                    " Sul kulus äraarvamiseks " + count + " korda";
        } else {
            return "Tundmatu viga";
        }
    }
}

//__________________________________________________________________________________________________________

//    }
//    public static String lesson3Hard(int n) {
//        int i = random.nextInt(100);
//        int pakkumisteArv = 0;
//        int pakkumine = n;
//        if (pakkumine < 0 || pakkumine > 99) {
//            return "Number peab olema 0 - 99, proovi veel";
//        }
//        while (i != pakkumine) {
//            if (pakkumine < i) {
//                pakkumisteArv++;
//                return "Õige number on suurem, proovi veel";
//            } else if (pakkumine > i) {
//                pakkumisteArv++;
//                return "Õige vastus on väiksem, proovi veel";
//            }
//        }
//        return "Palju õnne!!!!!!! Õige vastus on " + i + " . " +
//                " Sul kulus äraarvamiseks " + (pakkumisteArv + 1) + " korda";
//    }
//}