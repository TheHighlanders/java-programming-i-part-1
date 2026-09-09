/*
 * 20. Multiplication formula
 *
 * Lesson: https://java-programming.mooc.fi/part-1/5-calculating/
 *
 * Similar to the previous exercise, create a program that multiplies the
 * values stored in two integer variables.
 *
 * For instance, if the entered numbers are 2 and 8, the program should print
 * the following:
 *
 * Example run (you type the lines marked >):
 *     Give the first number:
 *   > 2
 *     Give the second number:
 *   > 8
 *     2 * 8 = 16
 *
 * Likewise, if the entered numbers are 277 and 111, the print should be the
 * following:
 *
 * Example run:
 *     Give the first number:
 *   > 277
 *     Give the second number:
 *   > 111
 *     277 * 111 = 30747
 */


import java.util.Scanner;

public class MultiplicationFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int firstNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int secondNumber = Integer.valueOf(scanner.nextLine());
        System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));

    }
}
