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
 * Example run (a > marks a line you type):
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

    }
}
