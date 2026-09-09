/*
 * 31. Grades and Points
 *
 * Lesson: https://java-programming.mooc.fi/part-1/6-conditional-statements/
 *
 * The table below describes how the grade for a particular course is
 * determined. Write a program that gives a course grade according to the
 * provided table.
 *
 * | points | grade       |
 * | ------ | ----------- |
 * | < 0    | impossible! |
 * | 0-49   | failed      |
 * | 50-59  | 1           |
 * | 60-69  | 2           |
 * | 70-79  | 3           |
 * | 80-89  | 4           |
 * | 90-100 | 5           |
 * | > 100  | incredible! |
 *
 * Example run (you type the lines marked >):
 *     Give points [0-100]:
 *   > 37
 *     Grade: failed
 *
 * Example run:
 *     Give points [0-100]:
 *   > 76
 *     Grade: 3
 *
 * Example run:
 *     Give points [0-100]:
 *   > 95
 *     Grade: 5
 *
 * Example run:
 *     Give points [0-100]:
 *   > -3
 *     Grade: impossible!
 */


import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give points [0-100]: ");
        int points = Integer.valueOf(scan.nextLine());
        
        System.out.print("Grade: ");
        if (points < 0) {
            System.out.println("impossible!");
        } else if (points < 50) {
            System.out.println("failed");
        } else if (points < 60) {
            System.out.println("1");
        } else if (points < 70) {
            System.out.println("2");
        } else if (points < 80) {
            System.out.println("3");
        } else if (points < 90) {
            System.out.println("4");
        } else if (points < 101) {
            System.out.println(5);
        } else {
            System.out.println("incredible!");
        }    
    }
}
