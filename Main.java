import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        isChetNum();
    }

    public static void isChetNum() {
        System.out.println("Введите число: ");
        int num = new Scanner(System.in).nextInt();
        if (num % 2 == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
