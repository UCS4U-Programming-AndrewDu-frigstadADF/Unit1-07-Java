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
import java.util.Random;

class ClassMarks {

    // function to generate the marks for the array
    public String[][] generateMarks(String[] studentArray, String[] assignmentArray) {

        // declaring Random object
        Random random = new Random();
        double mark;

        // array with everything in it
        String[][] finalArray = new String[studentArray.length][assignmentArray.length + 1];

        // for every student generate a mark for every assignment
        for (int stuIndex = 0; stuIndex < studentArray.length; stuIndex++) {

            // copy the student name to the array
            finalArray[stuIndex][0] = studentArray[stuIndex];
            

            // for every assignment generate a mark
            for (int assignIndex = 1; assignIndex < assignmentArray.length + 1; assignIndex++) {

                // generating the marks with a derivative of 10
                mark = random.nextGaussian() * 10 + 75;


                // putting mark as string into array
                finalArray[stuIndex][assignIndex] = Double.toString(mark);
            }
        }

        System.out.println(finalArray);

        return finalArray;
    }

    public static void main(String[] args) {

        // delcaring variables
        ArrayList<String> txtList = new ArrayList<String>();
        int checkingInt = -1;

        // reading the text file
        File studentArray = new File(".\\students.txt");
        File assignmentArray = new File(".\\assignments.txt");

    }

}
