import java.util.Scanner;

public class Half_Sum_Element {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= n ; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            sum = sum + currentNum;
            if (currentNum > max) {
                max = currentNum;
            }
        }
        sum = sum - max;
        if (sum == max) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", sum);
        }
        else {
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(sum - max));
        }
    }
}
