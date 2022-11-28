import java.util.Scanner;

public class Basketball_Equipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int trainnings = Integer.parseInt(scanner.nextLine());
        double trainers = trainnings - 0.4 * trainnings;
        double suit = trainers - 0.2 * trainers;
        double ball = suit / 4;
        double accessoaries = ball / 5;
        double expenses = trainnings + trainers + suit + ball + accessoaries;
        System.out.println(expenses);
    }
}
