package org.example;

public class Dog implements Animal{
    private String breed;
    private String color;
    private int age;

    @Override
    public void animalPlus() {
        System.out.println("Animal plus");

    }

    @Override
    public void animalMinus() {
        System.out.println("Animal minus");

    }

    public Dog(String breed, String color, int age) {
        this.breed = breed;
        this.color = color;
        this.age = age;
    }

    public Dog() {
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
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
