package HomeWork.HomeWork6;

public class ArrayOfNumbers {
    public static void main(String[] args) {
        int minimalDifference = 20;
        int[] array = {5, 11, 7, 20};
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int min = Math.abs(array[i] - array[j]);
                minimalDifference = Math.min(min, minimalDifference);
            }
        }
        System.out.println("Minimal difference is " + minimalDifference);
    }
}
