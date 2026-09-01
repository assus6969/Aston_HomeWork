package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== ЗАДАНИЕ 1: Обработка массива 4x4 ===\n");

        System.out.println("--- Тест 1: Корректный массив ---");
        String[][] correctArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        testArray(correctArray);

        System.out.println("\n--- Тест 2: Массив с некорректными данными ---");
        String[][] invalidDataArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "abc", "12"},  // "abc" - не число
                {"13", "14", "15", "16"}
        };
        testArray(invalidDataArray);

        System.out.println("\n--- Тест 3: Массив неправильного размера (3x4) ---");
        String[][] wrongSizeArray1 = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"}
        };
        testArray(wrongSizeArray1);

        System.out.println("\n--- Тест 4: Массив неправильного размера (4x3) ---");
        String[][] wrongSizeArray2 = {
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"},
                {"10", "11", "12"}
        };
        testArray(wrongSizeArray2);

        System.out.println("\n--- Тест 5: Массив с null строкой ---");
        String[][] nullRowArray = {
                {"1", "2", "3", "4"},
                null,
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        testArray(nullRowArray);

        System.out.println("\n--- Тест 6: Массив с числами, содержащими пробелы ---");
        String[][] spacedNumbers = {
                {"1", " 2 ", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        testArray(spacedNumbers);

        System.out.println("\n\n=== ЗАДАНИЕ 2: Генерация и поимка ArrayIndexOutOfBoundsException ===\n");

        demonstrateArrayIndexOutOfBounds();
    }

    private static void testArray(String[][] array) {
        try {
            int result = ArrayProcessor.processArray(array);
            System.out.println("✅ Сумма элементов: " + result);
        } catch (MyArraySizeException e) {
            System.out.println("❌ Ошибка размера массива: " + e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println("❌ Ошибка данных: " + e.getMessage());
            System.out.println("   Ячейка [" + e.getRow() + "][" + e.getCol() + "] содержит: '" + e.getValue() + "'");
        } catch (Exception e) {
            System.out.println("❌ Неожиданная ошибка: " + e.getMessage());
        }
    }

    private static void demonstrateArrayIndexOutOfBounds() {
        System.out.println("1. Генерация ArrayIndexOutOfBoundsException при обращении по индексу за пределами массива:");

        try {
            int[] array = {1, 2, 3, 4, 5};
            System.out.println("   Создан массив размером " + array.length);
            System.out.println("   Попытка доступа к элементу с индексом 10...");
            int value = array[10];
            System.out.println("   Значение: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("   ✅ Поймано исключение: " + e.getClass().getSimpleName());
            System.out.println("   Сообщение: " + e.getMessage());
        }

        System.out.println("\n2. Генерация ArrayIndexOutOfBoundsException в двумерном массиве:");

        try {
            String[][] matrix = {
                    {"A", "B", "C"},
                    {"D", "E", "F"}
            };
            System.out.println("   Создана матрица размером " + matrix.length + "x" + matrix[0].length);
            System.out.println("   Попытка доступа к элементу [5][2]...");
            String value = matrix[5][2];
            System.out.println("   Значение: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("   ✅ Поймано исключение: " + e.getClass().getSimpleName());
            System.out.println("   Сообщение: " + e.getMessage());
        }

        System.out.println("\n3. Дополнительный пример: цикл с выходом за пределы:");

        try {
            int[] numbers = {10, 20, 30, 40};
            System.out.println("   Массив: " + Arrays.toString(numbers));
            System.out.println("   Цикл с условием i <= numbers.length (выход за пределы):");

            for (int i = 0; i <= numbers.length; i++) {
                System.out.println("   numbers[" + i + "] = " + numbers[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("   ✅ Поймано исключение при i = " +
                    e.getMessage().replaceAll("\\D+", ""));
            System.out.println("   Сообщение: " + e.getMessage());
        }

        System.out.println("\n4. Безопасный способ обхода массива:");
        int[] safeArray = {10, 20, 30, 40};
        System.out.println("   Массив: " + Arrays.toString(safeArray));
        System.out.println("   Правильный цикл с условием i < array.length:");
        for (int i = 0; i < safeArray.length; i++) {
            System.out.println("   safeArray[" + i + "] = " + safeArray[i]);
        }
    }
}