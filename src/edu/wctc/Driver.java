package edu.wctc;

import java.io.*;
import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Cat cat = new Cat();
        cat.setName("Generic cat");
        cat.setMiceKilled(5);
        Cat charlie = new Cat();
        charlie.setName("Charlie");
        charlie.setMiceKilled(1);
        Cat waffles = new Cat();
        waffles.setName("Waffles");

        System.out.println(cat);
        System.out.println(charlie);
        System.out.println(waffles);

        FileOutputStream fos = new FileOutputStream("cats.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(cat);
        oos.writeObject(charlie);
        oos.writeObject(waffles);

        oos.close();

        ArrayList<Cat> cats = new ArrayList<>();

        FileInputStream fis = new FileInputStream("cats.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Object obj;

        try {
            while ((obj = ois.readObject()) != null) {
                Cat aCat = (Cat) obj;
                cats.add(aCat);
            }
        } catch (EOFException e) {
            // Do nothing
        }

        for (int i = 0; i < cats.size(); i++) {
            Cat aCat = cats.get(i);
            System.out.println(aCat);
        }

        for (Cat aCat : cats) {
            System.out.println(aCat);
        }

    }


}
