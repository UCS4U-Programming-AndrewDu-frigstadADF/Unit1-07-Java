/** learning 2d arrays by randomly generating grades for students
 * 
 * Author Andrew Du-frigstad
 * version 1
 * since   2022-04-07
 * */

// imports
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.io.File;
import java.lang.Math;

class ClassMarks {

    // function to generate the marks for the array
    public static String[][] generateMarks(String[] studentArray, String[] assignmentArray) {

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
                mark = Math.round(mark);

                // putting mark as string into array
                finalArray[stuIndex][assignIndex] = Double.toString(mark);
            }
        }
        return finalArray;
    }

    public static void main(String[] args) throws Exception {

        // delcaring variables
        ArrayList<String> stuTxtList = new ArrayList<String>();
        ArrayList<String> assignTxtList = new ArrayList<String>();

        // reading the text file
        File studentArray = new File("C:\\Users\\andye\\Downloads\\students.txt");
        File assignmentArray = new File("C:\\Users\\andye\\Downloads\\assignments.txt");

        // scanners
        Scanner assignArray = new Scanner(assignmentArray);
        Scanner stuArray = new Scanner(studentArray);

        // make a list with the scanner
        while (stuArray.hasNextLine()) {
            String students = stuArray.nextLine();
            stuTxtList.add(students);
            System.out.println("Added student: " + students);
        }

        // make a list with the scanner
        while (assignArray.hasNextLine()) {
            String assignments = assignArray.nextLine();
            assignTxtList.add(assignments);
            System.out.println("Added assignment: " + assignments);
        }

        // converting the list to an array
        String[] arrayOfStudents = stuTxtList.toArray(new String[stuTxtList.size()]);
        String[] arrayOfAssignments = assignTxtList.toArray(new String[assignTxtList.size()]);

        // calling the generateMarks function for the final array
        String[][] finalArray = generateMarks(arrayOfStudents, arrayOfAssignments);

        // printing out the marks
        for (String[] arrayStu : finalArray) {
            for (int i = 0; i < arrayStu.length; i++) {

                System.out.print(arrayStu[i] + ", ");

            }
            System.out.println("");
        }

    }
}