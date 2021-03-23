import model.Sneaker;

public class Main {
    public static void main(String[] args) {
        FootwareFactory footwareFactory = new FootwareFactory();
       Sneaker sneaker = (Sneaker) footwareFactory.create("sneaker",10);


    }
}
