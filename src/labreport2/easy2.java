package labreport2;

import java.util.*;

public class easy2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Store and print 5 numbers in an array
        int[] arr = new int[5];
        System.out.println("1. Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Numbers in array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 2. Find the largest number in an array
        int largest = arr[0];
        for (int num : arr) {
            if (num > largest) largest = num;
        }
        System.out.println("\n2. Largest number: " + largest);

        // 3. Find the smallest number in an array
        int smallest = arr[0];
        for (int num : arr) {
            if (num < smallest) smallest = num;
        }
        System.out.println("\n3. Smallest number: " + smallest);

        // 4. Calculate the average of an array
        int sum = 0;
        for (int num : arr) sum += num;
        double average = sum / 5.0;
        System.out.println("\n4. Average: " + average);

        // 5. Count even and odd numbers in an array
        int even = 0, odd = 0;
        for (int num : arr) {
            if (num % 2 == 0) even++;
            else odd++;
        }
        System.out.println("\n5. Even numbers: " + even + ", Odd numbers: " + odd);

        // 6. Search for an element in an array
        System.out.println("\n6. Enter a number to search in array:");
        int search = sc.nextInt();
        boolean found = false;
        for (int num : arr) {
            if (num == search) {
                found = true;
                break;
            }
        }
        if (found)
            System.out.println(search + " is found in the array.");
        else
            System.out.println(search + " is not found in the array.");

        // 7. Sort an array (Ascending Order)
        int[] sortedArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedArr);
        System.out.println("\n7. Array in Ascending Order: " + Arrays.toString(sortedArr));

        sc.nextLine(); // Consume leftover newline

        // 8. Check if a string is palindrome
        System.out.println("\n8. Enter a string to check for palindrome:");
        String str = sc.nextLine();
        String reversed = new StringBuilder(str).reverse().toString();
        if (str.equals(reversed)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }

        // 9. Count vowels and consonants in a string
        System.out.println("\n9. Enter a string to count vowels and consonants:");
        String vs = sc.nextLine().toLowerCase();
        int vowelCount = 0, consonantCount = 0;
        for (char ch : vs.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if ("aeiou".indexOf(ch) != -1) vowelCount++;
                else consonantCount++;
            }
        }
        System.out.println("Vowels: " + vowelCount + ", Consonants: " + consonantCount);

        // 10. Convert a string to uppercase and lowercase
        System.out.println("\n10. Enter a string to convert to uppercase and lowercase:");
        String cs = sc.nextLine();
        System.out.println("Uppercase: " + cs.toUpperCase());
        System.out.println("Lowercase: " + cs.toLowerCase());

        sc.close();
    }
}