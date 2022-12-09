import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int totalSteps = 0;
        boolean goingHome = false;
        while (totalSteps < 10000) {
            if (command.equals("Going home")) {
                goingHome = true;
                int steps = Integer.parseInt(scanner.nextLine());
                totalSteps = totalSteps + steps;
                break;
            }
            int steps = Integer.parseInt(command);
            totalSteps = totalSteps + steps;
            if (totalSteps >= 10000) {
                break;
            }
            command = scanner.nextLine();

        }
        if (totalSteps >= 10000) {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", totalSteps - 10000);
        }
        else {
            System.out.printf("%d more steps to reach goal.", 10000 - totalSteps);
        }
    }
}
