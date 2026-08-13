package Lessen2;

public class Main {

    public static void main(String[] args) {

        // Задание 1
        PrintThreeWords.printThreeWords();
        System.out.println(" ");

        // Задание 2
        CheckSumSign.checkSumSign();
        System.out.println(" ");

        //Задание 3
        PrintColor.printColor();
        System.out.println(" ");

        //Задание 4
        CompareNumbers.compareNumbers();
        System.out.println(" ");

        //Задание 5
        System.out.println("Сумма:" + Validator.validator(3, 1));
        System.out.println(" ");

        //Задание 6
        PosNeg.posNeg(-1);
        System.out.println(" ");

        //Задание 7
        System.out.println(ReturnNumber.returnNumber(0));
        System.out.println(" ");

        //Задание 8
        StringInt.stringInt("Строка", 4);
        System.out.println(" ");

        //Задание 9
        System.out.println(YearTrue.yearTrue(2000));
        System.out.println(" ");

        //Задание 10
        Massiv.massiv();
        System.out.println(" ");

        //Задание 11
        ForMassiv.forMassiv();
        System.out.println(" ");

        //Задание 12
        MassivMultiplication.massivMultiplication();
        System.out.println(" ");

        //Задание 13
        DoubleMassive.doubleMassive();
        System.out.println(" ");

        //Задание 14
        int[] Array = Task14.createArray(3, 4);
        Task14.printArray(Array);
    }
}