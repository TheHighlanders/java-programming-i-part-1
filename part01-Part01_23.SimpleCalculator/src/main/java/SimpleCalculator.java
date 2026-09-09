/*
 * 23. Simple calculator
 *
 * Lesson: https://java-programming.mooc.fi/part-1/5-calculating/
 *
 * Write a program that asks the user for two numbers and prints their sum,
 * difference, product, and quotient. Two examples of the execution of the
 * program are given below.
 *
 * Example run (you type the lines marked >):
 *     Give the first number:
 *   > 8
 *     Give the second number:
 *   > 2
 *     8 + 2 = 10
 *     8 - 2 = 6
 *     8 * 2 = 16
 *     8 / 2 = 4.0
 *
 * Example run:
 *     Give the first number:
 *   > 9
 *     Give the second number:
 *   > 2
 *     9 + 2 = 11
 *     9 - 2 = 7
 *     9 * 2 = 18
 *     9 / 2 = 4.5
 */


import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        System.out.println(first + " + " + second + " = " + (first + second));
        System.out.println(first + " - " + second + " = " + (first - second));
        System.out.println(first + " * " + second + " = " + (first * second));
        System.out.println(first + " / " + second + " = " + (1.0 * first / second));

    }
}
