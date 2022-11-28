import java.util.Scanner;

public class Fish_Tank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());
        int volumCm = length * width * height;
        double volumLiters = volumCm * 0.001;
        double needLiters = volumLiters * (1 - (percent / 100));
        System.out.println(needLiters);
    }
}
