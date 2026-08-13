package Lessen2;

public class CheckSumSign {
    public static void checkSumSign() {
        int a = 1;
        int b = -2;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
}
