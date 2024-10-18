import java.util.Scanner;

public class zd6 {
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public static int multiply(int a, int b, int c, int d) {
        return a * b * c * d;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число для умножения (2 числа): ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число для умножения (2 числа): ");
        int num2 = scanner.nextInt();

        System.out.println("Произведение (2 числа): " + multiply(num1, num2));

        System.out.print("Введите первое число для умножения (3 числа): ");
        int num3 = scanner.nextInt();
        System.out.print("Введите второе число для умножения (3 числа): ");
        int num4 = scanner.nextInt();
        System.out.print("Введите третье число для умножения (3 числа): ");
        int num5 = scanner.nextInt();
        int result3 = multiply(1,2,3,4);
        System.out.println("Произведение 4 чисел: " + result3 );




        System.out.println("Произведение (3 числа): " + multiply(num3, num4, num5));

        scanner.close();
    }
}
