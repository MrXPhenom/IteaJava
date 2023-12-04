package HomeWork.HomeWork4.Part1;

public class studentTest {
    public static double calculateAverageGrade1() {
        student st1 = new student(1, "Alan", "Wake", 3, 70, 60, 100);
        return (st1.mathGrade + st1.economicsGrade + st1.foreignLanguageGrade) / 3;
    }

    public static double calculateAverageGrade2() {
        student st2 = new student(2, "Rose", "Marigold", 5, 90, 70, 80);
        return (st2.mathGrade + st2.economicsGrade + st2.foreignLanguageGrade) / 3;
    }

    public static double calculateAverageGrade3() {
        student st3 = new student(3, "Barry", "Wheeler", 4, 100, 80, 80);
        return (st3.mathGrade + st3.economicsGrade + st3.foreignLanguageGrade) / 3;
    }

    public static void main(String[] args) {
        System.out.println(calculateAverageGrade1() + "\n" + calculateAverageGrade2() + "\n" + calculateAverageGrade3());
    }
}
