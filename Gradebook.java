// Fig. 7.14: GradeBook.java
// GradeBook class using an array to store test grades.

/*Gradebook: jweldgen2014, Sabuzamel2015 Mchirava, Agruber2014, 
 Ksheikh2015*/
public class GradeBook {//this is from the TEXTBOOK 267-271

   public double[] getGrades() {
      return grades;
   }

   public void setGrades(double[] grades) {
      this.grades = grades;
   }

   private double[] grades; // array of student grades

   // constructor
   public GradeBook(String courseName,
           double[] grades
   ) {

      this.grades = grades;
   }

   public void processGrades() {
// output grades array
      outputGrades();
// call method getAverage to calculate the average grade and standard deviation
      System.out.printf("%nClass average is %.2f%n",
              getAverage());
      System.out.printf("%nClass standard deviation is %.2f%n", getSTD());

   }

   public double getAverage() //calculates the average
   {
      double total = 0;
      // sum grades for one student 
      for (double grade : grades) {
         total += grade;
      }
      // return average of grades 
      return (double) total / grades.length;
   }

   public double getSTD() {//gets the standard deviation 
      double average = 0;
      double sd = 0;
      for (double grade : grades) {
         average += grade;
      }
      for (int i = 1; i < grades.length; i++) {
         sd += Math.pow((grades[i] - average), 2);
      }
      sd = sd / grades.length;
      double standardDeviation = Math.sqrt(sd);
      return standardDeviation;
   }

   public void outputGrades() {//prints the grades
      System.out.printf("The grades are:%n%n");

      for (int student = 0; student < grades.length; student++) {
         System.out.printf("Student %2d: %3f%n", student + 1, grades[student]);
      }

   }

}
