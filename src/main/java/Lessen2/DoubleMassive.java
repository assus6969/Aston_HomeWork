package Lessen2;

public class DoubleMassive {
    public static void doubleMassive() {
        int size = 5;
        int[][] array = new int[size][size];

        for (int i = 0; i < size; i++) {
            array[i][i] = 1;
        }

        System.out.println("Квадратный массив " + size + "×" + size + " с диагональю из 1:");
        printMatrix(array);
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
