package HomeWork_2;

public abstract class Parent implements Human {
    String name;
    int year;

    public Parent(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int addJear() {
        year += 1;
        return year;
    }

    @Override
    public String toString() {
        return name + " " + year;
    }

    public abstract void dead();
}
