/* NAME: Liza Carondoy
   DATE: February 15, 2023
   Activity: 3 (MIDTERM) */
   
import java.util.Scanner;

public class ShowStudentCarondoy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentCarondoy student = new StudentCarondoy();
        
      
        System.out.print("Enter student's ID number: ");
        int idNumber = scanner.nextInt();
        student.setIdNumber(idNumber);

        System.out.print("Enter number of credit hours earned: ");
        int creditHoursEarned = scanner.nextInt();
        student.setCreditHoursEarned(creditHoursEarned);

        System.out.print("Enter number of points earned: ");
        int pointsEarned = scanner.nextInt();
        student.setPointsEarned(pointsEarned);
        
        student.calculateGPA();
        student.displayStudentInfo();


      // newly added
        
        int count = 0;
        int sum = 0;
        
        System.out.println("Enter test scores (Enter 999 to finish):");
        
        // Initialize highest and lowest with the first score entered
        int score = scanner.nextInt(); // prompts the user to enter test scores.
        int highest = score;
        int lowest = score; //These lines initialize variables highest and lowest with the first score entered, assuming it's both the highest and lowest until proven otherwise.

        
        while (score != 999) {   // ga indicate sad sya ma end ang input if 999.
            
            if (score < 0 || score > 100) {  // logical or operator ang || 
                System.out.println("Invalid score. It should be between 0 and 100.");
            } else {
                count++; //count the valid score.
                sum += score;  // sum of all valid scores entered.
                
           if (score > highest) {  // compare scores
             highest = score;
           }
           if (score < lowest) {
              lowest = score;
           }
       }
          score = scanner.nextInt();
      }

        // Calculate average
        double average;
         if (count == 0) {
             average = 0;
         } else {
         average = (double) sum / count; 
         }

        student.setNumScores(count);
        student.setHighestScore(highest);
        student.setLowestScore(lowest);
        student.setAverageScore(average);
        
        System.out.println("Number of scores: " + student.getNumScores());
        System.out.println("Highest score: " + student.getHighestScore());
        System.out.println("Lowest score: " + student.getLowestScore());
        System.out.println("Average score: " + student.getAverageScore());

        }
}
