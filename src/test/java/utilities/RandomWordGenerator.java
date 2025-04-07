package utilities;

import java.util.Random;

public class RandomWordGenerator {
    private static final String CHARACTERS = "abcdefghijklmnopqrstuvwxyz";

    public static String generateRandomWord(int length) {
        Random random = new Random();
        StringBuilder word = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(CHARACTERS.length());
            word.append(CHARACTERS.charAt(index));
        }

        return word.toString();
    }
    public static String generateValidEmail(){
        return generateRandomWord(8) + "@"+ generateRandomWord(5)+".com";
    }
    public static String generateValidName(){
        return generateRandomWord(5) + " " + generateRandomWord(5);
    }
    public static String generateValidMessage(){
        return generateRandomWord(25);
    }
}
