import java.util.Scanner;

public class ShowStudentCarondoy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the name of the student
        System.out.print("Enter the name of the student: ");
        String name = scanner.nextLine();

        // Create a Student object with the provided name
        StudentCarondoy student = new StudentCarondoy(name);

        // Input loop
        int count = 0;
        int sum = 0;
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;

        System.out.println("Enter test scores for " + student.getName() + " (Enter 999 to finish):");
        while (true) {
            int score = scanner.nextInt();
            if (score == 999) {
                break;
            }
            if (score < 0 || score > 100) {
                System.out.println("Invalid score. Score should be between 0 and 100.");
                continue;
            }
            count++;
            sum += score;
            if (score > highest) {
                highest = score;
            }
            if (score < lowest) {
                lowest = score;
            }
        }

        // Calculate average
        double average = (count == 0) ? 0 : (double) sum / count;

        // Set values in the Student object
        student.setNumScores(count);
        student.setHighestScore(highest);
        student.setLowestScore(lowest);
        student.setAverageScore(average);

        // Display results
        System.out.println("Number of scores: " + student.getNumScores());
        System.out.println("Highest score: " + student.getHighestScore());
        System.out.println("Lowest score: " + student.getLowestScore());
        System.out.println("Average score: " + student.getAverageScore());

        scanner.close();
    }
}