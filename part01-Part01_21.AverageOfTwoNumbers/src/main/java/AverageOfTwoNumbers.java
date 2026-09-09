/*
 * 21. Average of two numbers
 *
 * Lesson: https://java-programming.mooc.fi/part-1/5-calculating/
 *
 * Write a program that asks the user for two integers and prints their
 * average.
 *
 * Example run (you type the lines marked >):
 *     Give the first number:
 *   > 8
 *     Give the second number:
 *   > 2
 *     The average is 5.0
 */


import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int firstNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int secondNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("The average is " + (1.0 * firstNumber + secondNumber) / 2);

    }
}
