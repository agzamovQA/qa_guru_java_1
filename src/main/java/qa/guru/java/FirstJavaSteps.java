package qa.guru.java;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class FirstJavaSteps {
    public static void main(String[] args) {

        int a = 2;
        int b = 5;
        int c = 3;
        double d = 6.5;

        // 0) применить несколько арифметических операций ( + , -, * , /) над двумя примитивами типа int

        int addition = a + b;
        int subtraction = b - a;
        int multiplication = a * b;
        int division = b / a;

        System.out.println("Сложение: " + addition);
        System.out.println("Вычитание: " + subtraction);
        System.out.println("Умножение: " + multiplication);
        System.out.println("Деление: " + division);

        //1) применить несколько арифметических операций над int и double в одном выражении

        double additionDouble = c + d;
        double subtractionDouble = d - c;
        double multiplicationDouble = c * d;
        double divisionDouble = d / c;

        System.out.println("\nСложение: " + additionDouble);
        System.out.println("Вычитание: " + subtractionDouble);
        System.out.println("Умножение: " + multiplicationDouble);
        System.out.println("Деление: " + divisionDouble);

        // 2) применить несколько логических операций ( < , >, >=, <= )

        boolean isGreater = d > b;
        boolean isLess = d < b;
        boolean isEqual = d == b;
        boolean isGreaterOrEqual = d >= b;
        boolean isLessOrEqual = d <= b;

        System.out.println("\n" + d + " больше " + b + ": " + isGreater);
        System.out.println(d + " меньше " + b + ": " + isLess);
        System.out.println(d + " равно " + b + ": " + isEqual);
        System.out.println(d + " больше" + " или " + " равно " + b + ": " + isGreaterOrEqual);
        System.out.println(d + " меньше" + " или " + " равно " + b + ": " + isLessOrEqual);

        // 3) диапазоны типов данных для вещественных / чисел с плавающей точкой

        // float
        System.out.println("\nfloat:");
        System.out.println("  Минимальное значение: " + Float.MIN_VALUE);   // Ближайшее положительное число к нулю
        System.out.println("  Максимальное значение: " + Float.MAX_VALUE);
        System.out.println("  NaN: " + Float.NaN); // NaN - Not a Number
        System.out.println("  Положительная бесконечность: " + Float.POSITIVE_INFINITY);
        System.out.println("  Отрицательная бесконечность: " + Float.NEGATIVE_INFINITY);

        // double
        System.out.println("\ndouble:");
        System.out.println("  Минимальное значение: " + Double.MIN_VALUE);   // Ближайшее положительное число к нулю
        System.out.println("  Максимальное значение: " + Double.MAX_VALUE);
        System.out.println("  NaN: " + Double.NaN); // NaN - Not a Number
        System.out.println("  Положительная бесконечность: " + Double.POSITIVE_INFINITY);
        System.out.println("  Отрицательная бесконечность: " + Double.NEGATIVE_INFINITY);

        // 4) получить переполнение при арифметической операции

        int maxOverflow = MAX_VALUE + 1;
        int minOverflow = MIN_VALUE -1;

        System.out.println("\noverflow:");
        System.out.println(" Положительное переполнение типа int: " + maxOverflow);
        System.out.println(" Отрицательное переполнение типа int: " + minOverflow);

    }
    }