import java.util.Scanner;

public class Equal_Sums_Even_Odd_Position {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstRoom = Integer.parseInt(scanner.nextLine());
        int lastRoom = Integer.parseInt(scanner.nextLine());
        for (int i = firstRoom; i <= lastRoom; i++) {
            int currentSum = i;
            int evenSum = 0;
            int oddSum = 0;
            for (int j = 6; j >= 1; j--) {
                int digit = currentSum % 10;
                if (j % 2 == 0) {
                    evenSum = evenSum + digit;
                } else {
                    oddSum = oddSum + digit;
                }
                currentSum = currentSum / 10;

            }
            if (oddSum == evenSum) {
                System.out.print(i + " ");
            }

        }
    }
}
