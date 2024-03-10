/* Name: Liza Carondoy
   Midterm Activity #3 */

class StudentCarondoy {
    private String name;
    private int numScores;
    private int highestScore;
    private int lowestScore;
    private double averageScore;

    // Constructor
    public StudentCarondoy(String name) {
        this.name = name;
    }

    // Accessor methods (getters and setters)
    public String getName() {
        return name;
    }

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
}
