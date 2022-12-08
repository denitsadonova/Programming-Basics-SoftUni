import java.util.Scanner;

public class Min_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int minNum = Integer.MAX_VALUE;
        while (!command.equals("Stop")) {

            int n = Integer.parseInt(command);
            if (n < minNum) {
                minNum = n;
            }
            command = scanner.nextLine();
        }
        System.out.println(minNum);

    }
}
