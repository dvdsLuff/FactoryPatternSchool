import model.Footware;
import model.HighHeels;
import model.Sneaker;

public class FootwareFactory {

    public Footware create(String type, int size){
        if(type.equals("sneaker")){
            return new Sneaker(size);
        }else return new HighHeels(size);
        }
    }




