import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String password = scanner.nextLine();
        while (true) {
            String newpass = scanner.nextLine();
            if (password.equals(newpass)) {
                System.out.printf("Welcome %s!", name);
                break;
            }
        }
    }
}
