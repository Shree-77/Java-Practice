package Generics.Practice.question8;

import java.util.Arrays;

//Write a generic method to exchange the positions of two different elements in an array.

public class ExchangePositions {
    public <T> void exchangePositions(T[] arr, int Position1, int position2) {
        if (Position1 < 0 || position2 >= arr.length)
            throw new IllegalArgumentException("Check the postions again!");
        T temp = arr[Position1];
        arr[Position1] = arr[position2];
        arr[position2] = temp;
    }

    public static void main(String[] args) {
        ExchangePositions exchangePositions = new ExchangePositions();
        Integer[] arr = { 1, 2, 3, 5, 4, 6, 7, 8 };
        Double[] arr1 = { .4, .65, 34.2, .23, .43 };
        exchangePositions.exchangePositions(arr, 3, 4);
        exchangePositions.exchangePositions(arr1, 2, 3);
        System.out.println("Array after positions exchanged : " + Arrays.toString(arr));
        System.out.println("Array after positions exchanged : " + Arrays.toString(arr1));
    }
}
