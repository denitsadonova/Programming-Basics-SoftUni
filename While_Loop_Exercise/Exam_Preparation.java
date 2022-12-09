import java.util.Scanner;

public class Exam_Preparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxBadGrades = Integer.parseInt(scanner.nextLine());
        String taskName = scanner.nextLine();
        int grade = Integer.parseInt(scanner.nextLine());
        int badGrades = 0;
        int totalGrades = 0;
        boolean failed = false;
        int allTasks = 0;
        String lastTask = "";
        while (!taskName.equals("Enough")) {
            if (grade <= 4) {
                badGrades++;
            }
            if (badGrades == maxBadGrades) {
                failed = true;
                break;
            }
            totalGrades = totalGrades + grade;
            allTasks++;
            lastTask = taskName;
            taskName = scanner.nextLine();
            if (taskName.equals("Enough")) {
                break;
            }
            grade = Integer.parseInt(scanner.nextLine());
        }
        double averageGrade = totalGrades * 1.0 / allTasks;
        if (failed) {
            System.out.printf("You need a break, %d poor grades.", badGrades);
        } else {
            System.out.printf("Average score: %.2f%n", averageGrade);
            System.out.printf("Number of problems: %d%n", allTasks);
            System.out.printf("Last problem: %s",lastTask);
        }

    }
}
