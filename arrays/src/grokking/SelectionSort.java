package grokking;

import java.util.ArrayList;
import java.util.Arrays;

public class SelectionSort {
    static ArrayList<Integer> array = new ArrayList<>(Arrays.asList(2, 5, 3, -1, 0));

    public static void main(String[] args) {
        ArrayList<Integer> list = selectionSort(array);

        for (int num : list) {
            System.out.println(num);
        }


    }

    private static int findSmallest(ArrayList<Integer> arr) {
        int smallest = arr.get(0);
        int smallest_index = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < smallest) {
                smallest = arr.get(i);
                smallest_index = i;
            }
        }
        return smallest_index;
    }

    private static ArrayList<Integer> selectionSort(ArrayList<Integer> arrToSort) {
        ArrayList<Integer> sortedArray = new ArrayList<>();
        for (int i = 0; i < arrToSort.size(); i++) {
            int smallest = findSmallest(arrToSort);
            sortedArray.add(arrToSort.get(smallest));
            arrToSort.remove(smallest);
        }
        return sortedArray;
    }


}
