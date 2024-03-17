/* NAME: Liza Carondoy
   DATE: February 15, 2023
   Activity: 3 (MIDTERM) */
   
public class StudentCarondoy {
    private int idNumber;
    private int creditHoursEarned;
    private int pointsEarned;
    private double gradePointAverage;
    private String name;
    private int numScores;
    private int highestScore;
    private int lowestScore;
    private double averageScore;

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public void setCreditHoursEarned(int creditHoursEarned) {
        this.creditHoursEarned = creditHoursEarned;
    }

    public void setPointsEarned(int pointsEarned) {
        this.pointsEarned = pointsEarned;
    }

    public void calculateGPA() {
        if (creditHoursEarned != 0) {
            gradePointAverage = (double) pointsEarned / creditHoursEarned;
        } else {
            gradePointAverage = 0.0; // Handle division by zero
        }
    }

    // Accessor methods (getters and setters)

    public void setNumScores(int numScores) {
        this.numScores = numScores;
    }

    public void setHighestScore(int highestScore) {
        this.highestScore = highestScore;
    }

    public void setLowestScore(int lowestScore) {
        this.lowestScore = lowestScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public int getNumScores() {
        return numScores;
    }

    public int getHighestScore() {
        return highestScore;
    }

    public int getLowestScore() {
        return lowestScore;
    }

    public double getAverageScore() {
        return averageScore;
    }
    public void displayStudentInfo() {
        System.out.println("Grade Point Average: " + gradePointAverage);
    }
}
