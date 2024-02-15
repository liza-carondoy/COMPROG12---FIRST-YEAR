/* NAME: Liza Carondoy
  DATE: February 15, 2024
  Activity: #5 */

public class StudentCarondoy {
    private int idNumber;
    private int creditHoursEarned;
    private int pointsEarned;
    private double gradePointAverage;

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public void setCreditHoursEarned(int creditHoursEarned) {
        this.creditHoursEarned = creditHoursEarned;
    }

    public void setPointsEarned(int pointsEarned) {
        this.pointsEarned = pointsEarned;
    }

   //Method to compute the grade point average
    public void computeGPA() {
        if (creditHoursEarned != 0) {
            gradePointAverage = (double) pointsEarned / creditHoursEarned; // To compute the grade point average field by dividing points with credit hours earned.
        } else {
            gradePointAverage = 0.0; // Handle division by zero
        }
    }

    public void displayStudentInfo() {
        System.out.println("ID Number: " + idNumber);
        System.out.println("Credit Hours Earned: " + creditHoursEarned);
        System.out.println("Points Earned: " + pointsEarned);
        System.out.println("Grade Point Average: " + gradePointAverage);
    }
}