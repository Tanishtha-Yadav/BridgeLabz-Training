import java.util.Scanner;

class AreaOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radius = scanner.nextDouble();

        if (radius < 0) {
            scanner.close();
            return;
        }

        double area = Math.PI * radius * radius;

        System.out.println(area);

        scanner.close();
    }
}