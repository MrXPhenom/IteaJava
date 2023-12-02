package HomeWork;

import java.util.Scanner;

public class HomeWork2 {
    public static void overloadedMethod() {
        int a1;
        Scanner sc = new Scanner(System.in);
        a1 = sc.nextInt();
        int x = a1 / 100;
        int y = a1 / 10 % 10;
        int z = a1 % 10;
        int sum = x + y + z;
        System.out.println("Sum of digits is: " + sum);
    }

    static String overloadedMethod(String b) {
        System.out.println("In your words is " + b.length() + " characters");
        return b;
    }

    static boolean overloadedMethod(Scanner sc2) {
        int c1;
        c1 = sc2.nextInt();
        if (c1 > 0) {
            System.out.println("Number is greater than zero");
            return true;
        } else {
            System.out.println("Number is not less than zero");
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter three-digit number:");
        overloadedMethod();
        System.out.println("Enter two words:");
        Scanner sc1 = new Scanner(System.in);
        String b = sc1.nextLine();
        overloadedMethod(b);
        System.out.println("Enter a number:");
        Scanner sc2 = new Scanner(System.in);
        overloadedMethod(sc2);
    }
}
