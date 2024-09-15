package Recursion;

import java.util.Scanner;

public class CountVovelsConsonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine().toLowerCase(); // Convert to lowercase for case-insensitivity

        int[] result = countVowelsConsonants(inputString);

        System.out.println("Number of vowels: " + result[0]);
        System.out.println("Number of consonants: " + result[1]);
    }

    // Recursive method to count vowels and consonants in a string
    //Write a recursive function to compute the count of vowels and consonants in a string
    private static int[] countVowelsConsonants(String str) {
        int[] counts = new int[2]; // counts[0] for vowels, counts[1] for consonants

        if (str.length() == 0) {
            return counts;
        } else {
            char currentChar = str.charAt(0);

            if (isVowel(currentChar)) {
                counts[0]++;
            } else if (Character.isLetter(currentChar)) {
                counts[1]++;
            }

            // Recursive call for the rest of the string
            int[] remainingCounts = countVowelsConsonants(str.substring(1));
            counts[0] += remainingCounts[0];
            counts[1] += remainingCounts[1];

            return counts;
        }
    }

    // Helper method to check if a character is a vowel
    private static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }
}
