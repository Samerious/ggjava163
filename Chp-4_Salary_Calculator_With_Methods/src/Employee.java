import java.util.Scanner;
public class Employee {
    //Pseudo Code
    //Create a class that holds the employee data and attributes
    //This should have an attribute for Firstname, Lastname, and Salary
    //Create a method to determine overtimehours
    //Create a method to get and set Firstname
    //Create a method to get and set lastname
    //create a method to get and set Salary

    private String fullname;
    private double wage;
    private double hoursworked;

    public Employee(String fullname,double hoursworked, double wage){
        this.fullname = fullname;
        if (wage > 0.0) {
            this.wage = wage;
        }
    }

    public double getWage(){
        return wage;
    }
    public void setWage(){
        Scanner userinput = new Scanner(System.in);
        System.out.print("Enter the hours worked: ");
        wage = input.nextDouble();

    }
    public String getFullName(){
        return fullname;
    }
    public void setFullName(){
        Scanner userinput = new Scanner(System.in);
        System.out.print("Enter the Employees Name: ");
        fullname = input.nextLine();
    }

    public double getHoursWorked(){
        return hoursworked;
    }

    public void setHoursWorked(){
        Scanner userinput = new Scanner(System.in);
        System.out.print("Enter the hours worked: ");
        hoursworked = input.nextDouble();
    }
Employee employee1 = new Employee(getFullName(),getHoursWorked(),getWage());
}
