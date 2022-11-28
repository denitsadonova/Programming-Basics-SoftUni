import java.util.Scanner;

public class Food_Delivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countChickenMenus = Integer.parseInt(scanner.nextLine());
        int countFishMenus = Integer.parseInt(scanner.nextLine());
        int countVegMenus = Integer.parseInt(scanner.nextLine());

        double chickenMenusPrice = countChickenMenus * 10.35;
        double fishMenusPrice = countFishMenus * 12.40;
        double vegMenusPrice = countVegMenus * 8.15;
        double allMenusPrice = chickenMenusPrice + fishMenusPrice + vegMenusPrice;
        double dessertPrice = 0.2 * allMenusPrice;
        double deliveryPrice = 2.50;
        double totalPrice = allMenusPrice + dessertPrice + deliveryPrice;
        System.out.println(totalPrice);
    }
}
