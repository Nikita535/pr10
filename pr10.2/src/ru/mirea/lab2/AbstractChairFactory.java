package ru.mirea.lab2;

public interface AbstractChairFactory {
    public VictorianChair createVictorianChair(int age);
    public MagicianChair createMagicianChair();
    public FunctionalChair createFunctionalChair();
}

