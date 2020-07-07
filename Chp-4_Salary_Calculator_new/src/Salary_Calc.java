/************************************************************/
/*Program:  Salary Calculator                                           */
/*CIS163AA                                                                                                */
/*Greyson Gundrum                                                                                              */
/*06/15/20                                                                                                           */
/*Calculate gross payment of employee                                                               */
/************************************************************/
import java.util.Scanner;

public class Salary_Calc {
    static double wage;
    static double hoursworked;
    static double salary;
    static String fullname;
    static double overtimeworked;
    static int employeecount = 0;

    public static void main (String[] args) {

       while (employeecount < 3 ) { //This loops for the required number of employees. 3 employees total.
           Scanner input = new Scanner(System.in);
           System.out.print("Enter the Employees Name: ");
           fullname = input.nextLine(); //Takes user input for employee fullname
           System.out.print("Enter the hours worked: ");
           hoursworked = input.nextDouble(); //Takes user input for employee hoursworked
           System.out.print("Enter the hourly wage: ");
           wage = input.nextDouble(); //Takes user input for employee wage
           if (hoursworked <= 40.00) { //Determines if there are overtime hours worked
               salary = wage * hoursworked;
           } else {
               overtimeworked = hoursworked - 40; //Differentiates overtime hours from regular hours.
               salary = (wage * hoursworked) + (wage * overtimeworked * 1.5); //calculates overtime pay + regularp ay
           }
           System.out.printf("%s's salary is $%,.2f, and he worked %,.2f hours. %n", fullname, salary, hoursworked); //outputs information to user.
           employeecount++; //Cycles for the next employee record.
       }
    }
}