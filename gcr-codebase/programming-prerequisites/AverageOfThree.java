import java.util.Scanner;

class AverageOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        double sum = num1 + num2 + num3;
        double average = sum / 3.0;

        System.out.println(average);

        scanner.close();
    }
}