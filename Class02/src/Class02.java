public class Class02 {
    public static void main(String[] args) {
        int number = 5;

        for (int i = 1; i <= number; i++) {
            System.out.println("Counting: " + i);
        }

        int counter = 1;
        while (counter <= number) {
            System.out.println("Counting: " + counter);
            counter++;
        }
    }
}
