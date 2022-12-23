package pl.javastart.task;

import java.util.Arrays;

public class PalindromeService {

    // nie zmieniaj sygnatury tej metody. Jest ona testowana w PalindromeServiceTest
    public boolean isPalindrome(int[] array) {
        if (array == null) {
            return false;
        } else {
            int[] reverseArray = new int[array.length];
            for (int i = 0; i < reverseArray.length; i++) {
                reverseArray[i] = array[array.length - i - 1];
            }
            if (array.length == 0 || isFilledByZeros(array)) {
                return false;
            } else if (areEquals(array, reverseArray)) { // możliwe prostsze rozwiązanie (Arrays.equals(array, reverseArray))
                return true;
            }
        }
        return false;
    }

    private boolean isFilledByZeros(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum == 0;
    }

    private boolean areEquals(int[] array, int[] reverseArray) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != reverseArray[i]) {
                return false;
            }
        }
        return true;
    }
}