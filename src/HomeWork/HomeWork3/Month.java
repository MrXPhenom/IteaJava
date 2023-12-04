package HomeWork.HomeWork3;

public class Month {
    public static void longestWordOfThree(String word1, String word2, String word3) {
        if (word1.length() > word2.length() && word1.length() > word3.length()) {
            System.out.println("First word is the longest");
        } else if (word2.length() > word1.length() && word2.length() > word3.length()) {
            System.out.println("Second word is the longest");
        } else {
            System.out.println("Third word is the longest");
            System.out.println();
        }
    }

    public static void daysInMonth(int month) {
        switch (month) {
            case 1: {
                System.out.println("January has 31 day");
                break;
            }
            case 2: {
                System.out.println("February has 28 day");
                break;
            }
            case 3: {
                System.out.println("March has 31 day");
                break;
            }
            case 4: {
                System.out.println("April has 30 day");
                break;
            }
            case 5: {
                System.out.println("May has 31 day");
                break;
            }
            case 6: {
                System.out.println("June has 30 day");
                break;
            }
            case 7: {
                System.out.println("July has 31 day");
                break;
            }
            case 8: {
                System.out.println("August has 31 day");
                break;
            }
            case 9: {
                System.out.println("September has 30 day");
                break;
            }
            case 10: {
                System.out.println("October has 31 day");
                break;
            }
            case 11: {
                System.out.println("November has 30 day");
                break;
            }
            case 12: {
                System.out.println("December has 31 day");
                break;
            }
            default:
                System.out.println("Wrong input");
        }
    }

    public static void starTree() {
        int numStars = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= numStars; j++) {
                System.out.print("*");
            }
            numStars++;
            System.out.println();
        }
    }

    public static void invertedStarTree() {
        int numStars = 4;
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < numStars; j++) {
                System.out.print('*');
            }
            numStars--;
            System.out.println();
        }
    }

    public static void reversedStarTree2(int k) {
        int a, b;
        for (a = 0; a < k; a++) {
            for (b = k - a - 1; b > 0; b--) {
                System.out.print(" ");
            }

            for (b = 0; b <= a; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void reversedStarTree1(int k) {
        int a, b;
        for (a = 5; a >= 0; a--) {
            for (b = k - a - 1; b >= 0; b--) {
                System.out.print(" ");
            }

            for (b = 1; b <= a; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        longestWordOfThree("Alan", "Alice", "Wake");
        System.out.println();
        daysInMonth(11);
        System.out.println();
        starTree();
        invertedStarTree();
        reversedStarTree1(5);
        reversedStarTree2(5);
    }
}
