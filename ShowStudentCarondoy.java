/* NAME: Liza Carondoy
  DATE: February 15, 2024
  Activity: #5 */
  
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

        student.computeGPA();

        System.out.println("\nStudent Information:");
        student.displayStudentInfo();
    }
}