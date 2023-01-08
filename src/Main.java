package com.company;

import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.devide.apply(a, b); //Возможна ошибка из-за деления на 0.
                                        // Поставил условие для переменной devide
        int d = calc.multiply.apply(1,1);
        int e = calc.pow.apply(2);
        int f = calc.abs.apply(9);

        System.out.print("результат деления a на b = ");
        calc.println.accept(c);

        System.out.print("результат сложения a + b = ");
        calc.println.accept(a);

        System.out.print("результат вычитания a - b = ");
        calc.println.accept(b);

        System.out.print("результат умножения a на b   = ");
        calc.println.accept(d);

        System.out.print("результат возведения в степень a   = ");
        calc.println.accept(e);

        System.out.print("результат квадратного корня из a = ");
        calc.println.accept(f);


    }
}
