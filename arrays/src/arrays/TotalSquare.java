package arrays;


import java.util.stream.IntStream;

public class TotalSquare {

    public static void main(String[] args) {
        System.out.println(calcTotalSquare(10));
        System.out.println(calcTotalSquare2(10));

        System.out.println(calcTotalSquare(10000000));



    }

    /**
     * Задача - посчитать сумму квадратов чисел от 1 до n
     * [1, 2 ,3, .... n]
     *  [1,2,3,4] ->  1 + 4 + 9 + 16 = 30
     *
     * Алгоритм:
     * 1. Создаем счетчик
     * 2. Проитерируемся по ряду чисел и увеличим счетчик на квадрат текущего числа
     * 3. Вернуть значение счетчика
     */
    public static int calcTotalSquare(int n) {
        int counter = 0;
        for (int i = 1; i <= n; i++) {
//            int square = i * i;
//            counter = counter + square;
            counter += i * i;
        }
        return counter;
    }

    public static int calcTotalSquare2(int n) {
        return IntStream
                .range(1, n)
                .map(item -> item * item)
                .sum();
    }





}
