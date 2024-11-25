import java.util.List;

public class Student {
    private String Name, group;
    private Integer course;
    private List<Integer> grades;

    public Student(String name, String group, Integer course, List<Integer> grades) {
        Name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Integer getCourse() {
        return course;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades( List<Integer> grades) {
        this.grades = grades;
    }

    public float getAverageGrade() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (float) sum / grades.size();
    }

    public void nextCourse() {
        this.course++;
    }

}