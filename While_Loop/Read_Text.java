import java.util.Scanner;

public class Read_Text {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        while (!command.equals("Stop")) {
            System.out.println(command);
            command = scanner.nextLine();
        }
    }
}
