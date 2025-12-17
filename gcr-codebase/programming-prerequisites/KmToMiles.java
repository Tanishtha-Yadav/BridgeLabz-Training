import java.util.Scanner;

class KmToMiles {
    private static final double CONVERSION_FACTOR = 0.621371;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double kilometers = scanner.nextDouble();

        if (kilometers < 0) {
            scanner.close();
            return;
        }

        double miles = kilometers * CONVERSION_FACTOR;

        System.out.println(miles);

        scanner.close();
    }
}