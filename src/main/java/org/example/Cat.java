package org.example;

public class Cat implements Animal{
    private String breed;
    private String color;
    private int age;

    @Override
    public void animalPlus() {
        System.out.println("Cat is added-init method is working...");

    }

    @Override
    public void animalMinus() {
        System.out.println("Cat is cancelled-destroy method is working...");
    }

    public Cat(String breed, String color, int age) {
        this.breed = breed;
        this.color = color;
        this.age = age;
    }

    public Cat() {
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
