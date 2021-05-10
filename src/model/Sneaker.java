package model;

public class Sneaker implements Footware {

    private int size;
    private int speed;

    public Sneaker(int size, int speed) {
        this.size = size;
        this.speed = speed;

    }

    @Override
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "Sneaker Cool and sporty or tracksuit hoodlum " +
                "size=" + size +
                ", speed=" + speed +
                '}';
    }
}
