import java.util.Scanner;

public class Max_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int maxNum = Integer.MIN_VALUE;
        while (!command.equals("Stop")) {

            int n = Integer.parseInt(command);
            if (n > maxNum) {
                maxNum = n;
            }
            command = scanner.nextLine();
        }
        System.out.println(maxNum);

    }
}
