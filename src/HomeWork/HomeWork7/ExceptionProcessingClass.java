package HomeWork.HomeWork7;

import java.util.Scanner;

public class ExceptionProcessingClass {
    static void listOfDividedNumbers(int[] array, int divisor) {
        try {
            if (divisor == 0) {
                throw new ArithmeticException("Number can't be divided by zero");
            }
            int length = array.length;
            double[] resultArray = new double[length];
            for (int i = 0; i < array.length; i++) {
                resultArray[i] = (double) array[i] / divisor;
            }
            System.out.print("Result of division of array on " + divisor + " is ");
            for (double result : resultArray) {
                System.out.print(result + " ");
            }
            System.out.println();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 8, 6, 50, 46, 34};
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your divisor");
        int divisor = sc.nextInt();
        listOfDividedNumbers(array, divisor);
    }
}
