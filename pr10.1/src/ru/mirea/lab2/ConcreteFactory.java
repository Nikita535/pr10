package ru.mirea.lab2;

public class ConcreteFactory implements ComplexAbstractFactory {
    public Complex createComplex(){
        return new Complex(1, 1);
    };

    public Complex createComplex(int real, int image){
        return new Complex(real, image);
    };
}

