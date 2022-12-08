import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double sum = 0;
        int badGrades = 0;
        int year = 1;
        while (year <= 12) {
            if (badGrades == 2) {
                break;
            }
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade < 4) {
                badGrades++;
                continue;
            }
            sum = sum + grade;
            year++;




        }
        if (badGrades == 2) {
            System.out.printf("%s has been excluded at %d grade", name, year); }
        else {
            double averageGrade = sum / (year - 1);
            System.out.printf("%s graduated. Average grade: %.2f", name, averageGrade);
        }


    }
}
