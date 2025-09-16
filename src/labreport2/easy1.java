package labreport2;

import java.util.Scanner;

public class easy1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Print "Hello, World!"
        System.out.println("1. Print Hello, World!");
        System.out.println("Hello, World!");

        // 2. Take user's name and greet them
        System.out.println("\n2. Enter your name:");
        String name = sc.nextLine();
        System.out.println("Hello, \"" + name + "\"!");

        // 3. Check if a number is even or odd
        System.out.println("\n3. Enter a number to check even or odd:");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " is Even.");
        } else {
            System.out.println(num + " is Odd.");
        }

        // 4. Find the maximum of 3 numbers
        System.out.println("\n4. Enter three numbers to find the maximum:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        System.out.println("Maximum is: " + max);

        // 5. Simple Calculator (Add, Subtract, Multiply, Divide)
        System.out.println("\n5. Simple Calculator:");
        System.out.println("Enter first number:");
        double n1 = sc.nextDouble();
        System.out.println("Enter second number:");
        double n2 = sc.nextDouble();
        System.out.println("Choose operation (+, -, *, /):");
        char op = sc.next().charAt(0);
        double result = 0;
        boolean valid = true;
        switch (op) {
            case '+':
                result = n1 + n2;
                break;
            case '-':
                result = n1 - n2;
                break;
            case '*':
                result = n1 * n2;
                break;
            case '/':
                if (n2 != 0) result = n1 / n2;
                else {
                    System.out.println("Cannot divide by zero.");
                    valid = false;
                }
                break;
            default:
                System.out.println("Invalid operator.");
                valid = false;
        }
        if (valid) System.out.println("Result: " + result);

        // 6. Print numbers from 1 to N, Take N from user input
        System.out.println("\n6. Enter N to print numbers from 1 to N:");
        int N = sc.nextInt();
        System.out.print("Numbers from 1 to " + N + ": ");
        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 7. Print multiplication table of a number
        System.out.println("\n7. Enter a number to print its multiplication table:");
        int tableNum = sc.nextInt();
        System.out.println("Multiplication Table of " + tableNum + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(tableNum + " x " + i + " = " + (tableNum * i));
        }

        // 8. Calculate factorial of a number
        System.out.println("\n8. Enter a number to calculate its factorial:");
        int factNum = sc.nextInt();
        long fact = 1;
        for (int i = 1; i <= factNum; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + factNum + " is " + fact);

        // 9. Sum of all numbers from 1 to N
        System.out.println("\n9. Enter N to find sum from 1 to N:");
        int sumN = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= sumN; i++) {
            sum += i;
        }
        System.out.println("Sum from 1 to " + sumN + " is " + sum);

        sc.close();
    }
}