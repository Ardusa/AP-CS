public class StudentTester {
    public static void main(String... args) {
        Student student = new Student("John Doe");
        student.addQuiz(10);
        student.addQuiz(20);
        student.addQuiz(30);
        System.out.println("Student name: " + student.getName());
        System.out.println("Student total score: " + student.getTotalScore());
        System.out.println("Student average score: " + student.getAverageScore());
    }
}
