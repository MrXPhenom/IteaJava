package HomeWork.HomeWork5.Part2;

public class Pet extends Animal{
    String name;
    int tail = 1;
    int paw = 4;

    public Pet(String name) {
        super(2);
        this.name = name;
        animal();
    }

    static void animal() {
        System.out.println("I am a pet");
    }

    ;

    static void run() {
        System.out.println("Pet runs");
    }

    static void jump() {
        System.out.println("Pet runs « jumps");
    }
}
