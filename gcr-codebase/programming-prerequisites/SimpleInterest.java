import java.util.Scanner;

class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double principal = scanner.nextDouble();
        double rate = scanner.nextDouble();
        double time = scanner.nextDouble();

        double simpleInterest = (principal * rate * time) / 100.0;

        System.out.println(simpleInterest);

        scanner.close();
    }
}