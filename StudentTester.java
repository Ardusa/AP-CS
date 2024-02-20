import java.util.ArrayList;

public class StudentTester {
    public static void main(String... args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Aubrey Graham", new int[] { 46, 57, 68, 79, 90 }));
        students.add(new Student("Shéyaa Joseph", new int[] { 98, 87, 76, 65, 54 }));
        students.add(new Student("Navy Wilburn", new int[] { 82, 93, 74, 85, 96 }));
        students.add(new Student("Symere Woods", new int[] { 31, 41, 51, 61, 71 }));
        students.add(new Student("Kiari Cephus", new int[] { 54, 65, 76, 87, 98 }));

        System.out.println("Name \t\t\t Quiz 1 \t Quiz 2 \t Quiz 3 \t Quiz 4 \t Quiz 5");
        System.out.println("-".repeat(100));
        for (Student student : students) {
            System.out.printf("%s \t|\t %d \t|\t %d \t|\t %d \t|\t %d \t|\t %d \n", student.getName(),
                    student.getQuizScore(0),
                    student.getQuizScore(1), student.getQuizScore(2), student.getQuizScore(3), student.getQuizScore(4));
        }
        System.out.println();

        // Changing the name of a student
        students.get(1).setName("Jaques Webster");

        System.out.println("Name \t\t\t Quiz 1 \t Quiz 2 \t Quiz 3 \t Quiz 4 \t Quiz 5");
        System.out.println("-".repeat(100));
        for (Student student : students) {
            System.out.printf("%s \t|\t %d \t|\t %d \t|\t %d \t|\t %d \t|\t %d \n", student.getName(),
                    student.getQuizScore(0),
                    student.getQuizScore(1), student.getQuizScore(2), student.getQuizScore(3), student.getQuizScore(4));
        }
        System.out.println();

        // Setting the quiz score of a student
        students.get(2).setQuizScore(3, 100);

        System.out.println("Name \t\t\t Quiz 1 \t Quiz 2 \t Quiz 3 \t Quiz 4 \t Quiz 5");
        System.out.println("-".repeat(100));
        for (Student student : students) {
            System.out.printf("%s \t|\t %d \t|\t %d \t|\t %d \t|\t %d \t|\t %d \n", student.getName(),
                    student.getQuizScore(0),
                    student.getQuizScore(1), student.getQuizScore(2), student.getQuizScore(3), student.getQuizScore(4));
        }
        System.out.println();

        // Replace a student with a new student
        students.set(2, new Student("Kanye West", new int[] { 85, 61, 77, 93, 100 }));

        System.out.println("Name \t\t\t Quiz 1 \t Quiz 2 \t Quiz 3 \t Quiz 4 \t Quiz 5");
        System.out.println("-".repeat(100));
        for (Student student : students) {
            System.out.printf("%s \t|\t %d \t|\t %d \t|\t %d \t|\t %d \t|\t %d \n", student.getName(),
                    student.getQuizScore(0),
                    student.getQuizScore(1), student.getQuizScore(2), student.getQuizScore(3), student.getQuizScore(4));
        }
        System.out.println();

        System.out.println("ToString Demonstration:");
        System.out.println(students.get(0).toString());
        System.out.println(students.get(1).toString());
        System.out.println(students.get(2).toString());
        System.out.println(students.get(3).toString());
        System.out.println(students.get(4).toString());
    }
}
