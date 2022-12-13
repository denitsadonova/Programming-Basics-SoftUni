import java.util.Scanner;

public class Sum_of_Two_Numbers {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int startSum = Integer.parseInt(scanner.nextLine());
            int endSum = Integer.parseInt(scanner.nextLine());
            int magicNum = Integer.parseInt(scanner.nextLine());
            int count = 0;
            boolean isValid = false;
            for (int i = startSum; i <= endSum; i++) {
                for (int j = startSum; j <= endSum; j++) {
                    count++;
                    int currentSum = i + j;
                    if (currentSum == magicNum) {
                        System.out.printf("Combination N:%d (%d + %d = %d)%n", count, i, j, currentSum);
                        isValid = true;
                        break;
                    }
                }
                if (isValid) {
                    break;
                }

            }
            if (!isValid) {
                System.out.printf("%d combinations - neither equals %d%n", count, magicNum);
            }
        }}
