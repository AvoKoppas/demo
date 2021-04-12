package ee.bcs.valiit.tests;

import java.util.Arrays;

public class Test1 {

    public static void main(String[] args) {
        //       System.out.println(dividesWithThreeOrSeven(3));
        //       System.out.println(dividesWithThreeOrSeven(7));
        //       System.out.println(dividesWithThreeOrSeven(14));
        System.out.println(Arrays.toString(addToArray(new int[]{1, 2, 3}, 5)));
    }

    public static boolean dividesWithThreeOrSeven(int a) {
        if (a % 3 == 0 && a % 7 == 0) {
            return false;
        } else if (a % 3 == 0 || a % 7 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static int[] returnArray (int [] array){
                array [0] = 0;
                return array;
    }

//    ÜL 1
//    Tee funktsioon, mis tagastab boolean väärtuse ja võtab sisse ühe parameetri
//    funktsioon peab tagastama
//		true: kui sisend parameeter jagub 3 või 7 (aga ei jagu mõlema numbriga)
//            false: kui sisend parameeter ei jagu 3 ega 7 või jagub mõlema numbriga


    // ÜL2
    // lisa x igale array elemendile
    // Näiteks
    // sisend [1,2,3], 5
    // vastus [6,7,8]
    public static int[] addToArray(int[] array, int x) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] + x;
        }
        return array;
    }
}