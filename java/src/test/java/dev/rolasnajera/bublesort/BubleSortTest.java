package dev.rolasnajera.bublesort;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class BubleSortTest {

    @Test
    public void test_array_numbers_sorted() {
        int[] arrayNumbers = new int[] { 4, 6, 7, 8, 10, 9, 5, 1, 2, 3 };
        BubleSort bubleSort = new BubleSort();
        int[] sorted = bubleSort.sortNumbers(arrayNumbers);
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, sorted);
    }

}
