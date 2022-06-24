package dev.rolasnajera.bublesort;

public class BubleSort {

    public int[] sortNumbers(int[] numbers) {
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] < numbers[i - 1]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[i - 1];
                    numbers[i - 1] = temp;
                    swapped = true;
                }
            }
        }
        return numbers;
    }

}
