/** learning 2d arrays by randomly generating grades for students
 * 
 * Author Andrew Du-frigstad
 * version 1
 * since   2022-04-07
 * */

// imports
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class ClassMarks {

    // function to generate the marks for the array
    public static String[][] generateMarks(String[] studentArray, String[] assignmentArray) {

        // array with everything in it
        String[][] finalArray = new String[studentArray.length][assignmentArray.length + 1];

        // for every student generate a mark for every assignment
        for (int stuIndex = 0; stuIndex < studentArray.length; stuIndex = stuIndex + 1) {

            // string for the assignment with the student names
            String[] marks = new String[assignmentArray.length + 1];

            for (int assignIndex = 0; assignIndex < assignmentArray.length; assignIndex = assignIndex + 1) {

                // generating the marks with a derivative of 10
                marks = random.nextGaussian() * 10 + 75;
            }
        }

        return marks;
    }

    public static void main(String[] args) {

        // delcaring variables
        String st;
        ArrayList<String> txtList = new ArrayList<String>();
        int checkingInt = -1;

        // reading the text file
        File studentArray = new File("C:\\Users\\s278552\\Downloads\\students.txt");
        File assignmentArray = new File("C:\\Users\\s278552\\Downloads\\assignments.txt");

    }

}
