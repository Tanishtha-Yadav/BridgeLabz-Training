import java.util.Scanner;

class RectanglePerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length = scanner.nextDouble();
        double width = scanner.nextDouble();

        if (length < 0 || width < 0) {
            scanner.close();
            return;
        }

        double perimeter = 2 * (length + width);

        System.out.println(perimeter);

        scanner.close();
    }
}