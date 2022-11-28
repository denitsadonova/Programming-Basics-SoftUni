import java.util.Scanner;

public class Deposit_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double deposit = Double.parseDouble(scanner.nextLine());
        int term = Integer.parseInt(scanner.nextLine());
        double yearPercent = Double.parseDouble(scanner.nextLine());
        double percent = deposit * (yearPercent / 100);
        double montly = percent / 12;
        double total = deposit + term * montly;
        System.out.println(total);
    }
}
