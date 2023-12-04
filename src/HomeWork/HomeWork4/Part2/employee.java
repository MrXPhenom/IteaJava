package HomeWork.HomeWork4.Part2;

public class employee {
    private int salary;
    public String surname;
    int id;

    public employee(String surname, int salary, int id) {
        this.salary = salary;
        this.surname = surname;
        this.id = id;
    }

    employee(int id, String surname, int salary) {
        this.salary = salary;
        this.surname = surname;
        this.id = id;
    }

    private employee(int salary, int id, String surname) {
        this.salary = salary;
        this.surname = surname;
        this.id = id;
    }

    public static void employee1() {
        employee employee1 = new employee("Zane", 500, 1);
        System.out.println(employee1.id + " " + employee1.surname + " " + employee1.salary);
    }

    public static void employee2() {
        employee employee2 = new employee(2, "Door", 1000);
        System.out.println(employee2.id + " " + employee2.surname + " " + employee2.salary);
    }

    public static void employee3() {
        employee employee3 = new employee(1500, 3, "Wake");
        System.out.println(employee3.id + " " + employee3.surname + " " + employee3.salary);
    }

    public static void main(String[] args) {
        employee1();
        employee2();
        employee3();
    }
}
