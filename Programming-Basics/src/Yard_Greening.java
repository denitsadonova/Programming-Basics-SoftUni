import java.util.Scanner;

public class Yard_Greening {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        double meters = Double.parseDouble(scanner.nextLine());
        double price = meters * 7.61;
        double discount = 0.18 * price;
        double finalPrice = price - discount;

        System.out.println("The final price is: " + finalPrice + " lv.");
        System.out.println("The discount is: " + discount + " lv.");

    }
}
