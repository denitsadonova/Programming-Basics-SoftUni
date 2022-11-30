import java.util.Scanner;

public class Lunch_Break {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String showName = scanner.nextLine();
        int showDuration = Integer.parseInt(scanner.nextLine());
        int breakTime = Integer.parseInt(scanner.nextLine());

        double lunchTime = breakTime / 8.0;
        double restTime = breakTime / 4.0;
        double leftTime = breakTime - lunchTime - restTime;
        double difference = Math.abs(showDuration - leftTime);

        if (leftTime >= showDuration) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", showName,
                    Math.ceil(difference)); }
        else { System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", showName,
                Math.ceil(difference)); }
    }
}
