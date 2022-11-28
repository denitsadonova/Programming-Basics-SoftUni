import java.util.Scanner;

public class Supplies_for_School {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int liters = Integer.parseInt(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());

        double pensPrice = 5.80;
        double markersPrice = 7.20;
        double detergent = 1.20;

        double totalPenPrice = pens * pensPrice;
        double totalMarkersPrice = markers * markersPrice;
        double totaldetergentPrice = liters * detergent;
        double totalpercent = percent * 0.01;

        double totalPrice = totalPenPrice + totalMarkersPrice + totaldetergentPrice;
        double totalSalesPrice = totalPrice - (totalPrice * totalpercent);
        System.out.println(totalSalesPrice);
    }
}
