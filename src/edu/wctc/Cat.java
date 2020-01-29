package edu.wctc;

import java.io.Serializable;

public class Cat extends Animal implements Adoptable, Serializable {

    private Dog dog = new Dog();

    private static int catCount = 0;

    private int catId;

    public Cat() {
        catCount++;
        catId = catCount;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "catId=" + catId +
                "name=" + getName() +
                '}';
    }

    private int miceKilled;

    @Override
    public void speak() {
        System.out.println("Meow");
    }

    public int getMiceKilled() {
        return miceKilled;
    }

    public void setMiceKilled(int miceKilled) {
        this.miceKilled = miceKilled;
    }

    @Override
    public double getAdoptionFee() {
        return 50;
    }
}
