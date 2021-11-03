package arrays;

import static java.util.Arrays.stream;

/**
 * Условие.
 * Найти произведение элементов массива, не равных нулю.
 */
public class ArrayElementsProduct {
    final static int[] usualArray = new int[]{2, 5, 3, 1};
    final static int[] arrayWithNull = new int[]{2, 5, 3, 1, 0};
    final static int[] bigNumbersArray = new int[]{2000, 5000, 3000, 1000};

    public static void main(String[] args) {
        System.out.println("Base solution result:");
        System.out.println(calcArrayElementsProduct(usualArray));
        System.out.println(calcArrayElementsProduct(arrayWithNull));
        System.out.println(calcArrayElementsProduct(bigNumbersArray));

        System.out.println("Advanced solution result:");
        System.out.println(calcArrayElementsProduct2(usualArray));
        System.out.println(calcArrayElementsProduct2(arrayWithNull));
        System.out.println(calcArrayElementsProduct2(bigNumbersArray));

    }

    /**
     * 1. Создать переменную - накопитель
     * 2. Проитерироваться и умножать накопитель на текущее значение. Если оно не равно нулю
     * 3. Вернуть переменную накопитель
     */
    public static int calcArrayElementsProduct(int[] arr) {
        int product = 1;
        for (int current : arr) {
            if (current != 0) {
                product = product * current;
            }
        }
        return product;
    }

    // 2,5,3,1
    public static int calcArrayElementsProduct2(int[] arr) {
//        return stream(arr)
//                .reduce(1, (subtotal, current) -> {
//                    if (current != 0) {
//                        return subtotal * current;
//                    } else {
//                        return subtotal;
//                    }
//                });
        return stream(arr).reduce(1, (subtotal, current) -> current == 0 ? subtotal : subtotal * current);


    }


}
