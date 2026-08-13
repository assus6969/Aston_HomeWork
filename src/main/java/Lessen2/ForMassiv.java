package Lessen2;

public class ForMassiv {
    public static void forMassiv() {
        int [] array = new int[100];

    for (int i = 0; i < array.length; i++){
        array[i] = i + 1;
    }
    System.out.println("Массив от 1 до 100:");
    for (int i = 0; i < array.length; i++){
        System.out.print(array[i] + " ");
        if ((i + 1) % 10 == 0) {
            System.out.println();
        }
    }
    }
}
