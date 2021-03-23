package model;

public class Sneaker implements Footware {
    private int price;
    private int size;

    public Sneaker(int size) {
        this.size = size;
        this.price=150;
    }

    @Override
    public Footware create(int size) {
        return new Sneaker(size);
    }


}
