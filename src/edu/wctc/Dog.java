package edu.wctc;

import java.io.Serializable;
import java.util.ArrayList;

public class Dog extends Animal implements Adoptable {

    private ArrayList stuff;

    private boolean isFriendly;

    @Override
    public void speak() {
        System.out.println("Woof");
    }

    public boolean isFriendly() {
        return isFriendly;
    }

    public void setFriendly(boolean friendly) {
        isFriendly = friendly;
    }

    @Override
    public double getAdoptionFee() {
        return 75;
    }
}
