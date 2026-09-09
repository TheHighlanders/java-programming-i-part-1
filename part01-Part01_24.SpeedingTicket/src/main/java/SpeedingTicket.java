/*
 * 24. Speeding Ticket
 *
 * Lesson: https://java-programming.mooc.fi/part-1/6-conditional-statements/
 *
 * Write a program that asks the user for an integer and prints the string
 * "Speeding ticket!" if the input is greater than 120.
 *
 * Example run (you type the lines marked >):
 *     Give speed:
 *   > 15
 *
 * Example run:
 *     Give speed:
 *   > 135
 *     Speeding ticket!
 */


import java.util.Scanner;

public class SpeedingTicket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here. 
        System.out.println("Give speed: ");
        int number = Integer.valueOf(scanner.nextLine());

        System.out.println(""); // Empty line
        if (number > 120) {
            System.out.println("Speeding ticket!");
        } 
    }
}
