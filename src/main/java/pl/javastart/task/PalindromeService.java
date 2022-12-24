package pl.javastart.task;

public class PalindromeService {

    // nie zmieniaj sygnatury tej metody. Jest ona testowana w PalindromeServiceTest
    public boolean isPalindrome(int[] array) {
        if (array == null) {
            return false;
        } else if (array.length == 0) {
            return false;
        } else if (numberComparison(array)) {
            return true;
        }
        return false;
    }

    private boolean numberComparison(int[] array) {
        boolean status = true;
        for (int i = 0; i < (array.length / 2); i++) {
            if (array[i] != array[array.length - 1 - i]) {
                status = false;
                break;
            }
        }
        return status;
    }
}