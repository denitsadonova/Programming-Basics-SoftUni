import java.util.Scanner;

public class Train_The_Trainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int countGrades = 0;
        double allGrades = 0;
        String input = scanner.nextLine();
        while (!input.equals("Finish")) {
            String presentation = input;
            double sumCurrentGrades = 0;
            for (int i = 1; i <= n; i++) {
                double currentGrade = Double.parseDouble(scanner.nextLine());
                countGrades++;
                sumCurrentGrades = sumCurrentGrades + currentGrade;

            }
            allGrades = allGrades + sumCurrentGrades;
            double avrgGrade = sumCurrentGrades / n;
            System.out.printf("%s - %.2f.%n", presentation, avrgGrade);
            input = scanner.nextLine();
        }
        double finalGrade = allGrades / countGrades;
        System.out.printf("Student's final assessment is %.2f.", finalGrade);
    }
}
