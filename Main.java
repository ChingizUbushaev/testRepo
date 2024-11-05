import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person();
        System.out.println(person1.getName());
        person1.setName("Stu");
        System.out.println(person1.getName());
    }
}
