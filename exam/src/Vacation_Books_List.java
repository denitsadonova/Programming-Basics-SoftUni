import java.util.Scanner;

public class Vacation_Books_List {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPages = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int totalTime = totalPages / pagesPerHour;
        int neededHoursPerDay = totalTime / days;
        System.out.println(neededHoursPerDay);
    }
}
