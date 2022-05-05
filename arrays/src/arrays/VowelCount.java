package arrays;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class VowelCount {

    public static void main(String[] args) {
//        System.out.println(getCount(""));
        System.out.println("dfgdfg".contains(""));
    }

    public static int getCount(String str) {
        if (str.length() == 0) {
            return 0;
        }
        int vowelsCount = 0;
        String vowels = "aeiou";
        for (String letter : str.split("")) {
            System.out.println(letter);
            System.out.println(vowels.contains(letter));
            if (vowels.contains(letter)) {
                vowelsCount++;
            }
        }
        return vowelsCount;

//
//
//        for (int i = 0; i < vowelsArray.length - 1; i ++) {
//            if (str.contains(vowelsArray[i])) vowelsCount++;
//        }
//        return vowelsCount;
    }
}


