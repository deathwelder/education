package ru.hui.pc1;

public class Cat {


    public static int count = 0;

    public static void main(String[] args) {

        Cat cat1 = new Cat();
        Cat.count++;

        Cat cat2 = new Cat();
        Cat.count++;

        System.out.println("The cat count is " + Cat.count);

    }
}
