package HomeWork.HomeWork5.Part1;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Carl");
        student.setGrade(10);
        student.setCourse(2);

        Student student1 = new Student();
        student1.setName("Barbara");
        student1.setGrade(8);
        student1.setCourse(4);

        student.showInfo();
        System.out.println("-------------------------");
        student1.showInfo();
    }
}
