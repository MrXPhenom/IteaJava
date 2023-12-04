package HomeWork.HomeWork5.Part1;

public class Student {
    private String name;
    private int course;
    private int grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 3) {
            this.name = name;
        }
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if (course >= 1 && course <= 4) {
            this.course = course;
        }
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade >= 1 && grade <= 10) {
            this.grade = grade;
        }
    }

    public void showInfo() {
        System.out.println("Student's name:   " + getName() + "\n" + "Student's course: " + getCourse() + "\n" + "Student's grade:  " + getGrade());
    }
}
