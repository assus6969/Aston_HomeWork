package org.example;

public class ArrayProcessor {

    public static int processArray(String[][] array) throws MyArraySizeException, MyArrayDataException {

        if (array == null) {
            throw new MyArraySizeException("Массив не может быть null");
        }

        if (array.length != 4) {
            throw new MyArraySizeException("Ожидается массив размером 4x4, получено " + array.length + " строк");
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                throw new MyArraySizeException("Строка " + i + " не инициализирована");
            }
            if (array[i].length != 4) {
                throw new MyArraySizeException(
                        "Ожидается массив размером 4x4, строка " + i + " имеет " + array[i].length + " столбцов"
                );
            }
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    int value = Integer.parseInt(array[i][j]);
                    sum += value;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j, array[i][j]);
                }
            }
        }

        return sum;
    }
}