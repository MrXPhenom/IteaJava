package HomeWork.HomeWork5.Part2;

public class Cat extends Pet {
    public Cat(String name) {
        super(name);
        System.out.println("I am a cat, and my name is " + name);
    }

    public void sleep() {
        System.out.println("Cat sleeps");
    }
}
