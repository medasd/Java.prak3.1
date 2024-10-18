import java.util.Scanner;

public class zd4 {
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (isEven(number)) {
            System.out.println("Число " + number + " четное.");
        } else {
            System.out.println("Число " + number + " нечетное.");
        }

        scanner.close();
    }
}
