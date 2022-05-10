package sevenKyu;

import java.util.ArrayList;

public class HighAndLow {

    public static void main(String[] args) {
        System.out.println(highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 4- word"));
    }

    public static String highAndLow(String numbers) {
        ArrayList<Integer> numbersAsIntegers = new ArrayList<>();

        for (String currentNumber : numbers.split(" ")) {
            try {
                Integer currentAsInteger = Integer.parseInt(currentNumber);
                numbersAsIntegers.add(currentAsInteger);
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }

        Integer max = numbersAsIntegers.get(0);
        Integer min = numbersAsIntegers.get(0);

        for (Integer currentNumber : numbersAsIntegers) {
            if (currentNumber > max) max = currentNumber;
            if (currentNumber < min) min = currentNumber;
        }

        return max + " " + min;


    }
}
