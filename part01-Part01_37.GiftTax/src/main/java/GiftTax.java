/*
 * 37. Gift tax
 *
 * Lesson: https://java-programming.mooc.fi/part-1/6-conditional-statements/
 *
 * https://www.vero.fi/en/individuals/property/gifts/
 * (https://www.vero.fi/en/individuals/property/gifts/): A gift is a transfer
 * of property to another person against no compensation or payment. If the
 * total value of the gifts you receive from the same donor in the course of
 * 3 years is €5,000 or more, you must pay gift tax.
 *
 * When a gift is given by a close relative or a family member, the amount of
 * gift tax is determined by the following table (source vero.fi
 * (https://www.vero.fi/en/individuals/property/gifts/gift-tax-
 * calculator/#gifttaxtables)):
 *
 * | Value of gift        | Tax at the lower limit    | Tax rate(%) for exceeding part  |
 * | -------------------- | ----------------------    | ------------------------------  |
 * | 5 000 -- 25 000      | 100                       | 8                               |
 * | 25 000 -- 55 000     | 1 700                     | 10                              |
 * | 55 000 -- 200 000    | 4 700                     | 12                              |
 * | 200 000 -- 1 000 000 | 22 100                    | 15                              |
 * | 1 000 000 --         | 142 100                   | 17                              |
 *
 * For example 6000€ gift implies 180€ of gift tax (100 + (6000-5000) *
 * 0.08), and 75000€ gift implies 7100€ of gift tax (4700 + (75000-55000) *
 * 0.12).
 *
 * Write a program that calculates the gift tax for a gift from a close
 * relative or a family member. This is how the program should work:
 *
 * Example run (you type the lines marked >):
 *     Value of the gift?
 *   > 3500
 *     No tax!
 *
 * Example run:
 *     Value of the gift?
 *   > 5000
 *     Tax: 100.0
 *
 * Example run:
 *     Value of the gift?
 *   > 27500
 *     Tax: 1950.0
 */


import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int valueOfGift = Integer.valueOf(scan.nextLine());
        if(valueOfGift < 5000) {
            System.out.println("No Tax!");
            
        } else if (valueOfGift >= 5000 && valueOfGift < 25000) {
            // Tax at the lower limit 100 euros, tax rate 8
            double tax = 100 + (valueOfGift - 5000) * 0.08;
            System.out.println("Tax: " + tax);
            
        } else if (valueOfGift >= 25000 && valueOfGift < 55000) {
            // Tax at the lower limit 1700 euros, tax rate 10
            double tax = 1700 + (valueOfGift - 25000) * 0.10;
            System.out.println("Tax: " + tax);
            
        } else if (valueOfGift >= 55000 && valueOfGift < 200000) {
            // Tax at the lower limit 4700 euros, tax rate 12
            double tax = 4700 + (valueOfGift - 55000) * 0.12;
            System.out.println("Tax: " + tax);
            
        } else if (valueOfGift >= 200000 && valueOfGift < 1000000) {
            // Tax at the lower limit 22100 euros, tax rate 15
            double tax = 22100 + (valueOfGift - 200000) * 0.15;
            System.out.println("Tax: " + tax);

        } else {
            // miljoona tai yli
            // Tax at the lower limit142100 euros, tax rate 17
            double tax = 142100 + (valueOfGift - 1000000) * 0.17;
            System.out.println("Tax: " + tax);
            
        }
    }
}
