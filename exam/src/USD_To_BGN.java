import java.util.Scanner;

public class USD_To_BGN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double dollars = Double.parseDouble(scanner.nextLine());
        double lv = dollars * 1.79549;
        System.out.println(lv);
    }
}
