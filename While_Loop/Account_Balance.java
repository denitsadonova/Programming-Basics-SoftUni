import java.util.Scanner;

public class Account_Balance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        double totalMoney = 0;
        while (!command.equals("NoMoreMoney")) {
            double sum = Double.parseDouble(command);
            if (sum < 0) {
                System.out.println("Invalid operation!");
                break;
            } else {
                totalMoney = totalMoney + sum;
                System.out.printf("Increase: %.2f%n", sum);
            }
            command = scanner.nextLine();
        }
        System.out.printf("Total: %.2f", totalMoney);

    }
}
