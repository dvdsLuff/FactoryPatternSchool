package model;

public class HighHeels implements Footware {

    private int size;
    private int speed;

    public HighHeels(int size, int speed) {
        this.size = size;
        this.speed = speed;

    }



    @Override
    public int getSize() {
        return size;
    }
    @Override
    public void setSize(int size) {
        this.size = size;
    }

   @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "High heels, stylish and classy or drunken and thrashy{" +
                "size=" + size +
                ", speed=" + speed +
                '}';
    }
}
