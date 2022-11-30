import java.util.Scanner;

public class Godzilla_vs_Kong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double statistsOutfit = Double.parseDouble(scanner.nextLine());

        double outfitsPrice = statists * statistsOutfit;

        double decor = budget * 0.10;


        if (statists >= 150) {
            outfitsPrice = outfitsPrice - (outfitsPrice * 0.1);
        }
        double totalPrice = outfitsPrice + decor;

        if (totalPrice > budget) {
            System.out.printf("Not enough money! %n Wingard needs %.2f leva more.", totalPrice - budget) ;
        }
        else {
            System.out.printf("Action! %n Wingard starts filming with %.2f leva left.", budget - totalPrice);
        }}
}
