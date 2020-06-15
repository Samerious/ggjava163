import java.util.Scanner;

public class Salary_Calc {
    static double wage;
    static double hoursworked;
    static double salary;
    static String fullname;
    static double overtimeworked;

    public static void main (String[] args) {
       Scanner input = new Scanner(System.in);

       System.out.print("Enter the Employees Name: ");
       fullname = input.nextLine();
       System.out.print("Enter the hours worked: ");
       hoursworked = input.nextInt();
       System.out.print("Enter the hourly wage: ");
       wage = input.nextInt();
       if (hoursworked <= 40.00) {
           salary = wage * hoursworked;
       }
       else {
           overtimeworked = hoursworked - 40;
           salary = (wage * hoursworked) + (wage * overtimeworked * 1.5);
       }
       System.out.printf ("%s's salary is $%,.2f, and he worked %,.2f hours. %n ",fullname,salary,hoursworked);
    }
}