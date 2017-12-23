/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gradebook: jweldgen2014, Sabuzamel2015 Mchirava, Agruber2014, 
 *  Ksheikh2015
 */
public class Assignment { //this is from the TEXTBOOK 267-271
 
  private String assignmentName;
  
  private double [] assignments;
  
  public static float percentage; 
  
  public Assignment(String courseName,
            double [] grades
    ) {
        this.assignmentName = courseName;
        this.assignments = assignments;
    }
// method to set the course name

    public void setassignmentName(String courseName) {
        this.assignmentName = courseName;
    }
// method to retrieve the course name

    public String getassignmentName() {
        return assignmentName;
    }
// perform various operations on the data

    public void processassignment() {
// output grades array
        outputAssignments();
// call method getAverage to calculate the average grade
        System.out.printf("%nClass average is %.2f%n",
                getAverage());
    }
	public double getAverage() 
        {double total = 0; 
       	// sum grades for one student 
       	for (double grade : assignments) 
        	total += grade;
                // return average of grades 
                return (double) total / assignments.length;
        }
        public void outputGrades(){
            System.out.printf("The grades are:%n%n");
            
            for (int student = 0; student < assignments.length; student++)
                System.out.printf("Student %2d: %3f%n",
                        student + 1, assignments[student]);
            //for (int assignment = 0; assignments > student.length; assignment++)
                System.out.printf( "assignment %");
               }

   private void outputAssignments() {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }
  
}
