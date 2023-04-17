package HomeWork_2;

import java.util.Random;

public class RoboParent<T extends Number> extends Parent implements RoboHuman{
    T number;
    public RoboParent(String name, T number, int year) {
        super(name, year);
        this.number = number;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int addJear() {
        return this.year + 1;
    }

    @Override
    public int setNewNumber() {
        Random rd = new Random();
        int ser = rd.nextInt(1, 100);
        return ser;
    }

    @Override
    public String toString() {
        return number + " " + name + " " + year;
    }

    @Override
    public void dead() {
        System.out.println("dead");
    }
}
