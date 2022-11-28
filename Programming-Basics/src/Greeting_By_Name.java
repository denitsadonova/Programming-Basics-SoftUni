import java.util.Scanner;

public class Greeting_By_Name {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
