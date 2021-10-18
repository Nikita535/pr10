package ru.mirea.lab2;

public class Complex {
    final double x;
    final double y;
    public Complex(double x, double y) {
        this.x = x;
        this.y = y;
    }


    //функция умножения комплексных чисел из инета
    public Complex mul(Complex b) {
        return new Complex(x * b.x - y * b.y, x * b.y + y * b.x);
    }


    @Override
    public String toString() {
        return "Complex = " + x + " + (" + y + "i)";
    }

    public static void main(String[] args) {
        ConcreteFactory test = new ConcreteFactory();
        System.out.println(test.createComplex(3, 2).mul(test.createComplex(3, 2)));
        //создаю комплексное число и умножаю его (.mul) на второе комплексное число
    }
}