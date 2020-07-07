/************************************************************/
/*Program:  Recursion Assignment                                                                                                           */
/*CIS163AA                                                                                                                                 */
/*Greyson Gundrum                                                                                                                          */
/*07/07/20                                                                                                                                 */
/*Print triangle pre-determined triangle patterns using for loops.                                                                         */
/************************************************************/

public class Triangle_Print {
    public static void main (String[] args) { //Setting up void triangle print as we are not returning anything.
        int currentstars = 1; //Using currentstars as the variable to dictate for how many stars to display
        for (int rows = 0; rows < 10; rows++ ) { // This sets a pre-determined amount of rows. We have 10 rows in all of our patterns so this work ok! This wraps around the patterns so that we can for loop for each pattern.
            for (int i = 1; i <= currentstars; i++ ) { // Our first row in the first pattern is a single star. We then want to add a single star to each row as we go down.
                System.out.print('*');
            }
            currentstars++; //This counter adds one star per iteration of the loop.
            System.out.println(); //This allow us to go to the next line to print the next amount of stars.
        }
        System.out.println(); //I put this here so the patterns are easily split. I'm not sure if I should take it out or not, but it easily allows you to distinguish between the 4 paterns.
        currentstars = 10;  //The next pattern (B) starts with 10 stars on top!
        for (int rows = 0; rows <= 10; rows++ ) { //Reused from previous this just is a fixed number of rows.
            for (int i = 0; currentstars > i; i++ ) { // We set the for loop to print out a * 10 times because the top row is 10 stars.
                System.out.print('*');
            }
            currentstars--; //We remove 1 star from the count. As the next line will be 1 less star than the previous
            System.out.println();
        }
        int space = 0; //We set a variable for space as we need to determine the amount of space each pattern will need.
        currentstars = 10; //This is the number of stars in the top row of pattern C
        for (int rows = 0; rows <= 10; rows++ ) { // Fixed 10 rows.
            for (int i = 0; i < space; i++) { //Space is going to increment by 1 each row we print. This allows the pattern triangle to develop.
                System.out.print(' '); //Actually prints the space.
            }
            for (int i = 0; i < currentstars; i++) { //This for loop controls the amount of stars we are printing.
                System.out.print('*'); //Actually prints the star
            }
            currentstars--; //We decrement stars per row.
            space++; //We increase stars per row.
            System.out.println(); //This prints a new line to move to the next row.
        }

        space = 10; //We set the predetermine amount of space. This was extrapolated from the fact that we have stars
        currentstars = 1; //The first row in pattern (D) is 1 star. So we print 1 star.
        for (int rows = 0; rows < 10; rows++ ) { // predetermined amount of rows.
            for (int i = 1; i < space; i++) { // Foor loop for amount of space to print.
                System.out.print(' '); // Actually print the space.
            }
            for (int i = 0; i < currentstars; i++) { //For loop for the amount of stars to print.
                System.out.print('*'); //Actually print the stars.
            }
            currentstars++; //The next line will have one more star.
            space--; //The next line will have one less space.
            System.out.println();
        }

    }
}
