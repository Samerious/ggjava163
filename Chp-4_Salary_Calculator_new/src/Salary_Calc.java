import java.util.Scanner;

public class Salary_Calc {
    static double wage;
    static double hoursworked;
    static double salary;

    public static void main (String[] args) {
       Scanner input = new Scanner(System.in);

       System.out.print("Enter the hours worked: ");
       wage = input.nextInt();
       System.out.print("Enter the hourly wage: ");
       hoursworked = input.nextInt();

       double salary = wage * hoursworked;
       System.out.printf ("Salary is $%,.2f%n",salary);
    }
}