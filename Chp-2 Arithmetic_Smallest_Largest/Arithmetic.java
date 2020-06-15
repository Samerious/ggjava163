/************************************************************/
/*Program:  Chp-2_Arithmetic_Smallest_Largest                 */
/*CIS163AA                                                                                                */
/*Greyson Gundrum
/*06/08/20
/* Application that inputs three integers from the user and
/* displays the sum, average,product,smallest and largest of
/* of the numbers
 */
/************************************************************/

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer:");
        int number1 = input.nextInt();

        System.out.print("Enter second integer:");
        int number2 = input.nextInt();

        System.out.print("Enter third integer:");
        int number3 = input.nextInt();

        int sum = number1 + number2 + number3;
        System.out.printf("The sum of the numbers is: %d\n", sum);

        int average = sum / 3;
        System.out.printf("The average of the numbers is: %d\n", average);

        int product = number1 * number2 * number3;
        System.out.printf("The product of the numbers is: %d\n", product);

        if (number1 > number2 && number1 > number3) {
            System.out.printf("The largest number is: %d\n", number1);
        }

        if (number2 > number1 && number2 > number3) {
            System.out.printf("The largest number is: %d\n", number2);
        }

        if (number3 > number1 && number3 > number2) {
            System.out.printf("The largest number is: %d\n", number3);
        }
        if (number1 < number2 && number1 < number3) {
            System.out.printf("The smallest number is: %d\n", number1);
        }

        if (number2 < number1 && number2 < number3) {
            System.out.printf("The smallest number is: %d\n", number2);
        }

        if (number3 < number1 && number3 < number2) {
            System.out.printf("The smallest number is: %d\n", number3);
        }
    }
}