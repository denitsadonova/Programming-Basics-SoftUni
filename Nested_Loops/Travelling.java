import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String destination = input;
            double budget = Double.parseDouble(scanner.nextLine());
            double sum = 0;
            while (sum < budget) {
                double amount = Double.parseDouble(scanner.nextLine());
                sum = sum + amount;
                if (sum >= budget) {
                    break;
                }
            }
            System.out.printf("Going to %s!%n", destination);
            input = scanner.nextLine();
        }
    }
}
