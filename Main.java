import java.util.Scanner;

public class Main {
    static String booksInfo = "";

    public static void main(String[] args) {
        while (true) {
            String name = inputBookName();
            int pageCount = inputPageCount();
            int priceBook = inputPraceBook();
            addBook(name, pageCount, priceBook);
            printInfo();
        }
    }

    public static int inputPageCount() {
        System.out.println("Input count pages:");
        return new Scanner(System.in).nextInt();
    }

    public static int inputPraceBook() {
        System.out.println("Input count pages:");
        return new Scanner(System.in).nextInt();
    }

    public static String inputBookName() {
        System.out.println("Input name of book:");
        return new Scanner(System.in).nextLine();
    }

    public static void addBook(String bookName) {
        addBook(bookName, 0, 0);
    }

    public static void addBook(String bookName, int pageCount) {
        addBook(bookName, 0, 0);
    }

    public static void addBook(String bookName, int pageCount, int praceBook) {
        booksInfo += bookName + " - " + (pageCount > 0 ? pageCount : "N/A") + " стр." + " " + (praceBook > 0 ? praceBook : "N/A") + " руб." + "\n";
    }

    public static void printInfo() {
        System.out.println(booksInfo);
    }
}
