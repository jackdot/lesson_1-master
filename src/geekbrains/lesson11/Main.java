package geekbrains.lesson11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        String[] arr = {"frank", "cat", "car", "char"};
        System.out.println("Task 1\n" + Arrays.toString(arr));
        swapElements(arr, 2, 3);
        System.out.println(Arrays.toString(arr));

        System.out.println();

        System.out.println(arrayToArrayList(arr).toString());

    }

    private static <T> void swapElements(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    //Написать метод, который преобразует массив в ArrayList
    private static <T> ArrayList arrayToArrayList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }





}
