public class Student {
    private String name;
    private int[] quizScores;

    public Student(String name, int[] quizScores) {
        this.name = name;
        this.quizScores = quizScores;
    }

    public int getQuizScore(int quizNumber) {
        return quizScores[quizNumber];
    }

    public void setQuizScore(int quizNumber, int newScore) {
        quizScores[quizNumber] = newScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    @Override
    public String toString() {
        String result = name + ": ";
        for (int score : quizScores) {
            result += score + " ";
        }
        return result;
    }
}
