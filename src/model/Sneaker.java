package model;

public class Sneaker implements Footware {

    private int size;

    public Sneaker(int size) {
        this.size = size;
    }

    @Override
    public Footware create(int size) {
        return new Sneaker(size);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
