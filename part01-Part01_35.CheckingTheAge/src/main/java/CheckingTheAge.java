/*
 * 35. Checking the age
 *
 * Lesson: https://java-programming.mooc.fi/part-1/6-conditional-statements/
 *
 * Write a program that prompts the user to input their age and checks
 * whether or not it is possible (at least 0 and at most 120). Only use a
 * single `if`-command in your program.
 *
 * The program should print:
 *     How old are you? 10
 *     OK
 *
 * The program should print:
 *     How old are you? 55
 *     OK
 *
 * The program should print:
 *     How old are you? -3
 *     Impossible!
 *
 * The program should print:
 *     How old are you? 150
 *     Impossible!
 */


import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("How old are you? ");
        int age = Integer.valueOf(scan.nextLine());
        if (age >= 0 && age <= 120) {
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }
    }
}
