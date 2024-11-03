import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Human person = new Human();
        person.name = "Chingiz";
        person.age = 29;
        person.gender = "m";

        System.out.println("Имя: " + person.name + "\n" +
                "Возраст: " + person.age + "\n" +
                "Гендер: " + person.gender
        );
    }
}
