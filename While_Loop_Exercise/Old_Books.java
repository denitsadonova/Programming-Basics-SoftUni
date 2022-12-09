import java.util.Scanner;

public class Old_Books {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        String book = "";
        int countBooks = 0;
        while (!book.equals("No More Books")) {
            book = scanner.nextLine();
            if (book.equals(command)) {
                break;
            } else {
                countBooks++;
            }
        }
        if (book.equals(command)) {
            System.out.printf("You checked %d books and found it.", countBooks);
        } else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", countBooks - 1);
        }


    }
}
