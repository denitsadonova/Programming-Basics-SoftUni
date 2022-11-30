import java.util.Scanner;

public class Toy_Shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double trip = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int teddy = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        int totalToys = puzzles + dolls + teddy + minions + trucks;

        double puzzlePrice = puzzles * 2.60;
        double dollsPrice = dolls * 3;
        double teddyPrice = teddy * 4.10;
        double minionsPrice = minions * 8.20;
        double trucksPrice = trucks * 2;
        double total = puzzlePrice + dollsPrice + teddyPrice + minionsPrice + trucksPrice;

        if (totalToys >= 50) {
            total = total - (total * 0.25);
        }
        double totalAmount = total - (total * 0.10);
        if (totalAmount >= trip)
        {
            System.out.printf("Yes! %.2f lv left.", totalAmount - trip);}
        else {
            System.out.printf("Not enough money! %.2f lv needed.", trip - totalAmount);
        }
    }
}
