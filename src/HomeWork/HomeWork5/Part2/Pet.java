package HomeWork.HomeWork5.Part2;

public class Pet extends Animal {
    String name;
    int tail = 1;
    int paw = 4;

    public Pet(String name) {
        super(2);
        this.name = name;
        System.out.println("I am a pet");
    }

    void run() {
        System.out.println("Pet runs");
    }

    void jump() {
        System.out.println("Pet runs « jumps");
    }
}
