package model;

public class HighHeels implements Footware {

    private int size;

    public HighHeels(int size) {
        this.size = size;

    }



    @Override
    public Footware create(int size) {
        return new HighHeels(size);


    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
