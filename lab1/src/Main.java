import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Владислав", "ИВТ-1", 3, Arrays.asList(4, 5, 5, 4)));
        students.add(new Student("Олег", "ИВТ-1", 2, Arrays.asList(2, 4, 2, 4)));
        students.add(new Student("Денис", "ИВТ-1", 3, Arrays.asList(4, 5, 5, 4)));
        students.add(new Student("Даниил", "ИВТ-1", 1, Arrays.asList(2, 3, 2, 4)));
        students.add(new Student("Владимир", "ИВТ-2", 2, Arrays.asList(4, 5, 5, 4)));
        students.add(new Student("Иван", "ИВТ-1", 3, Arrays.asList(4, 5, 5, 4)));
        students.add(new Student("Дмитрий", "ИВТ-1", 1, Arrays.asList(4, 5, 5, 4)));
        students.add(new Student("Дмитрий", "ИВТ-1", 2, Arrays.asList(2, 2, 3, 4)));
        students.add(new Student("Екатерина", "ИВТ-2", 3, Arrays.asList(4, 5, 5, 4)));


        processStudents(students);
        printStudents(students, 3);
    }

    /// Метод, который удаляет студентов со средним баллом < 3.
    /// Если средний балл >= 3, студент переводится на следующий курс.
    public static void processStudents(List<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (student.getAverageGrade() < 3) {
//                System.out.println(student.getName() + " удален, средний балл: " + student.getAverageGrade());
                students.remove(i);
                i--;
            } else {
                student.nextCourse();
//                System.out.println(student.getName() + " переведен на курс " + student.getCourse() + ".");
            }
        }
    }

    public static void printStudents(List<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course){
                System.out.println(student.getName());
            }
        }
    }
}