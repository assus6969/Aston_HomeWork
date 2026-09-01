package org.example;

public class MyArrayDataException extends Exception {
    private int row;
    private int col;
    private String value;

    public MyArrayDataException(int row, int col, String value) {
        super("Некорректные данные в ячейке [" + row + "][" + col + "]: '" + value + "' не является числом");
        this.row = row;
        this.col = col;
        this.value = value;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public String getValue() {
        return value;
    }
}