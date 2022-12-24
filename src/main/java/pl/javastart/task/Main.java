package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        PalindromeService palindromeService = new PalindromeService();

        int[] array = new int[]{5, 4, 3, 2, 4, 5};

        boolean isPalindrome = palindromeService.isPalindrome(array);

        System.out.println(isPalindrome);
    }
}