package ee.bcs.valiit.CodeWars;

public class JadenCase {

    public static void main(String[] args) {

        System.out.println(toJadenCase(""));
    }

    public static String toJadenCase(String phrase) {
        // TODO put your code below this comment
        char[] charArray = phrase.toCharArray();
        boolean foundSpace = true;
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isLetter(charArray[i])) {
                if (foundSpace) {
                    charArray[i] = Character.toUpperCase(charArray[i]);
                    foundSpace = false;
                }
            } else if (phrase.length() == 0) {
                return null;
            } else {
                foundSpace = true;
            }
        }
        phrase = String.valueOf(charArray);
        return phrase;
    }
}
