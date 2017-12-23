*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gradebook: jweldgen2014, Sabuzamel2015 Mchirava, Agruber2014,
 *  Ksheikh2015
 */
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

   static double[] gradesArray;

   public static void main(String[] args) {
      String[] studentsArray = null;
      String[] AssignmentsArray;
      String[] AssignmentsNameArray = null; //John Newman from Engineering east corrected this to set the array to null.

      Scanner input = new Scanner(System.in);
      Boolean continueLoop = false;
      do {
         try {
            System.out.println("How many Students do you have?");
            int ARRAY_LENGTH = input.nextInt();
            //creates 3 arrays for grades, students, and assignments
            gradesArray = new double[ARRAY_LENGTH];
            studentsArray = new String[ARRAY_LENGTH];
            AssignmentsArray = new String[ARRAY_LENGTH];

            for (int student = 0; student < studentsArray.length; student++) {
               System.out.println("Enter the name of the student : ");
               for (student = 0; student < gradesArray.length; student++) {
                  studentsArray[student] = input.next() + " ";
               }
               System.out.printf("How many assignments : ");

               int assignmentNUMBER = input.nextInt();
               AssignmentsNameArray = new String[assignmentNUMBER];//Sets the size of the assignment array

               for (int assignment = 0; assignment < assignmentNUMBER; assignment++) {
                  System.out.println("Name of assignment is : ");
                  AssignmentsNameArray[assignment] = input.next() + " ";
               }

               System.out.println("Enter the students grades : ");
               for (student = 0; student < gradesArray.length; student++) {
                  System.out.println("Student " + (studentsArray[student]));
                  gradesArray[student] = input.nextDouble();
               }
               System.out.println("Enter grades: ");
            }
            GradeBook myGradeBook = new GradeBook("grades", gradesArray);
            System.out.printf("Grade book for class A ");
            myGradeBook.processGrades();
            for (int i = 0; i < gradesArray.length; i++) {
               System.out.println("This student is " + "\n" + studentsArray[i] + ", their grade is " + gradesArray[i]);
            }
            System.out.println("THE ASSIGNMENTS ARE" + Arrays.toString(AssignmentsNameArray));
            //FileWriter writer = FileWriter (GradeBook.csv);
         } catch (InputMismatchException inputMismatchException) {
            System.err.printf("%nException: %s%n",
                    inputMismatchException);
            input.nextLine(); // discard input so user can try again 
            System.out.printf("Invaild response. Please try again.%n%n");
         }

         //System.out.println("Do you want to continue, True false");
         //String match = input.next();
         //if (match!="True" || match!="true"){ //this loop took 2 hours to create
         // continueLoop=false;
      } while (continueLoop = false);
      //this writes the arrays to an csv file
      try {
         PrintWriter pw = new PrintWriter(new File("gradebook.csv"));
         StringBuilder sb = new StringBuilder();
         sb.append("NAME");
         sb.append(',');
         sb.append(Arrays.toString(studentsArray));
         sb.append('\n');
         sb.append("ASSIGNMENT");
         sb.append(',');
         sb.append(Arrays.toString(AssignmentsNameArray));
         sb.append('\n');
         sb.append("GRADE");
         sb.append(',');
         sb.append(Arrays.toString(gradesArray));
         sb.append('\n');
         sb.append('\n');
        

         // sb.append(gradesArray);
         pw.write(sb.toString());
         pw.close();
      } catch (FileNotFoundException fileNotFoundException) {
         System.err.println("Error opening file. Terminating.");
         System.exit(1);
      } // terminate the program   

   }
}
