import java.util.Scanner;
public class LoopsPractice {
    public static void main(String[] args) {
        // 1. for
        System.out.println("--- Таблица умножения на 5 ---");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 * " + i + " = " + (5 * i));
        }

        // 2. while
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number = -1;

        System.out.println("\n--- Сумма чисел (введите 0 для выхода) ---");
        while (number != 0) {
            System.out.print("Введите число: ");
            number = scanner.nextInt();
            sum += number;
        }
        System.out.println("Общая сумма: " + sum);

        // 3.do-while
        int attempts = 3;
        do {
            System.out.println("\nОсталось попыток входа: " + attempts);
            attempts--;
        } while (attempts > 0);

        scanner.close();
    }
}