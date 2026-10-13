public class Operators {
    public static void main(String[] args) {
        int a = 17;
        int b = 5;

        // 1. Arithmetic operators
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Remainder: " + (a % b));

        // 2. Comparison operators
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a == b);
        System.out.println(a != b);

        // 3. Logical operators
        int age = 20;
        boolean hasID = true;

        System.out.println(age >= 18 && hasID);
        System.out.println(age < 18 || hasID);
        System.out.println(!hasID);

        // 4. Increment and decrement
        int number = 10;

        number++;
        System.out.println(number);

        number--;
        System.out.println(number);

        // 5. Compound assignment
        number += 5;
        System.out.println(number);

        number *= 2;
        System.out.println(number);
    }
}