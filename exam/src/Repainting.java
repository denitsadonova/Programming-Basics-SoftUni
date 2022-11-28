import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int needednylon = Integer.parseInt(scanner.nextLine());
        int neededpaint = Integer.parseInt(scanner.nextLine());
        int neededtinner = Integer.parseInt(scanner.nextLine());
        int neededhours = Integer.parseInt(scanner.nextLine());

        double nylon = 1.50;
        double paint = 14.50;
        double painttinner = 5.00;
        double bags = 0.40;

        double nylonPrice = (needednylon + 2) * nylon;
        double paintPrice = (neededpaint + neededpaint * 0.10) * paint;
        double tinnerPrice = neededtinner * painttinner ;
        double totalMaterialsPrice = nylonPrice + paintPrice + tinnerPrice + bags;
        double craftsman = (totalMaterialsPrice * 0.30) * neededhours;
        double totalPrice = totalMaterialsPrice + craftsman;

        System.out.println(totalPrice);


    }
}
