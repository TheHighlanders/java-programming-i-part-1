/*
 * 22. Average of three numbers
 *
 * Lesson: https://java-programming.mooc.fi/part-1/5-calculating/
 *
 * Write a program that asks the user for three integers and prints their
 * average.
 *
 * Example run (you type the lines marked >):
 *     Give the first number:
 *   > 8
 *     Give the second number:
 *   > 2
 *     Give the third number:
 *   > 3
 *     The average is 4.333333333333333
 *
 * Example run:
 *     Give the first number:
 *   > 9
 *     Give the second number:
 *   > 5
 *     Give the third number:
 *   > -1
 *     The average is 4.333333333333333
 */


import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int firstNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int secondNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        int thirdNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("The average is " + (1.0 * firstNumber + secondNumber + thirdNumber) / 3);

    }
}
