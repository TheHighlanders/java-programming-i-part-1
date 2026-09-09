/*
 * 15. Different Types of Input
 *
 * Lesson: https://java-programming.mooc.fi/part-1/4-variables/
 *
 * Write a program that asks the user for a string, an integer, a floating-
 * point number, and a boolean. The program should then print the values
 * given by the user.
 *
 * Example prints for the program can be seen below.
 *
 * Example run (you type the lines marked >):
 *     Give a string:
 *   > bye-bye
 *     Give an integer:
 *   > 11
 *     Give a double:
 *   > 4.2
 *     Give a boolean:
 *   > true
 *     You gave the string bye-bye
 *     You gave the integer 11
 *     You gave the double 4.2
 *     You gave the boolean true
 *
 * Example run:
 *     Give a string:
 *   > Oops!
 *     Give an integer:
 *   > -4
 *     Give a double:
 *   > 3200.1
 *     Give a boolean:
 *   > false
 *     You gave the string Oops!
 *     You gave the integer -4
 *     You gave the double 3200.1
 *     You gave the boolean false
 */


import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string: ");
        String string = scan.nextLine();
        System.out.println("Give an integer:");
        int integer = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double: ");
        double dbl = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean: ");
        boolean bool = Boolean.valueOf(scan.nextLine());

        System.out.println("You gave the string " + string);
        System.out.println("You gave the integer " + integer);
        System.out.println("You gave the double " + dbl);
        System.out.println("You gave the boolean " + bool);

    }
}
