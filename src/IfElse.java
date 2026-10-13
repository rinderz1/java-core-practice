import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваш балл за экзамен (0-100): ");
        int score = scanner.nextInt();

        // 1. Классический if-else if-else
        if (score >= 90 && score <= 100) {
            System.out.println("Оценка: Отлично (A)");
        } else if (score >= 75 && score < 90) {
            System.out.println("Оценка: Хорошо (B/C)");
        } else if (score >= 60 && score < 75) {
            System.out.println("Оценка: Удовлетворительно (D)");
        } else if (score >= 0 && score < 60) {
            System.out.println("Оценка: Неудовлетворительно (F). Нужно пересдать!");
        } else {
            System.out.println("Ошибка: балл должен быть в диапазоне от 0 до 100.");
        }

        // 2. Вложенные условия (Nested if)
        boolean hasAttendance = true;
        if (score >= 60) {
            if (hasAttendance) {
                System.out.println("Зачет получен с учетом посещаемости.");
            } else {
                System.out.println("Сдал экзамен, но есть проблемы с посещаемостью.");
            }
        }

        // 3. Конструкция switch-case (удобно для выбора конкретных значений)
        System.out.print("Введите номер дня недели (1-7): ");
        int dayNumber = scanner.nextInt();

        switch (dayNumber) {
            case 1:
                System.out.println("Понедельник — день тяжелый");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда — экватор недели");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница! Скоро выходные");
                break;
            case 6:
            case 7:
                System.out.println("Выходные! Отдыхаем");
                break;
            default:
                System.out.println("Такого дня недели не существует.");
        }

        scanner.close();
    }
}