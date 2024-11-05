import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Phone phone1 = new Phone();
        System.out.println("phone1: " + phone1.phoneNumber + "- модель: " + phone1.phoneModel);
        Phone phone2 = new Phone("8(345) 216 22 34", "Siemens M1", 59.01);
        System.out.println("phone2: " + phone2.phoneNumber + "- модель: " + Phone.country);

    }
}
