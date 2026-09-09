/*
 * 33. Password
 *
 * Lesson: https://java-programming.mooc.fi/part-1/6-conditional-statements/
 *
 * Write a program that prompts the user for a password. If the password is
 * "Caput Draconis" the program prints "Welcome!". Otherwise, the program
 * prints "Off with you!"
 *
 * Example run (you type the lines marked >):
 *     Password?
 *   > Wattlebird
 *     Off with you!
 *
 * Example run:
 *     Password?
 *   > Caput Draconis
 *     Welcome!
 */


import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here 
        System.out.println("Password?");
        String passWord = scan.nextLine();

        if (passWord.equals("Caput Draconis")) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }
    }
}
