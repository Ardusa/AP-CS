public class Student {
    private String name;
    private int totalQuizScore;
    private int numberOfQuizzes;

    public Student(String name) {
        this.name = name;
        this.totalQuizScore = 0;
        this.numberOfQuizzes = 0;
    }

    public String getName() {
        return name;
    }

    public void addQuiz(int score) {
        totalQuizScore += score;
        numberOfQuizzes++;
    }

    public int getTotalScore() {
        return totalQuizScore;
    }

    public int getAverageScore() {
        return totalQuizScore / numberOfQuizzes;
    }
}
