import java.util.Scanner;

public class zd2 {
    public static void printGreeting(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();

        printGreeting(name);

        scanner.close();
    }
}
