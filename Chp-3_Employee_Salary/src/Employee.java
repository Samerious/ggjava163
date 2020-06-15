/************************************************************/
/*Program:  Employee Class                                              */
/*CIS163AA                                                                                                */
/*Greyson Gundrum                                                                                              */
/*06/14/20                                                                                                         */
/*Define employees and give them a raise!!!                                                                         */
/************************************************************/

public class Employee {
    private String firstname; //Declare variables
    private String lastname;
    private double salary;
    private double raise;

    public Employee(String firstname, String lastname, double salary){
        this.firstname = firstname;
        this.lastname = lastname;
        if (salary > 0.0) { //Verify salary is a positive number
            this.salary = salary;
        }

    }
    public double getSalary() { //get method for salary
        return salary;
    }

    public void setFirstName(String firstname) { //set method for firstname
        this.firstname = firstname;
    }

    public void setLastName(String lastname) { //set method for lastname
        this.lastname =lastname;
    }

    public String getFirstName() { //get method for firstname
        return firstname;
    }
    public String getLastName() { //get method for lastname
        return lastname;
    }

    public void raise(double raiseAmount){ //raise set method
        salary = salary * raiseAmount + salary;
    }
}
