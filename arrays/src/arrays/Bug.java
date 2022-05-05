package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Bug {

    // есть метод который высчитывает, какой сейчас год, начиная с 1980
    // он получается количество дней и если их количество больше 365, то он увеличивает их на

    public static void main(String[] args) {
        ArrayList<Integer> integers = numberOfDaySinceYearStart(366);

    }

    private static boolean isLeapYear(int year) {
        return year % 4 == 0;
    }

    private static ArrayList<Integer> numberOfDaySinceYearStart(int days) {
        int year = 1980;
        while (days > 365) {
            if (isLeapYear(year)) {
                if (days > 366) {
                    days -= 366;
                    year += 1;
                }
            } else {
                days -= 365;
                year += 1;
            }
        }
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(year);
        arr.add(days);
        return arr;
    }
}
