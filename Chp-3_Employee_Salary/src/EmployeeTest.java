/************************************************************/
/*Program:  Employee Class                                              */
/*CIS163AA                                                                                                */
/*Greyson Gundrum                                                                                              */
/*06/14/20                                                                                                         */
/*Define employees and give them a raise!!!                                                                         */
/************************************************************/
public class EmployeeTest {
    public static void main(String[] args) {
            Employee employee1 = new Employee("Bob", "Dohl", 1000000); //Employee Test 1
            Employee employee2 = new Employee("Cindy", "Crawford", 2000000); //Employee Test 2


            System.out.printf("%s %s Salary: $%.2f%n%n", //Prints firstname variable, lastname variable, and salary
                    employee1.getFirstName(), employee1.getLastName(), employee1.getSalary());

            System.out.printf("%s %s Salary: $%.2f%n%n",
                employee2.getFirstName(), employee2.getLastName(), employee2.getSalary());

            double raise = .10; //Dictates raise amount

            employee1.raise(raise); //Actually give them the raise
            employee2.raise(raise);

        System.out.printf("%s %s Salary: $%.2f%n%n", //prints salary after raise
                employee1.getFirstName(), employee1.getLastName(), employee1.getSalary());

        System.out.printf("%s %s Salary: $%.2f%n%n",
                employee2.getFirstName(), employee2.getLastName(), employee2.getSalary());
    }
}
