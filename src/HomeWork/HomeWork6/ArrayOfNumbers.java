package HomeWork.HomeWork6;

public class ArrayOfNumbers {

    public static int findMinDifference(int[] numbers) {
        int minDifference = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int difference = Math.abs(numbers[i] - numbers[j]);
                if (difference < minDifference) {
                    minDifference = difference;
                }
            }
        }
        return minDifference;
    }

    public static void main(String[] args) {
        int[] array = {5, 11, 7, 20};
        System.out.println("Minimal difference is " + findMinDifference(array));
    }
}
