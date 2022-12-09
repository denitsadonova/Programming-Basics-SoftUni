import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lenght = Integer.parseInt(scanner.nextLine());
        int wildth = Integer.parseInt(scanner.nextLine());
        int peaces = lenght * wildth;
        String command = scanner.nextLine();
        boolean noMoreCake = false;
        int leftCake = 0;
        while (!(command.equals("STOP"))) {
            int people = Integer.parseInt(command);
            peaces = peaces - people;
            if (peaces <= 0) {
                noMoreCake = true;
                break;
            }
            command = scanner.nextLine();

        }
        if (noMoreCake) {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(peaces));
        }
        else {
            System.out.printf("%d pieces are left.", peaces);
        }
    }
}
