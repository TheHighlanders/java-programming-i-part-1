/*
 * 34. Same
 *
 * Lesson: https://java-programming.mooc.fi/part-1/6-conditional-statements/
 *
 * Write a program that prompts the user for two strings. If the strings are
 * the same, then the program prints "Same". Otherwise, it prints
 * "Different".
 *
 * Example run (you type the lines marked >):
 *     Enter the first string:
 *   > hello
 *     Enter the second string:
 *   > hello
 *     Same
 *
 * Example run:
 *     Enter the first string:
 *   > hello
 *     Enter the second string:
 *   > world
 *     Different
 */


import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here. 
        System.out.println("Enter the first string: ");
        String first = scan.nextLine();
        System.out.println("Enter the second string: ");
        String second = scan.nextLine();

        if (first.equals(second)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}
