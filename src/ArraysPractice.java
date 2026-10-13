public class ArraysPractice {
    public static void main(String[] args) {

        int[] numbers = {12, 5, 8, 20, 3, 15};
        // вывод
        System.out.println("--- Элементы массива ---");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // 2. Поиск максимального элемента и суммы
        int max = numbers[0];
        int sum = 0;

        for (int num : numbers) {
            sum += num;
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Сумма всех элементов: " + sum);
        System.out.println("Максимальный элемент: " + max);

        // 3. Двумерный массив (матрица)
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("\n--- Двумерный массив (Матрица) ---");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}