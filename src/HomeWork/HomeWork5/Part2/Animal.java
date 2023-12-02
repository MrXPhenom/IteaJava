package HomeWork.HomeWork5.Part2;

public class Animal {
    int eyes;

    public Animal(int eyes) {
        this.eyes = eyes;
        animal();
    }

    static void animal() {
        System.out.println("I am animal");
    }

    static void eat() {
        System.out.println("Animal eats");
    }

    static void drink() {
        System.out.println("Animal drinks");
    }
}
