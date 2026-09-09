/*
 * 08. Greeting
 *
 * Lesson: https://java-programming.mooc.fi/part-1/3-reading/
 *
 * Write a program that prompts the user for their name with the message
 * "What's your name?". When the user has written their name, the program has
 * to print "Hi " followed by the user's name.
 *
 * Example output when user gives the name Ada.
 *
 * Example run (you type the lines marked >):
 *     What's your name?
 *   > Ada
 *     Hi Ada
 *
 * Example output when user gives the name Lily.
 *
 * Example run:
 *     What's your name?
 *   > Lily
 *     Hi Lily
 */


import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("What's your name?");
        
        String name = scanner.nextLine();
        System.out.println("Hi " + name);

    }
}
