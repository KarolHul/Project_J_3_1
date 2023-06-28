package org.example;

public class Main {
    public static void main(String[] args) {
        Cow cow = new Cow();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Animal[] animals = new Animal[3];
        animals[0] = cow;
        animals[1] = dog;
        animals[2] = cat;
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}