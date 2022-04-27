package ru.job4j.ood.lsp.parking;

public class Car implements Vehicle {
    public static final int SIZE = 1;
    private String number;

    public Car(String number) {
        this.number = number;
    }

    @Override
    public String getNumber() {
        return number;
    }

    @Override
    public int getSize() {
        return SIZE;
    }
}
