/*
 * 09. Conversation
 *
 * Lesson: https://java-programming.mooc.fi/part-1/3-reading/
 *
 * Write a program that works as follows:
 *
 * Example run (you type the lines marked >):
 *     Greetings! How are you doing?
 *   > Good thank you!
 *     Oh, how interesting. Tell me more!
 *   > Well, there's really nothing to tell.
 *     Thanks for sharing!
 *
 * Example run:
 *     Greetings! How are you doing?
 *   > Nice and dandy like cotton candy!
 *     Oh, how interesting. Tell me more!
 *   > Just went shopping.
 *     Thanks for sharing!
 */


import java.util.Scanner;

public class Conversation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Greetings! How are you doing?");
        String firstInput = scanner.nextLine();
        System.out.println("Oh, how interesting. Tell me more!");
        String secondInput = scanner.nextLine();
        System.out.println("Thanks for sharing!");

    }
}
