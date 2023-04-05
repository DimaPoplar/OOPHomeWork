package HomeWork_2;

import java.util.Random;

public class RoboParent extends Parent implements RoboHuman{
    int number;
    public RoboParent(String name, int number, int year) {
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
        this.number = ser;
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
