public class Unit02 {
    public static void main(String[] args) {
        System.out.println("Unit 02:");

        System.out.println("Exercise 01:");
        exercise01();

        System.out.println("Exercise 02:");
        exercise02();

        System.out.println("Exercise 03:");
        exercise03();
    }

    // Exercise01: Print expressions using var a
    private static void exercise01() {
        int a = 2147483647;

        System.out.println("a = " + a);
        System.out.println("a + 1 = " + (a + 1));
        System.out.println("2 - a = " + (2 - a));
        System.out.println("-2 - a = " + (-2 - a));
        System.out.println("2 * a = " + (2 * a));
        System.out.println("4 * a = " + (4 * a));
    }

    // Exercise02: Correct the expressions
    public static void exercise02() {
        int a = 10;
        int b = 20;
        int c = 30;

        if (a > b) {
            c = 0;
        } else {
            b = 0;
        }

        System.out.println("a = " + a + ", b = " + b + ", c = "+ c);
    }

    // Exercise 03: Create situations using control instructions
    public static void exercise03() {
        int a = 10;
        int b = 20;
        int c = 30;

        // If-Else instructions
        if (a > b) {
            c = 0;
        } else {
            b = 0;
        }

        // Switch-Case
        switch (a) {
            case 1:
                System.out.println("a = 1");
                break;
            case 2:
                System.out.println("a = 2");
                break;
            default:
                System.out.println("a = " + a);
                break;
        }

        // For loop
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }

        int j = 0;
        // While loop
        while(j < 10) {
            System.out.println("j = " + j);
            j++;
        }
    }
}