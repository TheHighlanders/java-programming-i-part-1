/*
 * 12. Integer Input
 *
 * Lesson: https://java-programming.mooc.fi/part-1/4-variables/
 *
 * Write a program that asks the user for a value. The program should then
 * print the value provided by the user.
 *
 * Here's a couple of examples:
 *
 * Example run (you type the lines marked >):
 *     Give a number:
 *   > 3
 *     You gave the number 3
 *
 * Example run:
 *     Give a number:
 *   > 42
 *     You gave the number 42
 */


import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        System.out.println("Give a number:");
        int number = Integer.valueOf(scanner.nextLine());
        System.out.println("You gave the number " + number);

    }
}
