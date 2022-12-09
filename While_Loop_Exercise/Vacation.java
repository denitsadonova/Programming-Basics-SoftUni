import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double neededMoney = Double.parseDouble(scanner.nextLine());
        double availableMoney = Double.parseDouble(scanner.nextLine());
        String text = scanner.nextLine();
        double money = Double.parseDouble(scanner.nextLine());
        double totalMoney = availableMoney;
        int totalDays = 0;
        int spendDays = 0;
        while (totalMoney < neededMoney) {
            switch (text) {
                case "spend":
                    totalMoney = totalMoney - money;
                    spendDays++;
                    if (totalMoney < 0) {
                        totalMoney = 0;
                    }
                    break;
                case "save":
                    spendDays = 0;
                    totalMoney = totalMoney + money;
                    break;
            }
            if (spendDays >= 5) {
                System.out.println("You can't save the money.");
                System.out.printf("%d", totalDays + 1);
                break;
            }
            totalDays++;
            if (totalMoney >= neededMoney) {
                break;
            }
            text = scanner.nextLine();
            money = Double.parseDouble(scanner.nextLine());


        }
        if (totalMoney >= neededMoney) {
            System.out.printf("You saved the money for %d days.", totalDays);
        }
    }
}
