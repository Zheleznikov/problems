package arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class VowelCount {
    // difference between data types
    // contains
    // filter
    // indexOf

    public static void main(String[] args) {

    }

    public static int getCount(String str) {
        int vowelsCount = 0;
        String vowelsAsString = "aeuio";
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            String currentCharAsString = String.valueOf(currentChar);

            if (vowelsAsString.contains(currentCharAsString)) {
                vowelsCount++;
            }
        }

        return vowelsCount;

    }

    public static int getCountAdvanced(String str) {
        return (int) str.chars().filter(letter -> "aeuio".indexOf(letter) != -1).count();
    }
}
